package net.apucsw.modular_electronics.client.render.item.gear;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import mekanism.client.render.item.MekanismISTER;
import net.apucsw.modular_electronics.client.model.ModelModularSmartphone;
import net.apucsw.modular_electronics.common.item.ItemModularSmartphone;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

import static net.apucsw.modular_electronics.client.model.ModelModularSmartphone.*;

public class RenderModularSmartphone /*extends MekanismISTER*/ {
    //public static final RenderModularSmartphone RENDERER = new RenderModularSmartphone();
    //TODO: Makes the entity model renderer system behave like a JAVA model using a JSON model.
    //      However, Mekanism API still uses.

    //private ModelModularSmartphone modularSmartphone;
    /*
    public ModularSmartphoneRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelModularSmartphone(context.bakeLayer(MODULAR_SMARTPHONE_MODEL_LOCATION)), 1);
    }

    @Override
    public ResourceLocation getTextureLocation(ItemModularSmartphone modularSmartphone) {
        return MODULAR_SMARTPHONE_BASE_TEXTURE_LOCATION;
        return MODULAR_SMARTPHONE_SCREEN_TEXTURE_LOCATION;
        return MODULAR_SMARTPHONE_LED_INDICATOR_TEXTURE_LOCATION;
        return MODULAR_SMARTPHONE_LED_TIER_TEXTURE_LOCATION;
        return MODULAR_SMARTPHONE_LED_FLASHLIGHT_TEXTURE_LOCATION;
        return MODULAR_SMARTPHONE_BRAND_TEXT_TEXTURE_LOCATION;
        return MODULAR_SMARTPHONE_BRAND_LOGO_TEXTURE_LOCATION;
    }
    */
    /*
    @Override
    public void onResourceManagerReload(@Nonnull ResourceManager resourceManager) {
        modularSmartphone = new ModelModularSmartphone();
    }

    @Override
    public void renderByItem(@Nonnull ItemStack stack, @Nonnull ItemTransforms.TransformType transformType, @Nonnull PoseStack matrix, @Nonnull MultiBufferSource renderer, int light, int overlayLight) {

    }
     */
}
