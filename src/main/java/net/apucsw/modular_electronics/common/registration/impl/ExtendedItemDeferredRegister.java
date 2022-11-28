package net.apucsw.modular_electronics.common.registration.impl;

import mekanism.api.providers.IItemProvider;
import mekanism.common.registration.WrappedForgeDeferredRegister;
import net.apucsw.modular_electronics.common.ModularElectronics;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExtendedItemDeferredRegister extends WrappedForgeDeferredRegister<Item> {
    private final List<IItemProvider> allItems = new ArrayList<>();

    public ExtendedItemDeferredRegister(String modid) {
        super(modid, ForgeRegistries.ITEMS);
    }

    public static Item.Properties getMEBaseProperties() {
        return (new Item.Properties()).tab(ModularElectronics.tabModularElectronics);
    }
}
