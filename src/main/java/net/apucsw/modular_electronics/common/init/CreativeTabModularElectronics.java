/*
 * This project is fully coded in IntelliJ IDEA.
 *
 * All the code of this project is based on Mekanism mod.
 * Some code copyright of this project belongs to the developers of Mekanism mod.
 */
package net.apucsw.modular_electronics.common.init;

import net.apucsw.modular_electronics.common.registries.ModularElectronicsItems;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CreativeTabModularElectronics {
	public static CreativeModeTab TAB_MODULAR_ELECTRONICS;

	public static void load() {
		TAB_MODULAR_ELECTRONICS = new CreativeModeTab("tab_modular_electronics") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ModularElectronicsItems.MODULAR_SMARTPHONE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
