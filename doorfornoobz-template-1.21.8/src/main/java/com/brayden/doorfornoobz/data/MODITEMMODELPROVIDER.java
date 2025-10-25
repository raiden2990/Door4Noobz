package com.brayden.doorfornoobz.data;

import com.brayden.doorfornoobz.ModBlocks;
import com.brayden.doorfornoobz.Moditems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.renderer.item.BlockModelWrapper;
import net.minecraft.client.renderer.item.ClientItem;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.fml.common.Mod;

import java.util.Collections;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class MODITEMMODELPROVIDER extends ModelProvider {

    public MODITEMMODELPROVIDER(PackOutput output) {
        super(output, "doorfornoobz");
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        super.registerModels(blockModels, itemModels);

        blockModels.createCraftingTableLike(ModBlocks.NOT_REALLY_A_BLOCK.get(), Blocks.BIRCH_WOOD, new BiFunction<Block, Block, TextureMapping>(){
            @Override
            public TextureMapping apply(Block block, Block block2) {
                return null;
            }
        });
        blockModels.createFlatItemModelWithBlockTexture(Moditems.MOB_BARRIER_BLOCK.get(), ModBlocks.NOT_REALLY_A_BLOCK.get());
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return Moditems.ITEMS.getEntries().stream();
    }

    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream();
    }
}
