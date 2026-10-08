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
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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
        lookAt(EntityAnchorArgument.Anchor.EYES, target.getEyePosition().subtract(getEyePosition()));

        if (!level().isClientSide) {
            ItemStack arrowstack = new ItemStack(Items.ARROW);
            double Xvel = target.getX()-this.getX();
            double Yvel = target.getEyeY()-this.getEyeY();
            double Zvel = target.getZ()-this.getZ();
           Arrow proj = new Arrow(level(),getX(), getY(), getZ(), arrowstack, null);
            proj.setPos(getEyePosition());
            proj.shoot(Xvel,Yvel, Zvel, 1.5f,0);
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
