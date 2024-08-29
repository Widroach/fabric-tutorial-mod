package com.tutorial.mod;

import net.fabricmc.api.ModInitializer;

public class ModBlocksInitializer implements ModInitializer {

    @Override
    public void onInitialize() {
        ModBlocks.register(ModBlocks.BETTER_DIRT, "better_dirt", true);
    }
}