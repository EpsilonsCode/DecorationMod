package com.example.examplemod;

import net.minecraft.world.level.block.state.properties.EnumProperty;

public class DecorationBlockStateProperties {
    public static final EnumProperty<LavaColor> LAVA_COLOR = EnumProperty.create("lava_color", LavaColor.class);
    public static final EnumProperty<GlassColor> GLASS_COLOR = EnumProperty.create("glass_color", GlassColor.class);
    public static final EnumProperty<LavaWoodType> LAVA_WOOD_TYPE = EnumProperty.create("lava_wood_type", LavaWoodType.class);
}
