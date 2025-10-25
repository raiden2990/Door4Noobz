package com.brayden.doorfornoobz.data;

import com.brayden.doorfornoobz.Moditems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.renderer.item.BlockModelWrapper;
import net.minecraft.client.renderer.item.ClientItem;
import net.minecraft.data.PackOutput;

import java.util.Collections;

public class MODITEMMODELPROVIDER extends ModelProvider {

    public MODITEMMODELPROVIDER(PackOutput output) {
        super(output, "doorfornoobz");
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        super.registerModels(blockModels, itemModels);

        itemModels.itemModelOutput.register(
                Moditems.MOB_BARRIER_BLOCK.get(),
                new ClientItem(
                        new BlockModelWrapper.Unbaked(
                                ModelLocationUtils.getModelLocation(Moditems.MOB_BARRIER_BLOCK.get()),
                                Collections.emptyList()
                        ),
                        new ClientItem.Properties(false, false)
                )
        );
    }
}
