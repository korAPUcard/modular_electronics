package net.apucsw.modular_electronics.common.registries;

import net.apucsw.modular_electronics.common.ModularElectronics;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MECreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModularElectronics.MODID);

    public static final RegistryObject<CreativeModeTab> ME_TAB_PORTABLE_DEVICES = TABS.register("me_tab_portable_devices",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.me_tab_portable_devices"))
                    .icon(MEItems.SMARTPHONE.get()::getDefaultInstance)
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> ME_TAB_STATIONARY_DEVICES = TABS.register("me_tab_stationary_devices",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.me_tab_stationary_devices"))
                    .icon(() -> new ItemStack(Blocks.BEACON)).displayItems((parameters, tabData)
                    .icon(MEBlocks.DESKTOP_AIO.get())
                    .build()
    );
}
