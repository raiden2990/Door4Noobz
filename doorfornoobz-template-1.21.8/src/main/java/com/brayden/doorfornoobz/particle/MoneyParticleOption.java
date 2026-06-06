package com.brayden.doorfornoobz.particle;

import com.brayden.doorfornoobz.mode_particles;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;

public class MoneyParticleOption implements ParticleOptions {
    @Override
    public ParticleType<?> getType() {
        return mode_particles.MONEY.get();
    }
}
