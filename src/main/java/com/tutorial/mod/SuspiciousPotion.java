package com.tutorial.mod;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.entry.RegistryEntry;

public class SuspiciousPotion extends Potion {

    public SuspiciousPotion() {
        super(new SuspiciousPotionStatusEffect());
        initialize();
    }

    private void initialize() {
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.registerPotionRecipe(
                Potions.WATER,
                ModItems.SUSPICIOUS_DUST,
                RegistryEntry.of(ModItems.SUSPICIOUS_POTION)));
    }
}
