package com.tutorial.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;

public class ModItemsInitializer implements ModInitializer {
    private static ModItems modItems = new ModItems();

    @Override
    public void onInitialize() {
        modItems.addItem(new TheMightyStick(new Item.Settings()), "the_mighty_stick");
        modItems.addItem(new AncientSteelSword(new AncientSteelMaterial(), new Item.Settings()), "ancient_steel_sword");
    }

}
