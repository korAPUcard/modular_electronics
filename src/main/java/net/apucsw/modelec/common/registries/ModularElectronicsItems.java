package net.apucsw.modelec.common.registries;

import mekanism.api.functions.ConstantPredicates;
import mekanism.common.attachments.containers.ContainerType;
import mekanism.common.attachments.containers.energy.ComponentBackedNoClampEnergyContainer;
import mekanism.common.attachments.containers.energy.EnergyContainersBuilder;
import mekanism.common.capabilities.energy.BasicEnergyContainer;
import mekanism.common.content.gear.shared.ModuleEnergyUnit;
import mekanism.common.registration.impl.ItemRegistryObject;
import net.apucsw.modelec.common.ModularElectronics;
import net.apucsw.modelec.common.items.ItemSmartphone;

import static net.apucsw.modelec.common.ModularElectronics.ITEMS;

public class ModularElectronicsItems {
    public static final ItemRegistryObject<ItemSmartphone> SMARTPHONE = ITEMS.registerUnburnable("smartphone", ItemSmartphone::new)
            .addAttachedContainerCapabilities(ContainerType.ENERGY, () -> EnergyContainersBuilder.builder()
                    .addContainer((type, attachedTo, containerIndex) -> new ComponentBackedNoClampEnergyContainer(attachedTo, containerIndex, BasicEnergyContainer.manualOnly,
                            ConstantPredicates.alwaysTrue(), () -> ModuleEnergyUnit.getChargeRate(attachedTo, ModularElectronics.devconf.smartphoneBaseChargeRate),
                            () -> ModuleEnergyUnit.getEnergyCapacity(attachedTo, ModularElectronics.devconf.smartphoneBaseEnergyCapacity)))
                    .build(), ModularElectronics.devconf);
}
