package com.brayden.doorfornoobz;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class money_gun extends Item {
    HashMap <Item, Integer> RNG = new HashMap<>(){
        {put(Items.IRON_INGOT,67);
            put(Items.COAL,76);
            put(Items.GOLD_INGOT,58);
            put(Items.REDSTONE,36);
            put(Items.EMERALD,24);
            put(Items.DIAMOND,5);
            put(Items.NETHERITE_SCRAP,1);}
    };


    public money_gun(Properties properties) {
        super(properties);

    }
    @Override
    public int getUseDuration(ItemStack stack, LivingEntity entity) {
        return 72000;
    }
    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {

        player.startUsingItem(hand);
        return InteractionResult.CONSUME;


    }
    @Override
    public void onUseTick(Level level, LivingEntity livingEntity, ItemStack stack, int remainingUseDuration) {
        if (!level.isClientSide&&getUseDuration(stack,livingEntity) -remainingUseDuration >20){
        AtomicInteger sum = new AtomicInteger();
        RNG.forEach((I,Wieght)->{

            sum.addAndGet(Wieght);
        });
        int choice = level.random.nextInt(sum.get());
        for(Map.Entry<Item,Integer>entry:RNG.entrySet()){
            if (choice < entry.getValue()){
                ItemStack item = new ItemStack(entry.getKey(), 1);
                ItemEntity e = new ItemEntity(level, livingEntity.getX(),livingEntity.getEyeY(),livingEntity.getZ(), item);
                e.fallDistance = 0;
                e.setDeltaMovement(livingEntity.getLookAngle().scale(7D).add(0,0.2D,0));
                level.addFreshEntity(e);
                break;
            }
            else{
                choice -= entry.getValue();
            }
        }
        }
}}
