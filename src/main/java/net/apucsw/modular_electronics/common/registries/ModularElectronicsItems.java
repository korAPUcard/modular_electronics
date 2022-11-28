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
import mekanism.common.resource.IResource;
import mekanism.common.resource.MiscResource;
import mekanism.common.resource.PrimaryResource;
import mekanism.common.resource.ResourceType;

import mekanism.common.util.EnumUtils;
import net.apucsw.modular_electronics.common.item.ItemModularSmartphone;
import net.minecraft.world.item.Item;

import net.apucsw.modular_electronics.common.ModularElectronics;

public class ModularElectronicsItems {
	public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(ModularElectronics.MODID);
	public static final Table<ResourceType, PrimaryResource, ItemRegistryObject<Item>> PROCESSED_RESOURCES = HashBasedTable.create();

	public static final ItemRegistryObject<ItemModularSmartphone> MODULAR_SMARTPHONE = ITEMS.register("modular_smartphone", ItemModularSmartphone::new);
	public static final ItemRegistryObject<Item> REFINED_LITHIUM_INGOT = registerResource(ResourceType.INGOT, MiscResource.LITHIUM);

	static {
		for (ResourceType type : EnumUtils.RESOURCE_TYPES) {
			for (PrimaryResource resource : EnumUtils.PRIMARY_RESOURCES) {
				if (resource.has(type)) {
					PROCESSED_RESOURCES.put(type, resource, registerResource(type, resource));
				}
			}
		}
	}

	private static ItemRegistryObject<Item> registerResource(ResourceType type, IResource resource) {
		return ITEMS.register(type.getRegistryPrefix() + "_" + resource.getRegistrySuffix());
	}
	/*
	private static ItemRegistryObject<Item> registerExplodableWhenBurningResource(ResourceType type, IResource resource) {
		return ITEMS.registerExplodableWhenBurning(type.getRegistryPrefix() + "_" + resource.getRegistrySuffix());
	}
	*/
}
