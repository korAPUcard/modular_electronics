package net.apucsw.modular_electronics.common;

import mekanism.api.text.ILangEntry;
import mekanism.common.Mekanism;
import net.minecraft.Util;

public enum ModularElectronicsLang implements ILangEntry {
    DESCRIPTION_MODULAR_SMARTPHONE("description", "modular_smartphone");

    private final String key;

    private ModularElectronicsLang(String type, String path) {
        this(Util.makeDescriptionId(type, ModularElectronicsMod.rl(path)));
    }

    private ModularElectronicsLang(String key) {
        this.key = key;
    }

    public String getTranslationKey() {
        return this.key;
    }
}
