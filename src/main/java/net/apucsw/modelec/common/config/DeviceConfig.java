package net.apucsw.modelec.common.config;

import mekanism.common.config.BaseMekanismConfig;
import mekanism.common.config.value.CachedBooleanValue;
import mekanism.common.config.value.CachedLongValue;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.ModConfigSpec;

public class DeviceConfig extends BaseMekanismConfig {
    public static final String MEKADEVICE_CATEGORY = "mekadevice";

    private final ModConfigSpec configSpec;

    /* Meka-tool references
    public final CachedLongValue mekaToolEnergyUsageWeapon;
    public final CachedLongValue mekaToolEnergyUsageTeleport;
    public final CachedLongValue mekaToolEnergyUsage;
    public final CachedLongValue mekaToolEnergyUsageSilk;
    public final CachedIntValue mekaToolMaxTeleportReach;
    public final CachedIntValue mekaToolBaseDamage;
    public final CachedDoubleValue mekaToolAttackSpeed;
    public final CachedFloatValue mekaToolBaseEfficiency;
    public final CachedLongValue mekaToolBaseEnergyCapacity;
    public final CachedLongValue mekaToolBaseChargeRate;
    public final CachedLongValue mekaToolEnergyUsageHoe;
    public final CachedLongValue mekaToolEnergyUsageShovel;
    public final CachedLongValue mekaToolEnergyUsageAxe;
    public final CachedLongValue mekaToolEnergyUsageShearEntity;
    public final CachedLongValue mekaToolEnergyUsageShearTrim;
    public final CachedBooleanValue mekaToolExtendedMining;
    */

    // ===== Modular Smartphone - Code Start =====
    // Base power property
    public final CachedLongValue smartphoneBaseEnergyCapacity;
    public final CachedLongValue smartphoneBaseChargeRate;

    // Device power usage
    public final CachedLongValue smartphoneEnergyUsage;// Interacts power usage(When power is on but user is not currently using device)
    public final CachedLongValue smartphoneEnergyUsageIdle;// Idle power usage(When power is on but user is not currently using device)
    public final CachedLongValue smartphoneEnergyUsageScreenOn;// Idle power usage when GUI is opened
    public final CachedLongValue smartphoneEnergyUsageCPU;// CPU power usage
    public final CachedLongValue smartphoneEnergyUsageRAM;// RAM power usage
    public final CachedLongValue smartphoneEnergyUsageGPU;// GPU power usage
    public final CachedLongValue smartphoneEnergyUsageUSB;// USB power usage(When placed devices on USB slot to connected)
    public final CachedLongValue smartphoneEnergyUsageStorage;// Storage power usage
    public final CachedLongValue smartphoneEnergyUsageSoundEmit;// Sound output power usage
    public final CachedLongValue smartphoneEnergyUsageVibration;// Vibration unit power usage
    public final CachedLongValue smartphoneEnergyUsageNetwork;// Wi-Fi network power usage
    public final CachedLongValue smartphoneEnergyUsageCellular;// Cellular network power usage
    public final CachedLongValue smartphoneEnergyUsageBluetooth;// Bluetooth or other short range network power usage
    public final CachedLongValue smartphoneEnergyUsageGPS;// GPS sensor power usage
    public final CachedLongValue smartphoneEnergyUsageHotspot;// Mobile Hotspot power usage
    public final CachedLongValue smartphoneEnergyUsageNFC;// NFC power usage
    public final CachedLongValue smartphoneEnergyUsageScan;// Variable targets scan power usage
    public final CachedLongValue smartphoneEnergyUsageFlashlight;// Flashlight power usage
    public final CachedLongValue smartphoneEnergyUsageScreenshot;// Screenshot power usage
    public final CachedLongValue smartphoneEnergyUsageCameraActive;// Camera during activated power usage
    public final CachedLongValue smartphoneEnergyUsageCameraPhoto;// Camera photo taken power usage
    public final CachedLongValue smartphoneEnergyUsageCameraRecord;// Camera during record video power usage
    public final CachedLongValue smartphoneEnergyUsageDataPacketSend;// Data packet send power usage
    public final CachedLongValue smartphoneEnergyUsageDataPacketReceive;// Data packet receive power usage

    // Application power usage
    //public final CachedLongValue smartphoneEnergyUsageAppUsage;// Application power usage
    public final CachedLongValue smartphoneEnergyUsageAppBase;// Base application power usage
    public final CachedLongValue smartphoneEnergyUsageAppGame;// Game application power usage
    public final CachedLongValue smartphoneEnergyUsageAppMessage;// Message application power usage
    public final CachedLongValue smartphoneEnergyUsageAppCall;// Call application power usage
    public final CachedLongValue smartphoneEnergyUsageAppStreaming;// Streaming application power usage

    // Device resource usage - TODO: Will be implements in further updates
//    public final CachedLongValue smartphoneTotalUsageCPU;// CPU total usage(Per process)
//    public final CachedLongValue smartphoneTotalUsageRAM;// RAM total usage(Byte)
//    public final CachedIntValue smartphoneTotalUsageGPUProc;// GPU processor total usage(%)
//    public final CachedLongValue smartphoneTotalUsageGPUMem;// GPU memory total usage(Byte)
//    public final CachedLongValue smartphoneTotalUsageStorage0;// Storage 0 total usage(Byte)
//    public final CachedLongValue smartphoneTotalUsageStorage1;// Storage 1 total usage(Byte)
//    public final CachedLongValue smartphoneTotalUsageStorage2;// Storage 2 total usage(Byte)
//    public final CachedLongValue smartphoneTotalUsageBattery;// Battery total usage
//    public final CachedIntValue smartphoneCurrentUsageCPU;// CPU current usage(%)
//    public final CachedLongValue smartphoneCurrentUsageRAM;// RAM current usage(Byte)
//    public final CachedIntValue smartphoneCurrentUsageGPUProc;// GPU processor current usage(%)
//    public final CachedLongValue smartphoneCurrentUsageGPUMem;// GPU memory current usage(Byte)
//    public final CachedLongValue smartphoneCurrentUsageStorage0;// Storage 0 current usage(Byte)
//    public final CachedLongValue smartphoneCurrentUsageStorage1;// Storage 1 current usage(Byte)
//    public final CachedLongValue smartphoneCurrentUsageStorage2;// Storage 2 current usage(Byte)
//    public final CachedIntValue smartphoneTemperatureCPU;// CPU temperature(Celsius)
//    public final CachedIntValue smartphoneTemperatureRAM;// RAM temperature(Celsius)
//    public final CachedIntValue smartphoneTemperatureGPU;// GPU temperature(Celsius)
//    public final CachedIntValue smartphoneTemperatureBattery;// Battery temperature(Celsius)

    // Modes & States
    public final CachedBooleanValue smartphoneEnableDeveloperMode;// Developer mode, but not rooting
    public final CachedBooleanValue smartphoneEnableSoundEmit;// Sound mode
    public final CachedBooleanValue smartphoneEnableVibrationEmit;// Vibration mode
    public final CachedBooleanValue smartphoneEnableScreenRotation;// Auto screen rotation - Experimental
    public final CachedBooleanValue smartphoneEnableNetwork;// Wi-Fi enable - Will be CC:Tweaked compatible in further development
    public final CachedBooleanValue smartphoneEnableCellular;// Cellular network enable - VoIP only
    public final CachedBooleanValue smartphoneEnableBluetooth;// Bluetooth enable
    public final CachedBooleanValue smartphoneEnableGPS;// GPS enable
    public final CachedBooleanValue smartphoneEnableHotspot;// Mobile hotspot enable - Short range communication only
    public final CachedBooleanValue smartphoneEnableEcoMode;// Battery saving mode
    public final CachedBooleanValue smartphoneEnableNFC;// NFC tag sensor enable
    public final CachedBooleanValue smartphoneEnableScanner;// Optical scanner enable - Scans QR code, barcode, or just entities, etc.
    public final CachedBooleanValue smartphoneEnableAirplaneMode;// Airplane mode
    public final CachedBooleanValue smartphoneEnableFlashlight;// Flashlight enable
    public final CachedBooleanValue smartphoneEnableDnDMode;// Do not disturb mode

    public final CachedBooleanValue smartphoneIsLowPowerState;// Automatically set when power is 15% low
    public final CachedBooleanValue smartphoneAfterRootingState;// After rooting activated
    // ===== Modular Smartphone - Code End =====

    public DeviceConfig() {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        DeviceConfigTranslations.DEVICE_SMARTPHONE.applyToBuilder(builder).push("smartphone");

        // ===== Energy =====
        DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY.applyToBuilder(builder).push("energy");
        smartphoneBaseEnergyCapacity = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_CAPACITY, "baseEnergyCapacity", 1_000_000L);
        smartphoneBaseChargeRate = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_CHARGE_RATE, "baseChargeRate", 50_000L);
        builder.pop();

        // ===== Energy Usage =====
        builder.push("usage");
        smartphoneEnergyUsage = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE, "idle", 1L);
        smartphoneEnergyUsageIdle = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_IDLE, "idle", 1L);
        smartphoneEnergyUsageScreenOn = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_SCREEN_ON, "screen", 2L);
        smartphoneEnergyUsageCPU = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_CPU, "cpu", 8L);
        smartphoneEnergyUsageRAM = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_RAM, "ram", 4L);
        smartphoneEnergyUsageGPU = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_GPU, "gpu", 10L);
        smartphoneEnergyUsageUSB = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_USB, "usb", 5L);
        smartphoneEnergyUsageStorage = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_STORAGE, "storage", 3L);
        smartphoneEnergyUsageSoundEmit = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_SOUND, "soundEmit", 2L);
        smartphoneEnergyUsageVibration = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_VIBRATION, "vibration", 1L);
        smartphoneEnergyUsageNetwork = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_NETWORK, "network", 6L);
        smartphoneEnergyUsageCellular = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_CELLULAR, "cellular", 7L);
        smartphoneEnergyUsageBluetooth = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_BLUETOOTH, "bluetooth", 3L);
        smartphoneEnergyUsageGPS = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_GPS, "gps", 4L);
        smartphoneEnergyUsageHotspot = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_HOTSPOT, "hotspot", 10L);
        smartphoneEnergyUsageNFC = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_NFC, "nfc", 2L);
        smartphoneEnergyUsageScan = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_SCAN, "scan", 5L);
        smartphoneEnergyUsageFlashlight = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_FLASHLIGHT, "flashlight", 3L);
        smartphoneEnergyUsageScreenshot = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_SCREENSHOT, "screenshot", 1L);
        smartphoneEnergyUsageCameraActive = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_CAMERA_ACTIVE, "cameraActive", 5L);
        smartphoneEnergyUsageCameraPhoto = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_CAMERA_PHOTO, "cameraPhoto", 8L);
        smartphoneEnergyUsageCameraRecord = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_CAMERA_RECORD, "cameraRecord", 12L);
        smartphoneEnergyUsageDataPacketSend = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_DATA_PACKET_SEND, "dataSend", 2L);
        smartphoneEnergyUsageDataPacketReceive = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_DATA_PACKET_RECEIVE, "dataReceive", 2L);

        //smartphoneEnergyUsageAppUsage = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_APP_USAGE, "appBase", 2L);
        smartphoneEnergyUsageAppBase = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_APP_BASE, "appBase", 2L);
        smartphoneEnergyUsageAppGame = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_APP_GAME, "appGame", 20L);
        smartphoneEnergyUsageAppMessage = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_APP_MESSAGE, "appMessage", 4L);
        smartphoneEnergyUsageAppCall = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_APP_CALL, "appCall", 6L);
        smartphoneEnergyUsageAppStreaming = CachedLongValue.definePositive(this, builder, DeviceConfigTranslations.DEVICE_SMARTPHONE_ENERGY_USAGE_APP_STREAMING, "appStreaming", 15L);
        builder.pop(); // usage

        // ===== Modes & States =====
        builder.push("mode");
        smartphoneEnableDeveloperMode = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_DEV.applyToBuilder(builder).define("developerMode", false));
        smartphoneEnableSoundEmit = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_SOUND.applyToBuilder(builder).define("soundEmit", true));
        smartphoneEnableVibrationEmit = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_VIBRATION.applyToBuilder(builder).define("vibrationEmit", true));
        smartphoneEnableScreenRotation = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_ROTATE.applyToBuilder(builder).define("screenRotation", true));
        smartphoneEnableNetwork = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_WIFI.applyToBuilder(builder).define("wifi", true));
        smartphoneEnableCellular = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_CELLULAR.applyToBuilder(builder).define("cellular", true));
        smartphoneEnableBluetooth = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_BLUETOOTH.applyToBuilder(builder).define("bluetooth", true));
        smartphoneEnableGPS = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_GPS.applyToBuilder(builder).define("gps", true));
        smartphoneEnableHotspot = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_HOTSPOT.applyToBuilder(builder).define("hotspot", false));
        smartphoneEnableEcoMode = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_ECO.applyToBuilder(builder).define("ecoMode", false));
        smartphoneEnableNFC = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_NFC.applyToBuilder(builder).define("nfc", false));
        smartphoneEnableScanner = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_SCANNER.applyToBuilder(builder).define("scanner", true));
        smartphoneEnableAirplaneMode = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_AIRPLANE.applyToBuilder(builder).define("airplaneMode", false));
        smartphoneEnableFlashlight = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_FLASHLIGHT.applyToBuilder(builder).define("flashlight", false));
        smartphoneEnableDnDMode = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_MODE_DND.applyToBuilder(builder).define("dndMode", false));

        smartphoneIsLowPowerState = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_STATE_LOWPOWER.applyToBuilder(builder).define("isLowPower", false));
        smartphoneAfterRootingState = CachedBooleanValue.wrap(this, DeviceConfigTranslations.DEVICE_SMARTPHONE_STATE_ROOTED.applyToBuilder(builder).define("afterRooting", false));
        builder.pop(); // mode

        builder.pop(); // smartphone
        this.configSpec = builder.build();
    }

    public String getFileName() {
        return "modular_electronics";
    }

    public String getTranslation() {
        return "Modular Electronics";
    }

    @Override
    public ModConfigSpec getConfigSpec() {
        return configSpec;
    }

    public ModConfig.Type getConfigType() {
        return ModConfig.Type.SERVER;
    }
}
