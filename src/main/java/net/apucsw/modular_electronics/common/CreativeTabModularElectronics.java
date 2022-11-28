/*
 * This project is fully coded in IntelliJ IDEA.
 *
 * All the code of this project is based on Mekanism mod.
 * Some code copyright of this project belongs to the developers of Mekanism mod.
 */
package net.apucsw.modular_electronics.common;

import net.apucsw.modular_electronics.common.registries.ModularElectronicsItems;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

import javax.annotation.Nonnull;

public class CreativeTabModularElectronics extends CreativeModeTab {
	public CreativeTabModularElectronics() { super(ModularElectronics.MODID); }

	@Nonnull
	@Override
	public ItemStack makeIcon() { return ModularElectronicsItems.MODULAR_SMARTPHONE.getItemStack(); }

	@Nonnull
	@Override
	public Component getDisplayName() {
		return ModularElectronicsLang.MODULAR_ELECTRONICS.translate();
	}
}
