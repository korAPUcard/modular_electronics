/*
 *		Originally generated from MCreator.
 *
 *		This script file is just copied file from my 7th Minecraft Mod Project called "Powered Defences".
 *
 *		This project is fully coded in IntelliJ IDEA.
 *
 */
package net.apucsw.modular_electronics.common.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

//import net.apucsw.modular_electronics.item.NetheritePlateItem;	References
import net.apucsw.modular_electronics.common.item.BasicModularSmartphoneItem;
import net.apucsw.modular_electronics.ModularElectronicsMod;

public class ModularElectronicsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ModularElectronicsMod.MODID);
	public static final RegistryObject<Item> BASIC_MODULAR_SMARTPHONE = REGISTRY.register("basic_modular_smartphone",
			() -> new BasicModularSmartphoneItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
