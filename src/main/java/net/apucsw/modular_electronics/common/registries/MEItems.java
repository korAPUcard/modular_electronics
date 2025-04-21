package net.apucsw.modular_electronics.common.registries;

import net.apucsw.modular_electronics.common.ModularElectronics;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MEItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModularElectronics.MODID);

    // Modular Electronics original devices
    public static final RegistryObject<Item> SMARTPHONE = ITEMS.register("smartphone",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.COMMON)
                    .setNoRepair())
    );

    public static final RegistryObject<Item> TABLET_COMPUTER = ITEMS.register("tablet_computer",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.COMMON)
                    .setNoRepair())
    );

    public static final RegistryObject<Item> LAPTOP = ITEMS.register("laptop",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.COMMON)
                    .setNoRepair())
    );

    public static final RegistryObject<Item> MUSIC_PLAYER = ITEMS.register("music_player",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.COMMON)
                    .setNoRepair())
    );

    public static final RegistryObject<Item> PORTABLE_GAMING_CONSOLE = ITEMS.register("portable_gaming_console",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.UNCOMMON)
                    .setNoRepair())
    );



    // Realistic Survival System compatible devices
    public static final RegistryObject<Item> PERSONAL_STATUS_MONITOR = ITEMS.register("personal_status_monitor",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.EPIC)
                    .setNoRepair())
    );
}
