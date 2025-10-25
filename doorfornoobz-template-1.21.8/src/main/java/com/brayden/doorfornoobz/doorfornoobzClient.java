package com.brayden.doorfornoobz;

import com.brayden.doorfornoobz.data.MODITEMMODELPROVIDER;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.data.event.GatherDataEvent;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = doorfornoobz.MODID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = doorfornoobz.MODID, value = Dist.CLIENT)
public class doorfornoobzClient {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        //event.createProvider(MODITEMMODELPROVIDER::new);
    }
    public doorfornoobzClient(ModContainer container) {
        // Allows NeoForge to create a config screen for this mod's configs.
        // The config screen is accessed by going to the Mods screen > clicking on your mod > clicking on config.
        // Do not forget to add translations for your config options to the en_us.json file.
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);

    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        // Some client setup code
        doorfornoobz.LOGGER.info("HELLO FROM CLIENT SETUP");
        doorfornoobz.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }
}
