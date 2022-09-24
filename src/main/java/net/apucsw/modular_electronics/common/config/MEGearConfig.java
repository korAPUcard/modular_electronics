package net.apucsw.modular_electronics.common.config;

import mekanism.api.math.FloatingLong;
import mekanism.common.config.BaseMekanismConfig;
import mekanism.common.config.value.CachedFloatingLongValue;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.config.ModConfig;

public class MEGearConfig extends BaseMekanismConfig {
    private static final String MODULAR_SMARTPHONE_CATEGORY = "modular_smartphone";
    private final ForgeConfigSpec configSpec;

    // Modular Smartphone
    public final CachedFloatingLongValue modularSmartphoneEnergyUsage;
    public final CachedFloatingLongValue modularSmartphoneEnergyUsageIdle;
    public final CachedFloatingLongValue modularSmartphoneBaseEnergyCapacity;
    public final CachedFloatingLongValue modularSmartphoneBaseChargeRate;
    public final CachedFloatingLongValue modularSmartphoneEnergyUsageCamera;
    public final CachedFloatingLongValue ModularSmartphoneEnergyUsageFlashlight;
    public final CachedFloatingLongValue modularSmartphoneEnergyUsageApplication;
    public final CachedFloatingLongValue modularSmartphoneEnergyUsageBackgroundApplication;
    public final CachedFloatingLongValue modularSmartphoneEnergyUsageTextCommunication;
    public final CachedFloatingLongValue modularSmartphoneEnergyUsageVoiceCommunication;
    public final CachedFloatingLongValue modularSmartphoneEnergyUsageVideoCommunication;
    public final CachedFloatingLongValue modularSmartphoneEnergyUsageMultiMediaPlay;

    MEGearConfig() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        builder.comment("Gear Config. This config is synced from server to client.").push("gear");
        builder.comment("Modular Smartphone Settings").push("modular_smartphone");
        this.modularSmartphoneEnergyUsage = CachedFloatingLongValue.define(this, builder, "", "energyUsage", FloatingLong.createConst(5L));
        this.modularSmartphoneEnergyUsageIdle = CachedFloatingLongValue.define(this, builder, "", "energyUsageIdle", FloatingLong.createConst(1L));
        this.modularSmartphoneBaseEnergyCapacity = CachedFloatingLongValue.define(this, builder, "", "baseEnergyCapacity", FloatingLong.createConst(80000L));
        this.modularSmartphoneBaseChargeRate = CachedFloatingLongValue.define(this, builder, "", "baseChargeRate", FloatingLong.createConst(5000L));
        this.modularSmartphoneEnergyUsageCamera = CachedFloatingLongValue.define(this, builder, "", "energyUsageCamera", FloatingLong.createConst(4L));
        this.ModularSmartphoneEnergyUsageFlashlight = CachedFloatingLongValue.define(this, builder, "", "energyUsageFlashlight", FloatingLong.createConst(2L));
        this.modularSmartphoneEnergyUsageApplication = CachedFloatingLongValue.define(this, builder, "", "energyUsageApplication", FloatingLong.createConst(2L));
        this.modularSmartphoneEnergyUsageBackgroundApplication = CachedFloatingLongValue.define(this, builder, "", "energyUsageBackgroundApplication", FloatingLong.createConst(1L));
        this.modularSmartphoneEnergyUsageTextCommunication = CachedFloatingLongValue.define(this, builder, "", "energyUsageTextCommunication", FloatingLong.createConst(1L));
        this.modularSmartphoneEnergyUsageVoiceCommunication = CachedFloatingLongValue.define(this, builder, "", "energyUsageVoiceCommunication", FloatingLong.createConst(5L));
        this.modularSmartphoneEnergyUsageVideoCommunication = CachedFloatingLongValue.define(this, builder, "", "energyUsageVideoCommunication", FloatingLong.createConst(10L));
        this.modularSmartphoneEnergyUsageMultiMediaPlay = CachedFloatingLongValue.define(this, builder, "", "energyUsageMultiMediaPlay", FloatingLong.createConst(5L));
        builder.pop();

        this.configSpec = builder.build();
    }

    public String getFileName() {
        return "gear";
    }

    public ForgeConfigSpec getConfigSpec() {
        return this.configSpec;
    }

    public ModConfig.Type getConfigType() {
        return ModConfig.Type.SERVER;
    }

    public boolean addToContainer() {
        return false;
    }
}
