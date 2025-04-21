package net.apucsw.modular_electronics.common;

import mekanism.api.annotations.NothingNullByDefault;
import mekanism.api.text.ILangEntry;
import net.minecraft.Util;

@NothingNullByDefault
public enum MELang implements ILangEntry {
    // Key
    KEY_QUICK_PDA("key", "quick_pda");

    private final String key;

    MELang(String type, String path) { this(Util.makeDescriptionId(type, ModularElectronics.rl(path))); }

    MELang(String key) { this.key = key; }

    @Override
    public String getTranslationKey() { return key; }
}
