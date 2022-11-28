package net.apucsw.modular_electronics.client;

import mekanism.client.ClientRegistrationUtil;
import mekanism.client.ClientTickHandler;
import mekanism.client.render.RenderTickHandler;
import mekanism.client.sound.SoundHandler;
import mekanism.common.integration.MekanismHooks;
import net.apucsw.modular_electronics.client.gui.item.GuiModularSmartphone;
import net.apucsw.modular_electronics.common.ModularElectronics;
import net.apucsw.modular_electronics.common.integration.ModularElectronicsHooks;
import net.apucsw.modular_electronics.common.registries.ModularElectronicsContainerTypes;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ModularElectronics.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegistration {
    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {
        MinecraftForge.EVENT_BUS.register(new ClientTickHandler());
        MinecraftForge.EVENT_BUS.register(new RenderTickHandler());
        MinecraftForge.EVENT_BUS.addListener(EventPriority.LOWEST, SoundHandler::onTilePlaySound);
        if (ModList.get().isLoaded(ModularElectronicsHooks.JEI_MOD_ID)) {
            MinecraftForge.EVENT_BUS.addListener(EventPriority.LOWEST, RenderTickHandler::guiOpening);
        }
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
        ClientRegistrationUtil.registerScreen(ModularElectronicsContainerTypes.MODULAR_SMARTPHONE, GuiModularSmartphone::new);
    }
}
