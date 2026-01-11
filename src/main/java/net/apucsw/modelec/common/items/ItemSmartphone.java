package net.apucsw.modelec.common.items;

import mekanism.api.gear.IModuleHelper;
import mekanism.api.radial.IRadialDataHelper;
import mekanism.api.radial.RadialData;
import mekanism.api.security.IBlockSecurityUtils;
import mekanism.api.text.EnumColor;
import mekanism.client.key.MekKeyHandler;
import mekanism.client.key.MekanismKeyHandler;
import mekanism.common.Mekanism;
import mekanism.common.MekanismLang;
import mekanism.common.content.gear.IRadialModuleContainerItem;
import mekanism.common.content.gear.ModuleHelper;
import mekanism.common.item.ItemEnergized;
import mekanism.common.util.StorageUtils;
import net.apucsw.modelec.api.ModularElectronicsAbilities;
import net.apucsw.modelec.common.ModularElectronics;
import net.apucsw.modelec.common.registries.ModularElectronicsSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.neoforged.neoforge.common.ItemAbility;
import net.neoforged.neoforge.common.util.Lazy;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ItemSmartphone extends ItemEnergized implements IRadialModuleContainerItem {
    private static final ResourceLocation RADIAL_ID = ModularElectronics.rl("smartphone");

    private static final Lazy<RadialData<ItemSmartphone.InteractionMode>> LAZY_RADIAL_DATA = Lazy.of(() ->
            IRadialDataHelper.INSTANCE.dataForEnum(Mekanism.rl("interaction_mode"), ItemSmartphone.InteractionMode.class));

    public ItemSmartphone(Properties properties) {
        super(IModuleHelper.INSTANCE.applyModuleContainerProperties(properties.rarity(Rarity.EPIC).setNoRepair().stacksTo(1)));
    }

    @Override
    public void onDestroyed(@NotNull ItemEntity item, @NotNull DamageSource damageSource) {
        // 스마트폰이 드롭된 상태에서 파괴될 경우 모듈 드롭 처리
        ModuleHelper.INSTANCE.dropModuleContainerContents(item, damageSource);

        Level level = item.level();

        // 클라이언트에서 처리하지 않음
        if (level.isClientSide()) {
            return;
        }

        // 파괴 원인이 불, 용암, 폭발일 경우
        boolean isFire = damageSource.is(DamageTypeTags.IS_FIRE);
        boolean isExplosion = damageSource.is(DamageTypeTags.IS_EXPLOSION);
        boolean isLava = damageSource.getMsgId().equals("lava");

        if (isFire || isExplosion || isLava) {
            // 작은 폭발 발생 (파괴는 하지 않음, 단순 효과만)
            level.explode(
                    null, // 폭발 주체 (null이면 자연 현상처럼 처리)
                    item.getX(),
                    item.getY(),
                    item.getZ(),
                    2.0F, // 폭발 크기
                    Level.ExplosionInteraction.TNT // TNT 수준의 파괴력
            );

            // 커스텀 사운드 재생
            level.playSound(
                    null, // 플레이어 null이면 모두에게 들림
                    item.blockPosition(), // 재생 위치
                    ModularElectronicsSounds.ELECTRICAL_EXPLOSION.get(), // 사운드 이벤트
                    SoundSource.HOSTILE, // 사운드 카테고리
                    1.0F, // 볼륨
                    1.0F // 피치
            );
        }
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull Item.TooltipContext context, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        if (MekKeyHandler.isKeyPressed(MekanismKeyHandler.detailsKey)) {
            addModuleDetails(stack, tooltip);
        } else {
            StorageUtils.addStoredEnergy(stack, tooltip, true);
            tooltip.add(MekanismLang.HOLD_FOR_MODULES.translateColored(EnumColor.GRAY, EnumColor.INDIGO, MekanismKeyHandler.detailsKey.getTranslatedKeyMessage()));
        }
    }

    @Override
    public boolean canPerformAction(@NotNull ItemStack stack, @NotNull ItemAbility action) {
        if (action == ModularElectronicsAbilities.DEVICE_DEFAULT) {
            return getMode(stack);
        } else if (action == ModularElectronicsAbilities.DEVICE_CONNECT) {
            return currentMode == ModularElectronicsAbilities.DEVICE_CONNECT;
        } else if (action == ModularElectronicsAbilities.DEVICE_SCAN) {
            return currentMode == ModularElectronicsAbilities.DEVICE_SCAN;
        }
        return super.canPerformAction(stack, action);
    }

    @NotNull
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        Level level = context.getLevel();

        if (!level.isClientSide && player != null) {
            BlockPos pos = context.getClickedPos();
            Direction side = context.getClickedFace();
            ItemStack stack = context.getItemInHand();
            BlockEntity blockEntity = level.getBlockEntity(pos);

            SmartphoneMode mode = getMode(stack);

            // 연결 가능한 블록일 경우
            if (blockEntity instanceof ISmartConnectable connectable) {
                if (!IBlockSecurityUtils.INSTANCE.canAccessOrDisplayError(player, level, pos, blockEntity)) {
                    return InteractionResult.FAIL;
                }

                if (mode == SmartphoneMode.CONNECT) {
                    if (!player.isShiftKeyDown()) {
                        connectable.connectDevice(stack);
                        player.displayClientMessage(Component.literal("기기에 연결되었습니다."), true);
                    } else {
                        connectable.disconnectDevice(stack);
                        player.displayClientMessage(Component.literal("기기 연결이 해제되었습니다."), true);
                    }
                    return InteractionResult.SUCCESS;

                } else if (mode == SmartphoneMode.SCAN) {
                    player.displayClientMessage(Component.literal("디바이스 스캔 결과: " + connectable.getStatus()), true);
                    return InteractionResult.SUCCESS;

                } else if (mode == SmartphoneMode.HACK) {
                    if (player.isCreative()) {
                        connectable.overrideAccess();
                        player.displayClientMessage(Component.literal("기기 해킹 성공"), true);
                        return InteractionResult.SUCCESS;
                    } else {
                        player.displayClientMessage(Component.literal("권한이 부족합니다."), true);
                        return InteractionResult.FAIL;
                    }
                }
            }

            // 기본 블록에는 반응 없음
            return InteractionResult.PASS;
        }

        return InteractionResult.PASS;
    }

    @Override
    public void addHUDStrings(List<Component> list, Player player, ItemStack stack, EquipmentSlot slotType) {
        list.add(MekanismLang.MODE.translateColored(EnumColor.PINK, getMode(stack)));
    }

    @Override
    public void changeMode(@NotNull Player player, @NotNull ItemStack stack, int shift, DisplayChange displayChange) {
        ItemSmartphone.InteractionMode mode = getMode(stack);
        ItemSmartphone.InteractionMode newMode = mode.adjust(shift);
        if (mode != newMode) {
            setMode(stack, player, newMode);
            displayChange.sendMessage(player, newMode, MekanismLang.CONFIGURE_STATE::translate);
        }
    }

    @Override
    public Component getTextComponent() {
        if (transmissionType == null) {
            return langEntry.translateColored(color);
        }
        return langEntry.translateColored(color, transmissionType);
    }

    @Override
    public EnumColor color() {
        return color;
    }

    public boolean isInteraction() {
        return interaction;
    }

    @Override
    public ResourceLocation getRadialIdentifier() {
        return null;
    }
}
