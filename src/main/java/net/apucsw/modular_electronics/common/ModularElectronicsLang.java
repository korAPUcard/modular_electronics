package net.apucsw.modular_electronics.common;

import mekanism.api.text.ILangEntry;
import net.minecraft.Util;

public enum ModularElectronicsLang implements ILangEntry {
    MODULAR_ELECTRONICS("constants", "mod_name"),
    DESCRIPTION_MODULAR_SMARTPHONE("description", "modular_smartphone");

    private final String key;

    ModularElectronicsLang(String type, String path) {
        this(Util.makeDescriptionId(type, ModularElectronics.rl(path)));
    }

    ModularElectronicsLang(String key) {
        this.key = key;
    }

    public String getTranslationKey() {
        return this.key;
    }
}
