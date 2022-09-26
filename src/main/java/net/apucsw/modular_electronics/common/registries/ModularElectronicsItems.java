/*
 *		Originally generated from MCreator.
 *
 *		This script file is just copied file from my 7th Minecraft Mod Project called "Powered Defences".
 *
 *		This project is fully coded in IntelliJ IDEA.
 *
 */
package net.apucsw.modular_electronics.common.registries;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import mekanism.common.registration.impl.ItemDeferredRegister;
import mekanism.common.registration.impl.ItemRegistryObject;
import mekanism.common.resource.PrimaryResource;
import mekanism.common.resource.ResourceType;

import net.apucsw.modular_electronics.common.item.ItemModularSmartphone;
import net.minecraft.world.item.Item;

import net.apucsw.modular_electronics.common.ModularElectronicsMod;

public class ModularElectronicsItems {
	public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(ModularElectronicsMod.MODID);
	public static final Table<ResourceType, PrimaryResource, ItemRegistryObject<Item>> PROCESSED_RESOURCES = HashBasedTable.create();

	public static final ItemRegistryObject<ItemModularSmartphone> MODULAR_SMARTPHONE = ITEMS.register("modular_smartphone", ItemModularSmartphone::new);
}
