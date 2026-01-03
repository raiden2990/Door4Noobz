package com.brayden.doorfornoobz.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.EntityCollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class NotReallyABlock extends Block {
    public NotReallyABlock(Properties p) {
        super(p);
    }

    @Override
    public void fallOn(Level level, BlockState state, BlockPos pos, Entity entity, double fallDistance) {
        if (entity instanceof Player) {
            entity.fallDistance = 0;
            ((Player) entity).setIgnoreFallDamageFromCurrentImpulse(true);
        }
        super.fallOn(level, state, pos, entity, fallDistance);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof Player) {
            entity.fallDistance = 0;
            ((Player) entity).setIgnoreFallDamageFromCurrentImpulse(true);
        }
        super.stepOn(level, pos, state, entity);
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        if (context instanceof EntityCollisionContext ecc) {
            if (ecc.getEntity() instanceof Player) {
                return Shapes.empty();
            }
        }
        return super.getCollisionShape(state, level, pos, context);


    }

    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity, InsideBlockEffectApplier effectApplier) {
        if (!(entity instanceof LivingEntity) || entity.getInBlockState().is(this)) {
            entity.makeStuckInBlock(state, new Vec3(0.9D, 1.5D, 0.9D));
        }
    }
}
