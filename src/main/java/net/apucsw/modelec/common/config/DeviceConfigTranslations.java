package net.apucsw.modelec.common.config;

import mekanism.common.Mekanism;
import net.minecraft.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import mekanism.common.config.IConfigTranslation;
import mekanism.common.config.TranslationPreset;

public enum DeviceConfigTranslations implements IConfigTranslation {
    DEVICE_SMARTPHONE("device.smartphone", "Modular Smartphone", "Settings for configuring the modular smartphone", true),

    DEVICE_SMARTPHONE_ENERGY("device.smartphone.energy", "Base Energy", "Energy (FE) of the smartphone without any installed modules."),
    DEVICE_SMARTPHONE_ENERGY_CAPACITY("device.smartphone.capacity", "Base Energy Capacity", "Energy capacity (FE) of the smartphone without any installed modules."),
    DEVICE_SMARTPHONE_CHARGE_RATE("device.smartphone.charge_rate", "Base Charge Rate", "Maximum energy (FE) the smartphone can receive per tick."),

    DEVICE_SMARTPHONE_ENERGY_USAGE("device.smartphone.energy_usage", "Device Energy Usage", "Power consumption of the smartphone’s internal hardware modules", true),
    DEVICE_SMARTPHONE_ENERGY_USAGE_IDLE("device.smartphone.energy_usage.idle", "Idle", "Power usage when powered on but idle."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_SCREEN_ON("device.smartphone.energy_usage.screen_on", "Screen On", "Power usage when the GUI is opened."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_CPU("device.smartphone.energy_usage.cpu", "CPU", "Power usage of the central processor."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_RAM("device.smartphone.energy_usage.ram", "RAM", "Power usage of memory modules."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_GPU("device.smartphone.energy_usage.gpu", "GPU", "Power usage of the graphical processor."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_USB("device.smartphone.energy_usage.usb", "USB", "Power usage when USB-connected device is active."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_STORAGE("device.smartphone.energy_usage.storage", "Storage", "Power usage of internal storage."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_SOUND("device.smartphone.energy_usage.sound", "Sound Emit", "Power usage when playing sound."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_VIBRATION("device.smartphone.energy_usage.vibration", "Vibration", "Power usage of vibration motor."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_NETWORK("device.smartphone.energy_usage.network", "Wi-Fi", "Power usage of wireless network."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_CELLULAR("device.smartphone.energy_usage.cellular", "Cellular", "Power usage of cellular modem."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_BLUETOOTH("device.smartphone.energy_usage.bluetooth", "Bluetooth", "Power usage of Bluetooth communication."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_GPS("device.smartphone.energy_usage.gps", "GPS", "Power usage of GPS module."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_HOTSPOT("device.smartphone.energy_usage.hotspot", "Hotspot", "Power usage of hotspot broadcast."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_NFC("device.smartphone.energy_usage.nfc", "NFC", "Power usage of near-field communication."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_SCAN("device.smartphone.energy_usage.scan", "Scan", "Power usage for optical scan (QR, entities, etc)."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_FLASHLIGHT("device.smartphone.energy_usage.flashlight", "Flashlight", "Power usage of flashlight."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_SCREENSHOT("device.smartphone.energy_usage.screenshot", "Screenshot", "Power usage of taking screenshot."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_CAMERA_ACTIVE("device.smartphone.energy_usage.camera_active", "Camera Active", "Power usage when camera is active."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_CAMERA_PHOTO("device.smartphone.energy_usage.camera_photo", "Camera Photo", "Power usage when taking a photo."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_CAMERA_RECORD("device.smartphone.energy_usage.camera_record", "Camera Record", "Power usage during video recording."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_DATA_PACKET_SEND("device.smartphone.energy_usage.packet_send", "Data Send", "Power usage when sending data packets."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_DATA_PACKET_RECEIVE("device.smartphone.energy_usage.packet_receive", "Data Receive", "Power usage when receiving data packets."),

    DEVICE_SMARTPHONE_APP_USAGE("device.smartphone.app_usage", "App Energy Usage", "Power consumption by various applications", true),
    DEVICE_SMARTPHONE_ENERGY_USAGE_APP_BASE("device.smartphone.app_usage.base", "Base", "Base app power usage."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_APP_GAME("device.smartphone.app_usage.game", "Game", "Power usage of game apps."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_APP_MESSAGE("device.smartphone.app_usage.message", "Message", "Power usage of messaging apps."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_APP_CALL("device.smartphone.app_usage.call", "Call", "Power usage of voice calling."),
    DEVICE_SMARTPHONE_ENERGY_USAGE_APP_STREAMING("device.smartphone.app_usage.streaming", "Streaming", "Power usage of streaming services."),

    DEVICE_SMARTPHONE_MODES("device.smartphone.modes", "Smartphone Modes & Features", "Feature toggles and operational modes", true),
    DEVICE_SMARTPHONE_MODE_DEV("device.smartphone.modes.developer", "Developer Mode", "Enable developer settings."),
    DEVICE_SMARTPHONE_MODE_SOUND("device.smartphone.modes.sound", "Sound Mode", "Enable sound output."),
    DEVICE_SMARTPHONE_MODE_VIBRATION("device.smartphone.modes.vibration", "Vibration Mode", "Enable vibration feedback."),
    DEVICE_SMARTPHONE_MODE_ROTATE("device.smartphone.modes.screen_rotation", "Screen Rotation", "Auto-rotate screen orientation."),
    DEVICE_SMARTPHONE_MODE_WIFI("device.smartphone.modes.wifi", "Wi-Fi Enabled", "Enable wireless network."),
    DEVICE_SMARTPHONE_MODE_CELLULAR("device.smartphone.modes.cellular", "Cellular Enabled", "Enable cellular network."),
    DEVICE_SMARTPHONE_MODE_BLUETOOTH("device.smartphone.modes.bluetooth", "Bluetooth Enabled", "Enable Bluetooth."),
    DEVICE_SMARTPHONE_MODE_GPS("device.smartphone.modes.gps", "GPS Enabled", "Enable GPS."),
    DEVICE_SMARTPHONE_MODE_HOTSPOT("device.smartphone.modes.hotspot", "Hotspot Enabled", "Enable mobile hotspot."),
    DEVICE_SMARTPHONE_MODE_ECO("device.smartphone.modes.eco_mode", "Eco Mode", "Enable battery-saving mode."),
    DEVICE_SMARTPHONE_MODE_NFC("device.smartphone.modes.nfc", "NFC Enabled", "Enable NFC module."),
    DEVICE_SMARTPHONE_MODE_SCANNER("device.smartphone.modes.scanner", "Scanner Enabled", "Enable scanner for codes or entities."),
    DEVICE_SMARTPHONE_MODE_AIRPLANE("device.smartphone.modes.airplane", "Airplane Mode", "Disable all wireless communication."),
    DEVICE_SMARTPHONE_MODE_FLASHLIGHT("device.smartphone.modes.flashlight", "Flashlight Enabled", "Toggle flashlight."),
    DEVICE_SMARTPHONE_MODE_DND("device.smartphone.modes.dnd", "Do Not Disturb", "Mute all notifications and vibrations."),

    DEVICE_SMARTPHONE_STATE_LOWPOWER("device.smartphone.state.low_power", "Low Power State", "Device has entered low power mode."),
    DEVICE_SMARTPHONE_STATE_ROOTED("device.smartphone.state.rooted", "Rooted State", "Device has been rooted and developer access extended.");

    private final String key;
    private final String title;
    private final String tooltip;
    @Nullable
    private final String button;

    DeviceConfigTranslations(@NotNull TranslationPreset preset, String type) {
        this(preset.path(type), preset.title(type), preset.tooltip(type));
    }

    DeviceConfigTranslations(String path, String title, String tooltip) {
        this(path, title, tooltip, false);
    }

    DeviceConfigTranslations(String path, String title, String tooltip, boolean isSection) {
        this(path, title, tooltip, IConfigTranslation.getSectionTitle(title, isSection));
    }

    DeviceConfigTranslations(String path, String title, String tooltip, @Nullable String button) {
        this.key = Util.makeDescriptionId("configuration", Mekanism.rl(path));
        this.title = title;
        this.tooltip = tooltip;
        this.button = button;
    }

    @NotNull
    public String getTranslationKey() {
        return key;
    }

    public String title() {
        return title;
    }

    public String tooltip() {
        return tooltip;
    }

    @Nullable
    public String button() {
        return button;
    }
}
