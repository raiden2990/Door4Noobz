package com.brayden.doorfornoobz.mobs.models;

import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.server.commands.LookAt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class TurretEntity extends Mob implements RangedAttackMob{

    public TurretEntity(EntityType<? extends Mob> p_21368_, Level p_21369_) {
        super(p_21368_, p_21369_);
    }

    @Override
    protected void registerGoals() {
        goalSelector.addGoal(1,new RangedAttackGoal(this,1,10 ,20));
        targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Mob.class,5, true, false, ((livingEntity, serverLevel) -> livingEntity instanceof Enemy) ));
    }

    @Override
    public void performRangedAttack(LivingEntity target, float v) {
        lookAt(EntityAnchorArgument.Anchor.EYES, target.getEyePosition().reverse());

        if (!level().isClientSide) {
            Turret_Pew proj = new Turret_Pew(target.level());
            proj.shootFromRotation(this, getXRot(), getYRot(),0, 75, 0);
            level().addFreshEntity(proj);
        }

    }

    @Override
    public boolean isPushable() {
        return false;
    }
}
//hp:15
//range 20x20x20
//shoots arrows(for now)
//3 arrows per second
//ammo infinate
//targets: hostile mobs
//damage: 6
//players reaction =D
