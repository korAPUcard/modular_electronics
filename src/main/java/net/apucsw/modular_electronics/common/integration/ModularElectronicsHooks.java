package net.apucsw.modular_electronics.common.integration;

import mekanism.common.integration.computer.computercraft.CCCapabilityHelper;
import mekanism.common.integration.curios.CuriosIntegration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;

public final class ModularElectronicsHooks {
    public static final String MEKANISM_MOD_ID = "mekanism";
    public static final String CC_MOD_ID = "computercraft";
    public static final String JEI_MOD_ID = "jei";
    public static final String CURIOS_MODID = "curios";
    public static final String IC2_MOD_ID = "ic2";
    public static final String OC2_MOD_ID = "oc2";
    public static final String PROJECT_RED_MOD_ID = "projectred";

    public boolean MekLoaded;
    public boolean CCLoaded;
    public boolean JEILoaded;
    public boolean CuriosLoaded;
    public boolean IC2Loaded;
    public boolean OC2Loaded;
    public boolean PRLoaded;

    public void hookConstructor(final IEventBus bus) {
        ModList modList = ModList.get();
        CuriosLoaded = modList.isLoaded(CURIOS_MODID);
        if (CuriosLoaded) {
            CuriosIntegration.addListeners(bus);
        }
    }

    public void hookCommonSetup() {
        ModList modList = ModList.get();
        MekLoaded = modList.isLoaded(MEKANISM_MOD_ID);
        CCLoaded = modList.isLoaded(CC_MOD_ID);
        JEILoaded = modList.isLoaded(JEI_MOD_ID);
        IC2Loaded = modList.isLoaded(IC2_MOD_ID);
        OC2Loaded = modList.isLoaded(OC2_MOD_ID);
        PRLoaded = modList.isLoaded(PROJECT_RED_MOD_ID);
        if (CCLoaded) {
            CCCapabilityHelper.registerCCMathHelper();
        }
    }

    public void sendIMCMessages(InterModEnqueueEvent event) {
        if (CuriosLoaded) {
            CuriosIntegration.sendIMC();
        }
    }

    public boolean computerCompatEnabled() {
        return CCLoaded || OC2Loaded;
    }
}
