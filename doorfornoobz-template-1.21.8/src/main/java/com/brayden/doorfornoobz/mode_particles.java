package com.brayden.doorfornoobz;

import net.minecraft.client.particle.Particle;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class mode_particles {
    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, doorfornoobz.MODID);

    public static final DeferredHolder<ParticleType<?>, ParticleType<SimpleParticleType>> MONEY = PARTICLES.register("money", () -> new SimpleParticleType(false));
}
