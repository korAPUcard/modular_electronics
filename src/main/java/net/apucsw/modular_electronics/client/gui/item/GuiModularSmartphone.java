package net.apucsw.modular_electronics.client.gui.item;

import mekanism.api.energy.IEnergyContainer;
import mekanism.client.gui.GuiMekanism;
import mekanism.client.gui.element.bar.GuiBar;
import mekanism.client.gui.element.bar.GuiVerticalPowerBar;
import mekanism.client.gui.element.window.GuiWindow;
import mekanism.common.inventory.container.SelectedWindowData;
import mekanism.common.util.StorageUtils;
import mekanism.common.util.text.EnergyDisplay;
import net.apucsw.modular_electronics.common.inventory.container.item.ModularSmartphoneContainer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public class GuiModularSmartphone extends GuiMekanism<ModularSmartphoneContainer> {
    public GuiModularSmartphone(ModularSmartphoneContainer container, Inventory inv, Component title) {
        super(container, inv, title);
        imageHeight = 172;
        titleLabelY = 4;
    }

    @Override
    protected void addGuiElements() {
        super.addGuiElements();
        //addRenderableWidget(new GuiWindow(0, 0, 120, 200, SelectedWindowData.WindowType.UNSPECIFIED));
        addRenderableWidget(new GuiVerticalPowerBar(this, new GuiBar.IBarInfoHandler() {
            @Override
            public Component getTooltip() {
                IEnergyContainer container = StorageUtils.getEnergyContainer(menu.getStack(), 0);
                return container == null ? EnergyDisplay.ZERO.getTextComponent() : EnergyDisplay.of(container).getTextComponent();
            }

            @Override
            public double getLevel() {
                IEnergyContainer container = StorageUtils.getEnergyContainer(menu.getStack(), 0);
                return container == null ? 0 : container.getEnergy().divideToLevel(container.getMaxEnergy());
            }
        }, 158, 26));
    }
}
