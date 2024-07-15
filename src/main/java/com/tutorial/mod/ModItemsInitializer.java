package com.tutorial.mod;

import net.fabricmc.api.ModInitializer;

public class ModItemsInitializer implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItems.register(ModItems.SUSPICIOUS_DUST, "suspicious_dust");
        ModItems.register(ModItems.THE_MIGHTY_STICK, "the_mighty_stick");
        ModItems.register(ModItems.ANCIENT_STEEL_SWORD, "ancient_steel_sword");
        ModItems.register(ModItems.VIKING_HELMET, "viking_helmet");
        ModItems.register(ModItems.VIKING_VEST, "viking_vest");
        ModItems.register(ModItems.VIKING_LEGGINS, "viking_leggings");
        ModItems.register(ModItems.VIKING_BOOTS, "viking_boots");
    }

}
