package com.brayden.doorfornoobz;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(doorfornoobz.MODID);

    public static final DeferredItem<BlockItem> MOB_BARRIER_BLOCK = ITEMS.registerSimpleBlockItem(ModBlocks.NOT_REALLY_A_BLOCK);
}
