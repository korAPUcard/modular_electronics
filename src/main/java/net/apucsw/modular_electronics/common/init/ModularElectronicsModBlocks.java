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
import mekanism.common.Mekanism;
import mekanism.common.block.prefab.BlockFactoryMachine;
import mekanism.common.content.blocktype.FactoryType;
import mekanism.common.item.block.machine.ItemBlockFactory;
import mekanism.common.registration.impl.BlockDeferredRegister;
import mekanism.common.registration.impl.BlockRegistryObject;
import mekanism.common.resource.IResource;
import mekanism.common.resource.ore.OreBlockType;
import mekanism.common.resource.ore.OreType;
import mekanism.common.tier.FactoryTier;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

//import net.apucsw.powered_defences.block.ForcefieldBarrierVerticalSingleShieldEmitBlock;		//References
import net.apucsw.modular_electronics.common.ModularElectronicsMod;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModularElectronicsModBlocks {
	/*
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ModularElectronicsMod.MODID);

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			//
		}
	}
	 */
	private ModularElectronicsModBlocks() {

	}

	public static final BlockDeferredRegister BLOCKS = new BlockDeferredRegister(ModularElectronicsMod.MODID);

	public static final Map<IResource, BlockRegistryObject<?, ?>> PROCESSED_RESOURCE_BLOCKS = new LinkedHashMap<>();
	public static final Map<OreType, OreBlockType> ORES = new LinkedHashMap<>();

	private static final Table<FactoryTier, FactoryType, BlockRegistryObject<BlockFactoryMachine.BlockFactory<?>, ItemBlockFactory>> FACTORIES = HashBasedTable.create();
}
