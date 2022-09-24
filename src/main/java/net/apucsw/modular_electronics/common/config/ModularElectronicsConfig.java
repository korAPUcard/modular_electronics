package net.apucsw.modular_electronics.common.config;

import mekanism.common.config.MekanismConfigHelper;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModLoadingContext;

public class ModularElectronicsConfig {
    public static final MEGearConfig gear = new MEGearConfig();

    private ModularElectronicsConfig() {

    }

    public static void registerConfigs(ModLoadingContext modLoadingContext) {
        ModContainer modContainer = modLoadingContext.getActiveContainer();
        MekanismConfigHelper.registerConfig(modContainer, gear);
    }
}
