package net.apucsw.modelec.common;

import mekanism.api.MekanismIMC;
import mekanism.common.config.IMekanismConfig;
import mekanism.common.config.MekanismConfigHelper;
import mekanism.common.registration.impl.*;
import mekanism.common.registries.MekanismCreativeTabs;
import mekanism.common.registries.MekanismModules;
import mekanism.common.util.MekanismUtils;
import net.apucsw.modelec.common.config.DeviceConfig;
import net.apucsw.modelec.common.registries.ModularElectronicsItems;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.fml.ModList;
import net.neoforged.fml.config.IConfigSpec;
import net.neoforged.fml.event.lifecycle.InterModEnqueueEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.Map;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@SuppressWarnings({"Convert2MethodRef", "unused", "forremoval"})
@Mod(ModularElectronics.MODID)
public class ModularElectronics
{
    public static final String MODID = "modular_electronics";
    public static final Logger logger = LogUtils.getLogger();

    public static final DeviceConfig devconf = new DeviceConfig();
    private static final Map<IConfigSpec, IMekanismConfig> KNOWN_CONFIGS = new HashMap<>();

    public static final ModuleDeferredRegister MODULES =  new ModuleDeferredRegister(ModularElectronics.MODID);
    //public static final ModuleRegistryObject<?> EXAMPLE_UNIT = MODULES.registerMarker("example_unit", () -> ModularElectronics.MODULE_EXAMPLE);
    public static final ModuleRegistryObject<?> PROCESSOR_UNIT = MODULES.registerMarker("processor_unit", () -> ModularElectronics.MODULE_PROCESSOR);
    public static final ModuleRegistryObject<?> MEMORY_UNIT = MODULES.registerMarker("memory_unit", () -> ModularElectronics.MODULE_MEMORY);
    public static final ModuleRegistryObject<?> GRAPHIC_PROCESSING_UNIT = MODULES.registerMarker("graphic_processing_unit", () -> ModularElectronics.MODULE_GRAPHIC_PROCESSING);
    public static final ModuleRegistryObject<?> DATA_STORAGE_UNIT = MODULES.registerMarker("data_storage_unit", () -> ModularElectronics.MODULE_DATA_STORAGE);
    public static final ModuleRegistryObject<?> HIGH_SPEED_COMMUNICATION_UNIT = MODULES.registerMarker("high_speed_communication_unit", () -> ModularElectronics.MODULE_HIGH_SPEED_COMMUNICATION);
    public static final ModuleRegistryObject<?> THERMAL_IMAGING_UNIT = MODULES.registerMarker("thermal_imaging_unit", () -> ModularElectronics.MODULE_THERMAL_IMAGING_UNIT);
    public static final ModuleRegistryObject<?> AI_ASSISTANT_UNIT = MODULES.registerMarker("ai_assistant_unit", () -> ModularElectronics.MODULE_AI_ASSISTANT_UNIT);
    public static final ModuleRegistryObject<?> WIRELESS_QIO_TERMINAL_UNIT = MODULES.registerMarker("wireless_qio_terminal_unit", () -> ModularElectronics.MODULE_WIRELESS_QIO_TERMINAL);

    public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(ModularElectronics.MODID);
    public static final BlockDeferredRegister BLOCKS = new BlockDeferredRegister(ModularElectronics.MODID);



    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public ModularElectronics(IEventBus modEventBus, ModContainer modContainer) {
        ModularElectronics.ITEMS.register(modEventBus);
        ModularElectronics.MODULES.register(modEventBus);
        //ModularElectronics.ENTITY_TYPES.register(modEventBus);// DUMMY_DATA: Maybe further use, not now.
        MekanismConfigHelper.registerConfig(KNOWN_CONFIGS, modContainer, devconf);
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::buildCreativeModeTabContents);
        modEventBus.addListener(this::sendCustomModules);
        //modEventBus.addListener(this::registerRenderers);// DUMMY_DATA: Maybe further use, not now.
        //NeoForge.EVENT_BUS.addListener(this::opticalSensorLaser);// DUMMY_DATA: Maybe further use, not now.
    }

    @NotNull
    @Contract("_ -> new")
    public static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(ModularElectronics.MODID, path);
    }

    @NotNull
    @Contract("_, _ -> new")
    public static ResourceLocation getResource(@NotNull MekanismUtils.ResourceType type, String name) {
        return ModularElectronics.rl(type.getPrefix() + name);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        ModularElectronics.logger.info("Loaded 'Mekanism: Modular Electronics' module.");
    }

    private void buildCreativeModeTabContents(@NotNull BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == MekanismCreativeTabs.MEKANISM.get()) {
            ITEMS.getEntries().forEach(entry -> event.accept(entry.get()));
        }
    }

    private void sendCustomModules(InterModEnqueueEvent event) {
        final String ADD_SMARTPHONE_MODULES = "add_smartphone_modules";
        MekanismIMC.addModuleContainer((Holder<Item>) ModularElectronicsItems.SMARTPHONE, ADD_SMARTPHONE_MODULES);
        MekanismIMC.sendModuleIMC(ADD_SMARTPHONE_MODULES, MekanismModules.ENERGY_UNIT, MekanismModules.TELEPORTATION_UNIT);
    }

    @EventBusSubscriber(modid = ModularElectronics.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            if (ModList.get().isLoaded("curios")) {
                ModularElectronics.logger.info("Curios API detected. Some devices will supports Curios API Accessories slots.");
                //CuriosRendererRegistry.register(ModularElectronics.EXAMPLE.get(), WeaponsRenderer::new);
            }

//            event.enqueueWork(() -> {
//                ClientRegistrationUtil.setPropertyOverride(ModularElectronics.EXAMPLE, Mekanism.rl("pull"), (stack, world, entity, seed) -> {
//                    if (entity != null && entity.getUseItem() == stack && stack.getItem() instanceof ItemMekaBow bow) {
//                        return (stack.getUseDuration(entity) - entity.getUseItemRemainingTicks()) / bow.getUseTick(stack);
//                    }
//                    return 0;
//                });
//                ClientRegistrationUtil.setPropertyOverride(ModularElectronics.EXAMPLE, Mekanism.rl("pulling"), (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F);
//            });
        }
    }
}
