package com.brayden.doorfornoobz;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.Tags;

public class Potatio_MINIGun extends Item {
    public Potatio_MINIGun(Properties properties) {
        super(properties);
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity entity) {
        return 72000;
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {

        Arrow arrow = new Arrow(level, player, Items.ARROW.getDefaultInstance(), this.getDefaultInstance());
        arrow.shootFromRotation(player,player.getXRot(),player.getYRot(),0,20,3.5f);
        player.startUsingItem(hand);
        return InteractionResult.CONSUME;
    }

    @Override
    public void onUseTick(Level level, LivingEntity livingEntity, ItemStack stack, int remainingUseDuration) {
        if (!level.isClientSide&&getUseDuration(stack,livingEntity) -remainingUseDuration >20){
            PrimedTnt tnt = EntityType.TNT.spawn((ServerLevel)level , livingEntity.getOnPos() ,EntitySpawnReason.SPAWN_ITEM_USE);
            tnt.setDeltaMovement(livingEntity.getLookAngle().scale(7d));
            level.addFreshEntity(tnt);
        }
        super.onUseTick(level, livingEntity, stack, remainingUseDuration);
    }
}
