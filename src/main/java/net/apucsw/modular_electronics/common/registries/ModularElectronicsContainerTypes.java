package net.apucsw.modular_electronics.common.registries;

import mekanism.common.registration.impl.ContainerTypeDeferredRegister;
import mekanism.common.registration.impl.ContainerTypeRegistryObject;
import net.apucsw.modular_electronics.common.inventory.container.item.ModularSmartphoneContainer;
import net.apucsw.modular_electronics.common.item.ItemModularSmartphone;

public class ModularElectronicsContainerTypes {
    private ModularElectronicsContainerTypes() {

    }
    public static final ContainerTypeDeferredRegister CONTAINER_TYPES = new ContainerTypeDeferredRegister("modular_electronics");
    //Items
    public static final ContainerTypeRegistryObject<ModularSmartphoneContainer> MODULAR_SMARTPHONE = CONTAINER_TYPES.register(ModularElectronicsItems.MODULAR_SMARTPHONE, ItemModularSmartphone.class, ModularSmartphoneContainer::new);
}
