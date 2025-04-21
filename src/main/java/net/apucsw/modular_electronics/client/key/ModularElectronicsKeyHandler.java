package net.apucsw.modular_electronics.client.key;

import net.apucsw.modular_electronics.common.MELang;
import net.apucsw.modular_electronics.common.ModularElectronics;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;
import top.theillusivec4.curios.api.SlotContext;

public class ModularElectronicsKeyHandler {
    public static final KeyMapping quickPDAKey = new MEKeyBindingBuilder()
            .description(MELang.KEY_QUICK_PDA).conflictInGame()
            .keyCode(GLFW.GLFW_KEY_0)
            .onKeyDown((kb, isRepeat) -> handlePotentialQuickDeviceItem(EquipmentSlot.OFFHAND)).build();

    public static void registerKeybindings(RegisterKeyMappingsEvent event) {
        ClientRegistrationUtil.registerKeyBindings(event, quickPDAKey);
    }

    private static void handlePotentialQuickDeviceItem(EquipmentSlot slot) {
        Player player = Minecraft.getInstance().player;
        if (player != null) {
            if (IQuickDeviceItem.isQuickItem(player, slot)) {
                ModularElectronics.packetHandler().sendToServer(new PacketModeChange(slot, player.isShiftKeyDown()));
                SoundHandler.playSound(MESounds.HOLDING);
            } else if (ModularElectronics.hooks.CuriosLoaded) {
                CuriosIntegration.findFirstCurioAsResult(player, stack -> {
                    if (stack.canEquip(slot, player) && IQuickDeviceItem.isModeItem(stack, slot)) {
                        return !(stack.getItem() instanceof IEnergyItem item) || item.hasEnergy(stack);
                    }
                    return false;
                }).ifPresent(result -> {
                    SlotContext slotContext = result.slotContext();
                    ModularElectronics.packetHandler().sendToServer(new PacketModeChangeCurios(slotContext.identifier(), slotContext.index(), player.isShiftKeyDown()));
                    SoundHandler.playSound(MESounds.HOLDING);
                });
            }
        }
    }
}
