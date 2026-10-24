package io.github.maplemods.maplescreepersseasonalvariants;

import io.github.maplemods.maplescreepersseasonalvariants.data.Constants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ForgeMod {

    public ForgeMod(FMLJavaModLoadingContext modLoadingContext) {
        CommonMod.init();
    }
}