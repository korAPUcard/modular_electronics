package net.apucsw.modular_electronics.common.item;

import mekanism.common.config.MekanismConfig;
import mekanism.common.item.ItemEnergized;
import net.apucsw.modular_electronics.common.init.ModularElectronicsModKeyMappings;
import net.apucsw.modular_electronics.common.init.ModularElectronicsModTabs;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.network.chat.Component;

import java.util.List;
public class ItemBasicModularSmartphone extends ItemEnergized {
    /*
    public ItemBasicModularSmartphone() {
        super(new Item.Properties().tab(ModularElectronicsModTabs.TAB_MODULAR_ELECTRONICS).stacksTo(1).rarity(Rarity.COMMON));
    }
    */
    public ItemBasicModularSmartphone(Properties properties) {
        super(MekanismConfig.gear.mekaToolBaseChargeRate, MekanismConfig.gear.mekaToolBaseEnergyCapacity, properties.tab(ModularElectronicsModTabs.TAB_MODULAR_ELECTRONICS).rarity(Rarity.COMMON).setNoRepair());
    }

    public boolean canAttackBlock(BlockState p_43291_, Level p_43292_, BlockPos p_43293_, Player p_43294_) {
        return !p_43294_.isCreative();
    }

    @Override
    public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
        return 0F;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        if (ModularElectronicsModKeyMappings.SHOW_DESCRIPTION.isDown()) {
            list.add(new TranslatableComponent("description.modular_electronics.item.basic_modular_smartphone"));
        } else {
            list.add(new TranslatableComponent("description.modular_electronics.tooltip.key.show_description"));
        }
        if (ModularElectronicsModKeyMappings.SHOW_DETAIL_INFORMATION.isDown()) {
            //list.add(new TranslatableComponent("description.modular_electronics.item.basic_modular_smartphone.detail"));
        } else {
            list.add(new TranslatableComponent("description.modular_electronics.tooltip.key.show_detail_information"));
        }
    }
}
