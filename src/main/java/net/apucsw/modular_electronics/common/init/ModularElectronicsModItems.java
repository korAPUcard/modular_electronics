/*
 *		Originally generated from MCreator.
 *
 *		This script file is just copied file from my 7th Minecraft Mod Project called "Powered Defences".
 *
 *		This project is fully coded in IntelliJ IDEA.
 *
 */
package net.apucsw.modular_electronics.common.init;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import mekanism.common.registration.impl.ItemDeferredRegister;
import mekanism.common.registration.impl.ItemRegistryObject;
import mekanism.common.resource.PrimaryResource;
import mekanism.common.resource.ResourceType;

import net.minecraft.world.item.Item;

//import net.apucsw.modular_electronics.item.NetheritePlateItem;	References
import net.apucsw.modular_electronics.common.item.ItemBasicModularSmartphone;
import net.apucsw.modular_electronics.common.ModularElectronicsMod;

public class ModularElectronicsModItems {
	/*
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ModularElectronicsMod.MODID);
	public static final RegistryObject<Item> BASIC_MODULAR_SMARTPHONE = REGISTRY.register("basic_modular_smartphone",
			() -> new ItemBasicModularSmartphone());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
	 */
	public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(ModularElectronicsMod.MODID);
	public static final Table<ResourceType, PrimaryResource, ItemRegistryObject<Item>> PROCESSED_RESOURCES = HashBasedTable.create();

	public static final ItemRegistryObject<ItemBasicModularSmartphone> BASIC_MODULAR_SMARTPHONE = ITEMS.register("basic_modular_smartphone", ItemBasicModularSmartphone::new);
}
