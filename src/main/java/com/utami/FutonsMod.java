package com.utami;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class FutonsMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("futonsmod");
    public static final String MOD_ID = "futonsmod";

    @Override
    public void onInitialize() {
        // call saves the item
        ModBlocks.initialize();

        // registration to functional items
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModBlocks.FUTON_WHITE);
            entries.add(ModBlocks.FUTON_BLACK);
            entries.add(ModBlocks.FUTON_BLUE);
            entries.add(ModBlocks.FUTON_BROWN);
            entries.add(ModBlocks.FUTON_CYAN);
            entries.add(ModBlocks.FUTON_GRAY);
            entries.add(ModBlocks.FUTON_GREEN);
            entries.add(ModBlocks.FUTON_LIGHT_BLUE);
            entries.add(ModBlocks.FUTON_LIGHT_GRAY);
            entries.add(ModBlocks.FUTON_LIME);
            entries.add(ModBlocks.FUTON_MAGENTA);
            entries.add(ModBlocks.FUTON_ORANGE);
            entries.add(ModBlocks.FUTON_PINK);
            entries.add(ModBlocks.FUTON_PURPLE);
            entries.add(ModBlocks.FUTON_RED);
            entries.add(ModBlocks.FUTON_YELLOW);
        });

        LOGGER.info("Futons!");
    }
}