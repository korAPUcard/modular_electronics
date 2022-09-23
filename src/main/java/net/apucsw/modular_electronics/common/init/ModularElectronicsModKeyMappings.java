/*
 *		Originally generated from MCreator.
 *
 *		This script file is just copied file from my 7th Minecraft Mod Project called "Powered Defences".
 *
 *		This project is fully coded in IntelliJ IDEA.
 *
 */
package net.apucsw.modular_electronics.common.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ModularElectronicsModKeyMappings {
	public static final KeyMapping SHOW_DESCRIPTION = new KeyMapping(
			"key.modular_electronics.show_description",
			GLFW.GLFW_KEY_LEFT_SHIFT,
			"key.categories.modular_electronics");
	public static final KeyMapping SHOW_DETAIL_INFORMATION = new KeyMapping(
			"key.modular_electronics.show_detail_information",
			GLFW.GLFW_KEY_LEFT_ALT,
			"key.categories.modular_electronics");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(SHOW_DESCRIPTION);
		ClientRegistry.registerKeyBinding(SHOW_DETAIL_INFORMATION);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
			}
		}
	}
}
