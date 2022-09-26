package net.apucsw.modular_electronics.common.registries;

import mekanism.common.registration.impl.ContainerTypeDeferredRegister;
import mekanism.common.registration.impl.ContainerTypeRegistryObject;
import net.apucsw.modular_electronics.common.init.ModularElectronicsModItems;
import net.apucsw.modular_electronics.common.inventory.container.item.ModularSmartphoneContainer;
import net.apucsw.modular_electronics.common.item.ItemModularSmartphone;

public class ModularElectronicsContainerTypes {
    public static final ContainerTypeDeferredRegister CONTAINER_TYPES = new ContainerTypeDeferredRegister("modular_electronics");
    public static final ContainerTypeRegistryObject<ModularSmartphoneContainer> MODULAR_SMARTPHONE;

    private ModularElectronicsContainerTypes() {

    }

    static {
        MODULAR_SMARTPHONE = CONTAINER_TYPES.register(ModularElectronicsModItems.MODULAR_SMARTPHONE, ItemModularSmartphone.class, ModularSmartphoneContainer::new);
    }
}
