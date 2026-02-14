package com.brayden.doorfornoobz.mobs.render;

import com.brayden.doorfornoobz.doorfornoobz;
import com.brayden.doorfornoobz.mobs.models.GuardianEntity;
import com.brayden.doorfornoobz.mobs.models.MinecraftGuardian;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GuardianRenderer extends MobRenderer<GuardianEntity, GuardianRenderState, MinecraftGuardian> {
    public GuardianRenderer(EntityRendererProvider.Context context) {//hi
        super(context, new MinecraftGuardian(context.bakeLayer(MinecraftGuardian.LAYER_LOCATION)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(GuardianRenderState guardianRenderState) {
        return ResourceLocation.fromNamespaceAndPath(doorfornoobz.MODID, "textures/entity/minecraftguardian/minecraft_guardian.png");
    }

    @Override
    public GuardianRenderState createRenderState() {
        return new GuardianRenderState();
    }
}
