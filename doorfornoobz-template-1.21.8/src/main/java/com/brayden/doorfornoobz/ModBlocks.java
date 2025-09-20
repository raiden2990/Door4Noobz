package com.brayden.doorfornoobz;

import com.brayden.doorfornoobz.blocks.NotReallyABlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(doorfornoobz.MODID);


    public static final DeferredHolder<Block, NotReallyABlock> NOT_REALLY_A_BLOCK = BLOCKS.registerBlock(
            "mob_barrier_block",
            NotReallyABlock::new,
            BlockBehaviour.Properties.of().sound(SoundType.SLIME_BLOCK).pushReaction(PushReaction.NORMAL)
    );


}
