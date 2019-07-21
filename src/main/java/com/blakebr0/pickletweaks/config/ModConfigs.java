package com.blakebr0.pickletweaks.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfigs {
    public static final ForgeConfigSpec CLIENT;
    public static final ForgeConfigSpec COMMON;

    public static final ForgeConfigSpec.BooleanValue ENABLE_TOOL_INFO_TOOLTIP;
//    public static final ForgeConfigSpec.BooleanValue ENABLE_SWORD_INFO_TOOLTIP;

    // Client
    static {
        final ForgeConfigSpec.Builder client = new ForgeConfigSpec.Builder();

        client.comment("General configuration options").push("General");
        client.pop();

        client.comment("Disable features.").push("Features");
        ENABLE_TOOL_INFO_TOOLTIP = client
                .comment("Tool Information Tooltips enabled?")
                .translation("configGui.pickletweaks.enable_tool_info_tooltip")
                .define("toolInfoTooltip", true);
//        ENABLE_SWORD_INFO_TOOLTIP = client
//                .comment("Sword Information Tooltips enabled?")
//                .translation("configGui.pickletweaks.enable_sword.info_tooltip")
//                .define("swordInfoTooltip", true);
        client.pop();

        CLIENT = client.build();
    }

    public static final ForgeConfigSpec.DoubleValue MAGNET_RANGE;

    public static final ForgeConfigSpec.BooleanValue ENABLE_COLORED_COBBLESTONE;
    public static final ForgeConfigSpec.BooleanValue ENABLE_DARK_GLASS;

    public static final ForgeConfigSpec.BooleanValue ENABLE_COAL_PIECES;
    public static final ForgeConfigSpec.BooleanValue ENABLE_APPLES;
    public static final ForgeConfigSpec.BooleanValue ENABLE_WATERING_CAN;
    public static final ForgeConfigSpec.BooleanValue ENABLE_MESHES;
    public static final ForgeConfigSpec.BooleanValue ENABLE_MAGNET;
    public static final ForgeConfigSpec.BooleanValue ENABLE_NIGHT_VISION_GOGGLES;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PAXELS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_FLINT_GEAR;

    public static final ForgeConfigSpec.BooleanValue GRID_REPAIR_ENABLED;
    public static final ForgeConfigSpec.IntValue GRID_REPAIR_COST;
    public static final ForgeConfigSpec.BooleanValue GRID_REPAIR_DISABLE_DEFAULTS;
    public static final ForgeConfigSpec.BooleanValue GRID_REPAIR_OVERRIDE_MODE;
    public static final ForgeConfigSpec.BooleanValue GRID_REPAIR_CHEAP_SHOVEL;

    public static final ForgeConfigSpec.BooleanValue ENABLE_FLINT_DROP_TWEAK;

    // Common
    static {
        final ForgeConfigSpec.Builder common = new ForgeConfigSpec.Builder();

        common.comment("General configuration options.").push("General");
        MAGNET_RANGE = common
                .comment("The effective radius of the Magnet.")
                .translation("configGui.pickletweaks.magnet_range")
                .defineInRange("magnetRange", 7.0, 1.0, 16.0);
        common.pop();

        common.comment("Disable features.").push("Features");
        ENABLE_COLORED_COBBLESTONE = common
                .comment("Colored Cobblestone enabled?")
                .translation("configGui.pickletweaks.enable_colored_cobblestone")
                .define("coloredCobblestone", true);
        ENABLE_DARK_GLASS = common
                .comment("Dark Glass enabled?")
                .translation("configGui.pickletweaks.enable_dark_glass")
                .define("darkGlass", true);

        ENABLE_COAL_PIECES = common
                .comment("Coal and Charcoal Piece enabled?")
                .translation("configGui.pickletweaks.enable_coal_piece")
                .define("coalPiece", true);
        ENABLE_APPLES = common
                .comment("Diamond and Emerald Apples enabled?")
                .translation("configGui.pickletweaks.enable_apples")
                .define("apples", true);
        ENABLE_WATERING_CAN = common
                .comment("Watering Can enabled?")
                .translation("configGui.pickletweaks.enable_watering_can")
                .define("wateringCan", true);
        ENABLE_MESHES = common
                .comment("Enable Meshes?")
                .translation("configGui.pickletweaks.enable_meshes")
                .define("meshes", true);
        ENABLE_MAGNET = common
                .comment("Enable Magnet?")
                .translation("configGui.pickletweaks.enable_magnet")
                .define("magnet", true);
        ENABLE_NIGHT_VISION_GOGGLES = common
                .comment("Enable Night Vision Goggles?")
                .translation("configGui.pickletweaks.enable_night_vision_goggles")
                .define("nightVisionGoggles", true);
        ENABLE_PAXELS = common
                .comment("Enable Paxels?")
                .translation("configGui.pickletweaks.enable_paxels")
                .define("paxels", true);
        ENABLE_FLINT_GEAR = common
                .comment("Enable Flint tools and armor?")
                .translation("configGui.pickletweaks.enable_flint_gear")
                .define("flintGear", true);

        common.pop();

        common.push("Crafting grid tool repair configuration options.").push("Grid Repair");
        GRID_REPAIR_ENABLED = common
                .comment("Should Crafting Grid Tool Repairing be enabled?")
                .translation("configGui.pickletweaks.grid_repair_enabled")
                .define("enabled", true);
        GRID_REPAIR_COST = common
                .comment("How much material should be required to fully repair a tool.")
                .translation("configGui.pickletweaks.grid_repair_cost")
                .defineInRange("cost", 4, 1, 8);
        GRID_REPAIR_DISABLE_DEFAULTS = common
                .comment("Should default repair materials be disabled? Doing this makes it so ONLY the custom materials work.")
                .translation("configGui.pickletweaks.grid_repair_disable_defaults")
                .define("disableDefaults", false);
        GRID_REPAIR_OVERRIDE_MODE = common
                .comment("Enabling this makes it so custom repair materials override the default ones for the tools specified.")
                .translation("configGui.pickletweaks.grid_repair_override_mode")
                .define("overrideMode", false);
        GRID_REPAIR_CHEAP_SHOVEL = common
                .comment("Makes it so shovels need 50% less material to repair.")
                .translation("configGui.pickletweaks.grid_repair_cheap_shovel")
                .define("cheapShovel", true);
        common.pop();

        common.push("Disable and configure tweaks.").push("Tweaks");
        ENABLE_FLINT_DROP_TWEAK = common
                .comment("Enable no Flint Dropping from gravel?")
                .translation("configGui.pickletweaks.enable_flint_drop_tweak")
                .define("noFlintDrop", false);
        common.pop();

        COMMON = common.build();
    }
}