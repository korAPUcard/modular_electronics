package net.apucsw.modular_electronics.common.inventory.container.item;

import mekanism.common.inventory.container.item.MekanismItemContainer;
import net.apucsw.modular_electronics.common.registries.ModularElectronicsContainerTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;

public class ModularSmartphoneContainer extends MekanismItemContainer {
    public ModularSmartphoneContainer(int id, Inventory inv, InteractionHand hand, ItemStack stack) {
        super(ModularElectronicsContainerTypes.MODULAR_SMARTPHONE, id, inv, hand, stack);
    }

    public ItemStack getStack() {
        return stack;
    }
}
