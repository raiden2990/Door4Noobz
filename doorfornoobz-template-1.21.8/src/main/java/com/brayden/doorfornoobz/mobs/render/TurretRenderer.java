package com.brayden.doorfornoobz.mobs.render;

import com.brayden.doorfornoobz.mobs.models.MinecraftGuardian;
import com.brayden.doorfornoobz.mobs.models.TurretEntity;
import com.brayden.doorfornoobz.mobs.models.TurretModel;
import net.minecraft.client.model.TurtleModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TurretRenderer extends MobRenderer <TurretEntity, TurretRenderState, TurretModel>{
    public TurretRenderer(EntityRendererProvider.Context context) {
        super(context,new TurretModel(context.bakeLayer(TurretModel.LAYER_LOCATION)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(TurretRenderState TurretRenderState) {
        return ResourceLocation.fromNamespaceAndPath("modid", "tentures/entity/turret/turret.png");
    }

    @Override
    public TurretRenderState createRenderState() {
        return new  TurretRenderState();
    }
}
