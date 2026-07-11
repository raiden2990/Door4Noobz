package com.brayden.doorfornoobz.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;

public class MoneyParticle extends TextureSheetParticle {
    private final SpriteSet set;

    public MoneyParticle(ClientLevel p_108323_, double p_108324_, double p_108325_, double p_108326_, SpriteSet set) {
        super(p_108323_, p_108324_, p_108325_, p_108326_);
        this.set = set;
        gravity = 0;

        this.setSpriteFromAge(set);
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    @Override
    public void tick() {
        this.setSpriteFromAge(set);

        super.tick();
    }
}
