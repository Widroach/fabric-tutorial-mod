package com.tutorial.mod;

import net.fabricmc.api.ModInitializer;

public class ModBlocksInitializer implements ModInitializer {
    private static ModBlocks modBlocks = new ModBlocks();

    @Override
    public void onInitialize() {
        modBlocks.register(modBlocks.getBetterDirt(), "better_dirt", true);
    }
}