package net.apucsw.modelec.common;

import mekanism.api.text.ILangEntry;
import mekanism.common.Mekanism;
import net.minecraft.Util;
import net.minecraft.world.entity.EquipmentSlot;

public enum ModularElectronicsLang  implements ILangEntry {
    MODULAR_ELECTRONICS("constants", "mod_name"),

    // Smartphone
    SMARTPHONE("smartphone", "smartphone"),
    ;

    private final String key;

    ModularElectronicsLang(String type, String path) {
        this(Util.makeDescriptionId(type, ModularElectronics.rl(path)));
    }

    ModularElectronicsLang(String key) {
        this.key = key;
    }

    @Override
    public String getTranslationKey() {
        return key;
    }

//    public static ILangEntry get(EquipmentSlot type) {
//        return switch (type) {
//            case ARM -> ARM;
//        };
//    }
}
