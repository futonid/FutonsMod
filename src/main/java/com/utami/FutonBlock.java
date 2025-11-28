package com.utami;

import net.minecraft.block.*;
import net.minecraft.block.enums.BedPart;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.util.DyeColor;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;

import java.util.List;


public class FutonBlock extends BedBlock {

    private static final VoxelShape SHAPE =
            Block.createCuboidShape(0, 0, 0, 16, 4, 16);

    public FutonBlock(DyeColor color, Settings settings) {
        super(color, settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
    //quick fix for drops
    @Override
    public List<ItemStack> getDroppedStacks(BlockState state, LootContextParameterSet.Builder builder) {
        // Only Head Drop
        if (state.get(PART) == BedPart.FOOT) {
            return List.of();
        }
        return List.of(new ItemStack(this.asItem()));
    }
}

