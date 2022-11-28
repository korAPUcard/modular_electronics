/*
 *		Originally generated from MCreator.
 *
 *		This script file is just copied file from my 7th Minecraft Mod Project called "Powered Defences".
 *
 *		This project is fully coded in IntelliJ IDEA.
 *
 */
package net.apucsw.modular_electronics.common.registries;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import mekanism.common.block.prefab.BlockFactoryMachine;
import mekanism.common.content.blocktype.FactoryType;
import mekanism.common.item.block.machine.ItemBlockFactory;
import mekanism.common.registration.impl.BlockDeferredRegister;
import mekanism.common.registration.impl.BlockRegistryObject;
import mekanism.common.resource.IResource;
import mekanism.common.resource.ore.OreBlockType;
import mekanism.common.resource.ore.OreType;
import mekanism.common.tier.FactoryTier;

import net.apucsw.modular_electronics.common.ModularElectronics;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModularElectronicsBlocks {
	private ModularElectronicsBlocks() {

	}

	public static final BlockDeferredRegister BLOCKS = new BlockDeferredRegister(ModularElectronics.MODID);

	public static final Map<IResource, BlockRegistryObject<?, ?>> PROCESSED_RESOURCE_BLOCKS = new LinkedHashMap<>();
	public static final Map<OreType, OreBlockType> ORES = new LinkedHashMap<>();

	private static final Table<FactoryTier, FactoryType, BlockRegistryObject<BlockFactoryMachine.BlockFactory<?>, ItemBlockFactory>> FACTORIES = HashBasedTable.create();
}
