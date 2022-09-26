package net.apucsw.modular_electronics.client.gui.item;

import mekanism.client.gui.GuiMekanism;
import net.apucsw.modular_electronics.common.inventory.container.item.ModularSmartphoneContainer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public class GuiModularSmartphone extends GuiMekanism<ModularSmartphoneContainer> {
    public GuiModularSmartphone(ModularSmartphoneContainer container, Inventory inv, Component title) {
        super(container, inv, title);
        imageHeight += 5;
    }

    @Override
    protected void addGuiElements() {
        super.addGuiElements();
    }
}
