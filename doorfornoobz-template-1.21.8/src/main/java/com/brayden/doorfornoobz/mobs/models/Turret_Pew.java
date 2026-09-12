package com.brayden.doorfornoobz.mobs.models;

import com.brayden.doorfornoobz.ModEntityTypes;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class Turret_Pew extends ThrowableProjectile {
    public Turret_Pew(EntityType<? extends Turret_Pew> p_21368_,Level p_36834_) {
        super(p_21368_, p_36834_);
    }
    public Turret_Pew(Level p_36834_) {
        super(ModEntityTypes.TURRET_PEW.get(), p_36834_);
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {
        result.getEntity().hurt(this.damageSources().generic(), 5);
        discard();
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {

    }
}

