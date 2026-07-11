package com.brayden.doorfornoobz.mobs.models;

import
import com.jcraft.jorbis.Block;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.level.Level;

public class TurretEntity extends Mob implements  {

    protected TurretEntity(EntityType<? extends Mob> p_21368_, Level p_21369_) {
        super(p_21368_, p_21369_);
    }
}
//hp:15
//range 20x20x20
//shoots arrows(for now)
//3 arrows per second
//ammo infinate
//targets: hostile mobs
//damage: 6
//players reaction:=D