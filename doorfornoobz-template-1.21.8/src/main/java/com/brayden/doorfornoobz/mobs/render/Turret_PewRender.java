package com.brayden.doorfornoobz.mobs.render;

import com.brayden.doorfornoobz.mobs.models.Turret_Pew;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class Turret_PewRender extends EntityRenderer<Turret_Pew, Pew_ShotRenderState> {
    public Turret_PewRender(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public Pew_ShotRenderState createRenderState() {
        return new Pew_ShotRenderState();
    }
}
