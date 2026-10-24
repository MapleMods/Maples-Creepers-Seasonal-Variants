package io.github.maplemods.maplescreepersseasonalvariants;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplescreepersseasonalvariants.data.Constants;
import net.minecraft.world.entity.EntityTypes;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerCategory(Constants.MOD_ID, "spring", "season", 3, 1, 5, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "summer", "season", 6, 1, 8, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "autumn", "season", 9, 1, 11, 30);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "winter", "season", 12, 1, 2, 28);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CREEPER, "autumn", "flannel_creeper", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "autumn", "flannel_creeper", "*", "flannel_creeper");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "autumn", "flannel_creeper", "*baby", "flannel_creeper");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CREEPER, "autumn", "pumpkin_creeper", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "autumn", "pumpkin_creeper", "*", "pumpkin_creeper");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "autumn", "pumpkin_creeper", "*baby", "pumpkin_creeper");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CREEPER, "spring", "cherry_blossom_creeper", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "spring", "cherry_blossom_creeper", "*", "cherry_blossom_creeper");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "spring", "cherry_blossom_creeper", "*baby", "cherry_blossom_creeper");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CREEPER, "spring", "flower_creeper", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "spring", "flower_creeper", "*", "flower_creeper");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "spring", "flower_creeper", "*baby", "flower_creeper");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CREEPER, "summer", "midsommar_creeper", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "summer", "midsommar_creeper", "*", "midsommar_creeper");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "summer", "midsommar_creeper", "*baby", "midsommar_creeper");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CREEPER, "summer", "sunflower_creeper", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "summer", "sunflower_creeper", "*", "sunflower_creeper");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "summer", "sunflower_creeper", "*baby", "sunflower_creeper");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CREEPER, "winter", "frozen_creeper", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "winter", "frozen_creeper", "*", "frozen_creeper");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "winter", "frozen_creeper", "*baby", "frozen_creeper");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.CREEPER, "winter", "snow_covered_creeper", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "winter", "snow_covered_creeper", "*", "snow_covered_creeper");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityTypes.CREEPER, "winter", "snow_covered_creeper", "*baby", "snow_covered_creeper");
    }
}
