package com.brayden.doorfornoobz.mobs.render;

import com.brayden.doorfornoobz.mobs.models.Turret_Pew;
import com.brayden.doorfornoobz.mobs.models.pew_shot;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class Turret_PewRender extends EntityRenderer<Turret_Pew, Pew_ShotRenderState> {
    final pew_shot model;
    public Turret_PewRender(EntityRendererProvider.Context context) {
        super(context);
        this.model = 
    }

    @Override
    public void render(Pew_ShotRenderState renderState, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        super.render(renderState, poseStack, bufferSource, packedLight);
    }

    @Override
    public Pew_ShotRenderState createRenderState() {
        return new Pew_ShotRenderState();
    }
}
