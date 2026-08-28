package com.brayden.doorfornoobz.mobs.models;

import com.brayden.doorfornoobz.ModEntityTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.level.Level;

public class Turret_Pew extends AbstractHurtingProjectile {
    public Turret_Pew(EntityType<? extends Turret_Pew> p_21368_,Level p_36834_) {
        super(p_21368_, p_36834_);
    }
    public Turret_Pew(Level p_36834_) {
        super(ModEntityTypes.TURRET_PEW.get(), p_36834_);
    }


    }

