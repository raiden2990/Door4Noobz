package com.brayden.doorfornoobz.event;

import com.brayden.doorfornoobz.doorfornoobz;
import com.brayden.doorfornoobz.mobs.models.MinecraftGuardian;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = doorfornoobz.MODID)
public class ModEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(MinecraftGuardian.LAYER_LOCATION, MinecraftGuardian::createBodyLayer);
    }
}
