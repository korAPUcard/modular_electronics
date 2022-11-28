package net.apucsw.modular_electronics.client.render;

import me.sizableshrimp.entitymodeljson.datagen.EntityModelProvider;
import net.apucsw.modular_electronics.common.ModularElectronics;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModularElectronicsEntityModelProvider extends EntityModelProvider {
    public ModularElectronicsEntityModelProvider(DataGenerator dataGen, ExistingFileHelper efh) {
        super(dataGen, ModularElectronics.MODID, efh);
    }

    @Override
    public void registerEntityModels() {

    }
}
