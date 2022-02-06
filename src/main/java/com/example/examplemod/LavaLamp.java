package com.example.examplemod;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class LavaLamp extends Block {
    public static final EnumProperty<LavaWoodType> LAVA_WOOD_TYPE = DecorationBlockStateProperties.LAVA_WOOD_TYPE;
    public static final EnumProperty<LavaColor> LAVA_COLOR = DecorationBlockStateProperties.LAVA_COLOR;
    public static final EnumProperty<GlassColor> GLASS_COLOR = DecorationBlockStateProperties.GLASS_COLOR;

    private static final VoxelShape SHAPES = Stream.of(
            Block.box(6, 0, 6, 10, 2, 10),
            Block.box(7, 2, 7, 9, 4, 9),
            Block.box(6, 4, 6, 10, 14, 10)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public LavaLamp() {
        super(Properties.of(Material.WOOD).noOcclusion());
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(LAVA_COLOR, LavaColor.ORANGE)
                .setValue(GLASS_COLOR, GlassColor.CLEAR)
                .setValue(LAVA_WOOD_TYPE, LavaWoodType.OAK));
    }

    @Deprecated
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return SHAPES;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(LAVA_COLOR, GLASS_COLOR, LAVA_WOOD_TYPE);
    }
}
