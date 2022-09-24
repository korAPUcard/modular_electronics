/*
 *		Originally generated from MCreator.
 *
 *		This script file is just copied file from my 7th Minecraft Mod Project called "Powered Defences".
 *
 *		This project is fully coded in IntelliJ IDEA.
 *
 */
package net.apucsw.modular_electronics;

import net.apucsw.modular_electronics.common.util.ModVersioning;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.apucsw.modular_electronics.common.init.ModularElectronicsModTabs;
import net.apucsw.modular_electronics.common.init.ModularElectronicsModItems;
import net.apucsw.modular_electronics.common.init.ModularElectronicsModBlocks;
import net.apucsw.modular_electronics.common.init.ModularElectronicsModBlockEntities;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod(ModularElectronicsMod.MODID)
public class ModularElectronicsMod {
	public static final Logger LOGGER = LogManager.getLogger(ModularElectronicsMod.class);
	public static final String MODID = "modular_electronics";
	//public static final String MOD_VERSION = "0.1.0";
	public ModVersioning versionNumber;
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public ModularElectronicsMod() {
		ModularElectronicsModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ModularElectronicsModBlocks.REGISTRY.register(bus);
		ModularElectronicsModItems.REGISTRY.register(bus);

		ModularElectronicsModBlockEntities.REGISTRY.register(bus);

	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
