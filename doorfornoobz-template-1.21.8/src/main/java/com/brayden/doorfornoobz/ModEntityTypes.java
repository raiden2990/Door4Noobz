package com.brayden.doorfornoobz;

import com.brayden.doorfornoobz.mobs.models.GuardianEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntityTypes {
    public static final DeferredRegister.Entities ENTITIES = DeferredRegister.createEntities(doorfornoobz.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<GuardianEntity>> GUARDIAN_BOB =
            ENTITIES.registerEntityType("minecraftguardian", GuardianEntity::new, MobCategory.CREATURE);
}
