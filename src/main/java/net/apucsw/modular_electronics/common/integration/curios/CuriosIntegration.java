package net.apucsw.modular_electronics.common.integration.curios;

import net.apucsw.modular_electronics.common.integration.ModularElectronicsHooks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.SlotTypePreset;

public class CuriosIntegration {
    public static void sendIMC() {
        InterModComms.sendTo(ModularElectronicsHooks.CURIOS_MODID, "register_type", () -> SlotTypePreset.BELT.getMessageBuilder().build());

        //public static void addListeners(IEventBus bus) {
        //    bus.addListener((FMLClientSetupEvent event) -> registerRenderers
        //}
    }
}
