package com.brayden.doorfornoobz;

import com.brayden.doorfornoobz.mobs.models.GuardianEntity;
import com.brayden.doorfornoobz.mobs.models.TurretEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntityTypes {
    public static final DeferredRegister.Entities ENTITIES = DeferredRegister.createEntities(doorfornoobz.MODID);
    public static ResourceKey<EntityType<?>> GUARDIAN_KEY = ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.withDefaultNamespace("minecraftguardian"));
    public static final Supplier<EntityType<GuardianEntity>> GUARDIAN_BOB =
            ENTITIES.register("minecraftguardian", () -> EntityType.Builder.of(GuardianEntity::new, MobCategory.CREATURE).build(GUARDIAN_KEY));

    public static ResourceKey<EntityType<?>> Turret_KEY = ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.withDefaultNamespace("turret"));
    public static final Supplier<EntityType<TurretEntity>> TURRET_BOB =
            ENTITIES.register("turret", ()-> EntityType.Builder.of(TurretEntity::new, MobCategory.CREATURE).build(Turret_KEY));






}

