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

    public static final DeferredItem <Potatio_MINIGun> An_Item_That_Goes_Pew_Pew_Pew = ITEMS.registerItem("an_item_that_goes_pew_pew_pew", Potatio_MINIGun::new);

    public static final DeferredItem <money_gun> bad_income = ITEMS.registerItem("bad_income", money_gun::new);
}


