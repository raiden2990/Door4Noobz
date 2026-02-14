package com.brayden.doorfornoobz;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(doorfornoobz.MODID);

    public static final DeferredItem<BlockItem> MOB_BARRIER_BLOCK = ITEMS.registerSimpleBlockItem(ModBlocks.NOT_REALLY_A_BLOCK);

    public static  final DeferredItem<SpawnEggItem> TOTALLY_nOT_AN_eGG_THATWILL_PROTECT_U = ITEMS.registerItem("totally_not_an_egg_thatwill_protect_u",
            properties -> new SpawnEggItem(ModEntityTypes.GUARDIAN_BOB.get(), properties));
}
