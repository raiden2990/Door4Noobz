package com.brayden.doorfornoobz;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(doorfornoobz.MODID)
public class doorfornoobz {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "doorfornoobz";
    public static final Logger LOGGER = LogUtils.getLogger();

    public doorfornoobz(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        ModBlocks.BLOCKS.register(modEventBus);
        Moditems.ITEMS.register(modEventBus);
        ModEntityTypes.ENTITIES.register(modEventBus);
        modEventBus.addListener(EntityAttributeCreationEvent.class, doorfornoobz::createDefaultAttributes);


        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (doorfornoobz) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);


        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }




    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.LOG_DIRT_BLOCK.getAsBoolean()) {
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));
        }

        LOGGER.info("{}{}", Config.MAGIC_NUMBER_INTRODUCTION.get(), Config.MAGIC_NUMBER.getAsInt());

        Config.ITEM_STRINGS.get().forEach((item) -> LOGGER.info("ITEM >> {}", item));
    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    public static void createDefaultAttributes(EntityAttributeCreationEvent event) {
        event.put(
                ModEntityTypes.GUARDIAN_BOB.get(),
                LivingEntity.createLivingAttributes()
                        .add(Attributes.ATTACK_DAMAGE, 7)
                        .add(Attributes.ATTACK_KNOCKBACK, 67)
                        .add(Attributes.ATTACK_SPEED, 9)
                        .add(Attributes.MAX_HEALTH, 267)
                        .add(Attributes.BURNING_TIME, 3)
                        .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, 6)
                        .add(Attributes.JUMP_STRENGTH,20 )
                        .add(Attributes.MOVEMENT_SPEED, 30)
                        .add(Attributes.FOLLOW_RANGE, 50)
                        .build()
        );
    }
}
