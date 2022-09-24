/*
 *		Originally generated from MCreator.
 *
 *		This script file is just copied file from my 7th Minecraft Mod Project called "Powered Defences".
 *
 *		This project is fully coded in IntelliJ IDEA.
 *
 */
/*
 * The code of this source file is referenced and copied from Mekanism mod's code.
 * The some code copyright of this source file belongs to the developers of Mekanism mod.
 */
package net.apucsw.modular_electronics.common.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ModularElectronicsModTabs {
	public static CreativeModeTab TAB_MODULAR_ELECTRONICS;

	public static void load() {
		TAB_MODULAR_ELECTRONICS = new CreativeModeTab("tab_modular_electronics") {
			@Override
			public ItemStack makeIcon() {
				//return new ItemStack(ModularElectronicsModItems.BASIC_MODULAR_SMARTPHONE.get());
				return ModularElectronicsModItems.BASIC_MODULAR_SMARTPHONE.getItemStack();
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
