package com.brayden.doorfornoobz.data;

import com.brayden.doorfornoobz.doorfornoobz;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = doorfornoobz.MODID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator dg = event.getGenerator();
        PackOutput pack = dg.getPackOutput();

        dg.addProvider(true, new MODITEMMODELPROVIDER(pack));
    }

    @SubscribeEvent
    public static void gatherServerData(GatherDataEvent.Server event) {
        DataGenerator dg = event.getGenerator();
        PackOutput pack = dg.getPackOutput();

        dg.addProvider(true, new MODITEMMODELPROVIDER(pack));
    }
}
