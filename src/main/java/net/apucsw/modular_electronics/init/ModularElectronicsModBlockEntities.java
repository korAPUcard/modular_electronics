/*
 *		Originally generated from MCreator.
 *
 *		This script file is just copied file from my 7th Minecraft Mod Project called "Powered Defences".
 *
 *		This project is fully coded in IntelliJ IDEA.
 *
 */
package net.apucsw.modular_electronics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

//import net.apucsw.modular_electronics.block.entity.ForcefieldBarrierVerticalSingleShieldEmitBlockEntity;	// References
//import net.apucsw.modular_electronics.block.entity.ForcefieldBarrierVerticalSingleBlockEntity;
import net.apucsw.modular_electronics.ModularElectronicsMod;

public class ModularElectronicsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			ModularElectronicsMod.MODID);
	/*	References
	public static final RegistryObject<BlockEntityType<?>> FORCEFIELD_BARRIER_VERTICAL_SINGLE = register("forcefield_barrier_vertical_single",
			PoweredDefencesModBlocks.FORCEFIELD_BARRIER_VERTICAL_SINGLE, ForcefieldBarrierVerticalSingleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FORCEFIELD_BARRIER_VERTICAL_DOUBLE = register("forcefield_barrier_vertical_double",
	*/

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
