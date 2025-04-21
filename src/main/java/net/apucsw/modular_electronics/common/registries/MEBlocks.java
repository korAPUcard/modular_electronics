package net.apucsw.modular_electronics.common.registries;

import net.apucsw.modular_electronics.common.ModularElectronics;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MEBlocks {
    // Modular Electronics original devices
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModularElectronics.MODID);

    public static final RegistryObject<Block> DESKTOP_FULL_TOWER = BLOCKS.register("desktop_full_tower",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY))
    );

    public static final RegistryObject<Block> DESKTOP_MIDDLE_TOWER = BLOCKS.register("desktop_middle_tower",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY))
    );

    public static final RegistryObject<Block> DESKTOP_MINI_TOWER = BLOCKS.register("desktop_mini_tower",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY))
    );

    public static final RegistryObject<Block> DESKTOP_MINI_FORM_FACTOR = BLOCKS.register("desktop_mini_form_factor",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY))
    );

    public static final RegistryObject<Block> DESKTOP_MICRO_FORM_FACTOR = BLOCKS.register("desktop_micro_form_factor",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY))
    );

    public static final RegistryObject<Block> DESKTOP_AIO = BLOCKS.register("desktop_full_tower",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY))
    );

    // Realistic Survival System compatible devices
    public static final RegistryObject<Block> AIR_CONDITIONER = BLOCKS.register("air_conditioner",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY))
    );

    public static final RegistryObject<Block> WATER_PURIFIER = BLOCKS.register("water_purifier",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY))
    );

    public static final RegistryObject<Block> AIR_PURIFIER = BLOCKS.register("air_purifier",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY))
    );


}
