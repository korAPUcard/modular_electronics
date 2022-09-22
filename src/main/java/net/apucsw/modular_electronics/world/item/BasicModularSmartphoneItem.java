package net.apucsw.modular_electronics.world.item;

import net.apucsw.modular_electronics.init.ModularElectronicsModKeyMappings;
import net.apucsw.modular_electronics.init.ModularElectronicsModTabs;

import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.network.chat.Component;

import java.util.List;

public class BasicModularSmartphoneItem extends Item {
    public BasicModularSmartphoneItem() {
        super(new Item.Properties().tab(ModularElectronicsModTabs.TAB_MODULAR_ELECTRONICS).stacksTo(1).rarity(Rarity.COMMON));
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
    }
}
