package com.brayden.doorfornoobz.blocks;

import com.brayden.doorfornoobz.Moditems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class Lucky_Block extends Block  {
    public Lucky_Block(Properties p_49795_) {
        super(p_49795_);
    }
    @Override
    public void destroy(LevelAccessor level, BlockPos pos, BlockState state) {
        int choice = level.getRandom().nextInt(3);

        if (choice==0){
            ItemStack item = new ItemStack(Moditems.bad_income.get(),1);
            ItemEntity e = new ItemEntity((Level)level, pos.getX(),pos.getY(),pos.getZ(), item);
            level.addFreshEntity(e);
        }
        else if (choice == 1) {
            ItemStack item = new ItemStack(Moditems.TOTALLY_nOT_AN_eGG_THATWILL_PROTECT_U.get(), 1);
            ItemEntity e = new ItemEntity((Level) level, pos.getX(), pos.getY(), pos.getZ(), item);
            level.addFreshEntity(e);
        }
        else if (choice == 2) {
            ItemStack item = new ItemStack(Moditems.An_Item_That_Goes_Pew_Pew_Pew.get(), 1);
            ItemEntity e = new ItemEntity((Level) level, pos.getX(), pos.getY(), pos.getZ(), item);
            level.addFreshEntity(e);
        }
        super.destroy(level, pos, state);
    }
}

