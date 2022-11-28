/*
 *		Originally generated from MCreator.
 *
 *		This script file is just copied file from my 7th Minecraft Mod Project called "Powered Defences".
 *
 *		This project is fully coded in IntelliJ IDEA.
 *
 */
package net.apucsw.modular_electronics.common;

import net.apucsw.modular_electronics.api.ModularElectronicsAPI;
import net.apucsw.modular_electronics.common.config.ModularElectronicsConfig;
import net.apucsw.modular_electronics.common.registries.ModularElectronicsBlocks;
import net.apucsw.modular_electronics.common.util.ModVersioning;
import net.minecraftforge.fml.ModLoadingContext;
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

import net.apucsw.modular_electronics.common.registries.ModularElectronicsItems;
//import net.apucsw.modular_electronics.common.init.ModularElectronicsModBlockEntities;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod(ModularElectronics.MODID)
public class ModularElectronics {
	public static final String MODID = ModularElectronicsAPI.MODULAR_ELECTRONICS_MODID;
	public static final String MOD_NAME = "Modular Electronics";
	public static final String LOG_TAG = '[' + MOD_NAME + ']';
	private static final String PROTOCOL_VERSION = "1";
	//public static final Logger LOGGER = LogManager.getLogger(ModularElectronics.class);
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	//private final PacketHandler packetHandler;
	public static final Logger logger = LogManager.getLogger(MOD_NAME);
	private static int messageID = 0;

	public ModVersioning versionNumber;

	public static final CreativeTabModularElectronics tabModularElectronics = new CreativeTabModularElectronics();

	public ModularElectronics() {
		//instance = this;
		ModularElectronicsConfig.registerConfigs(ModLoadingContext.get());

		//CreativeTabModularElectronics.load();
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModularElectronicsItems.ITEMS.register(modEventBus);
		ModularElectronicsBlocks.BLOCKS.register(modEventBus);
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public static ResourceLocation rl(String path) {
		return new ResourceLocation("modular_electronics", path);
	}
}
