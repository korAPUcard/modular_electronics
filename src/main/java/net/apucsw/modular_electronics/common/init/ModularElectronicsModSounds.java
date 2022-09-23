/*
 *		Originally generated from MCreator.
 *
 *		This script file is just copied file from my 7th Minecraft Mod Project called "Powered Defences".
 *
 *		This project is fully coded in IntelliJ IDEA.
 *
 */
package net.apucsw.modular_electronics.common.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModularElectronicsModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		/*		References
		REGISTRY.put(new ResourceLocation("powered_defences", "forcefield_barrier_loop"),
				new SoundEvent(new ResourceLocation("powered_defences", "forcefield_barrier_loop")));
		REGISTRY.put(new ResourceLocation("powered_defences", "forcefield_barrier_touch_loop"),
				new SoundEvent(new ResourceLocation("powered_defences", "forcefield_barrier_touch_loop")));
		REGISTRY.put(new ResourceLocation("powered_defences", "forcefield_barrier_activated"),
				new SoundEvent(new ResourceLocation("powered_defences", "forcefield_barrier_activated")));
		REGISTRY.put(new ResourceLocation("powered_defences", "forcefield_barrier_deactivated"),
				new SoundEvent(new ResourceLocation("powered_defences", "forcefield_barrier_deactivated")));
		*/
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
