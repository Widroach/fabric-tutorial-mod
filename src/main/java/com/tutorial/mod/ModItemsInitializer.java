package com.tutorial.mod;

import net.fabricmc.api.ModInitializer;

public class ModItemsInitializer implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItems.registerItem(ModItems.SUSPICIOUS_DUST, "suspicious_dust");
        ModItems.registerItem(ModItems.THE_MIGHTY_STICK, "the_mighty_stick");
        ModItems.registerItem(ModItems.ANCIENT_STEEL_SWORD, "ancient_steel_sword");
        ModItems.registerItem(ModItems.VIKING_HELMET, "viking_helmet");
        ModItems.registerItem(ModItems.VIKING_VEST, "viking_vest");
        ModItems.registerItem(ModItems.VIKING_LEGGINS, "viking_leggings");
        ModItems.registerItem(ModItems.VIKING_BOOTS, "viking_boots");
        
        ModItems.registerPotion(ModItems.SUSPICIOUS_POTION, "suspicious_potion");
    }

}
