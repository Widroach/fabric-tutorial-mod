package com.tutorial.mod;


import net.fabricmc.api.ModInitializer;

public class ModItemsInitializer implements ModInitializer {

    @Override
    public void onInitialize() {
        SuspiciousDust.initialize();
        AncientSteelSword.initialize();
    }

}
