package com.brayden.doorfornoobz.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;
import org.jetbrains.annotations.Nullable;

public class MoneyParticleProvider implements ParticleProvider<SimpleParticleType> {
    private final SpriteSet set;

    public MoneyParticleProvider(SpriteSet sett) {
        this.set = sett;
    }

    @Nullable
    @Override
    public Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel clientLevel, double v, double v1, double v2, double v3, double v4, double v5) {
        return new MoneyParticle(clientLevel, v,v1,v2,set);
    }
}
