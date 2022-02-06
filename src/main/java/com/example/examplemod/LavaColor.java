package com.example.examplemod;

import net.minecraft.util.StringRepresentable;

public enum LavaColor implements StringRepresentable {
    WHITE("white"),
    ORANGE("orange"),
    MAGENTA("magenta"),
    LIGHT_BLUE("light_blue"),
    YELLOW("yellow"),
    LIME("lime"),
    PINK("pink"),
    GRAY("gray"),
    LIGHT_GRAY("light_gray"),
    CYAN("cyan"),
    PURPLE("purple"),
    BLUE("blue"),
    BROWN("brown"),
    GREEN("green"),
    RED("red"),
    BLACK("black");

    private final String name;

    private LavaColor(String p_61824_) {
        this.name = p_61824_;
    }

    public String toString() {
        return this.getSerializedName();
    }

    public String getSerializedName() {
        return this.name;
    }
}