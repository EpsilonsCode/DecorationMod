package com.example.examplemod;

import net.minecraft.util.StringRepresentable;

public enum LavaWoodType implements StringRepresentable {
    OAK("oak"),
    SPRUCE("spruce"),
    BIRCH("birch"),
    ACACIA("acacia"),
    JUNGLE("jungle"),
    DARK_OAK("dark_oak");

    private final String name;

    private LavaWoodType(String p_61824_) {
        this.name = p_61824_;
    }

    public String toString() {
        return this.getSerializedName();
    }

    public String getSerializedName() {
        return this.name;
    }
}
