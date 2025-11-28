package com.utami;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        // register the block and its item.
        Identifier id = new Identifier(FutonsMod.MOD_ID, name);
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if(shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM,id,blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
        /*
        "What's its name?"
        "What's your block's object?"
        "Do you want to appear in the login?"
        "Yes -> Block Item Add"
        "Save your block"
        "return"

         */
    }

    public static final Block FUTON_WHITE = register(
            new FutonBlock(
                    DyeColor.WHITE,
                    AbstractBlock.Settings.copy(Blocks.WHITE_BED)
            ),
            "white_futon",
            true
    );
    public static final Block FUTON_BLACK = register(
            new FutonBlock(
                    DyeColor.BLACK,
                    AbstractBlock.Settings.copy(Blocks.BLACK_BED)
            ),
            "black_futon",
            true
    );
    public static final Block FUTON_BLUE = register(
            new FutonBlock(
                    DyeColor.BLUE,
                    AbstractBlock.Settings.copy(Blocks.BLUE_BED)
            ),
            "blue_futon",
            true
    );
    public static final Block FUTON_BROWN = register(
            new FutonBlock(
                    DyeColor.BLUE,
                    AbstractBlock.Settings.copy(Blocks.BROWN_BED)
            ),
            "brown_futon",
            true
    );
    public static final Block FUTON_CYAN = register(
            new FutonBlock(
                    DyeColor.CYAN,
                    AbstractBlock.Settings.copy(Blocks.CYAN_BED)
            ),
            "cyan_futon",
            true
    );
    public static final Block FUTON_GRAY = register(
            new FutonBlock(
                    DyeColor.GRAY,
                    AbstractBlock.Settings.copy(Blocks.GRAY_BED)
            ),
            "gray_futon",
            true
    );
    public static final Block FUTON_GREEN = register(
            new FutonBlock(
                    DyeColor.GREEN,
                    AbstractBlock.Settings.copy(Blocks.GREEN_BED)
            ),
            "green_futon",
            true
    );
    public static final Block FUTON_LIGHT_BLUE = register(
            new FutonBlock(
                    DyeColor.LIGHT_BLUE,
                    AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_BED)
            ),
            "light_blue_futon",
            true
    );
    public static final Block FUTON_LIGHT_GRAY = register(
            new FutonBlock(
                    DyeColor.LIGHT_GRAY,
                    AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_BED)
            ),
            "light_gray_futon",
            true
    );
    public static final Block FUTON_LIME = register(
            new FutonBlock(
                    DyeColor.LIME,
                    AbstractBlock.Settings.copy(Blocks.LIME_BED)
            ),
            "lime_futon",
            true
    );
    public static final Block FUTON_MAGENTA = register(
            new FutonBlock(
                    DyeColor.MAGENTA,
                    AbstractBlock.Settings.copy(Blocks.MAGENTA_BED)
            ),
            "magenta_futon",
            true
    );
    public static final Block FUTON_ORANGE = register(
            new FutonBlock(
                    DyeColor.ORANGE,
                    AbstractBlock.Settings.copy(Blocks.ORANGE_BED)
            ),
            "orange_futon",
            true
    );
    public static final Block FUTON_PINK = register(
            new FutonBlock(
                    DyeColor.PINK,
                    AbstractBlock.Settings.copy(Blocks.PINK_BED)
            ),
            "pink_futon",
            true
    );
    public static final Block FUTON_PURPLE = register(
            new FutonBlock(
                    DyeColor.PURPLE,
                    AbstractBlock.Settings.copy(Blocks.PURPLE_BED)
            ),
            "purple_futon",
            true
    );
    public static final Block FUTON_RED = register(
            new FutonBlock(
                    DyeColor.RED,
                    AbstractBlock.Settings.copy(Blocks.RED_BED)
            ),
            "red_futon",
            true
    );
    public static final Block FUTON_YELLOW = register(
            new FutonBlock(
                    DyeColor.YELLOW,
                    AbstractBlock.Settings.copy(Blocks.YELLOW_BED)
            ),
            "yellow_futon",
            true
    );


    public static void initialize() {
    }


}
