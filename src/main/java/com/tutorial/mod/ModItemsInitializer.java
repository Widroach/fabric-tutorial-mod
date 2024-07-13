package com.tutorial.mod;

import com.tutorial.mod.viking_armor.VikingAmorMaterial;
import com.tutorial.mod.viking_armor.VikingBoots;
import com.tutorial.mod.viking_armor.VikingHelmet;
import com.tutorial.mod.viking_armor.VikingLeggins;
import com.tutorial.mod.viking_armor.VikingVest;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class ModItemsInitializer implements ModInitializer {
    private static ModItems modItems = new ModItems();
    private static TutorialModItemGroup tutorialModItemGroup = new TutorialModItemGroup();

    @Override
    public void onInitialize() {
        tutorialModItemGroup.initialize();

        modItems.addItem(new TheMightyStick(new Item.Settings()), "the_mighty_stick");
        modItems.addItem(new AncientSteelSword(new AncientSteelMaterial(), new Item.Settings()), "ancient_steel_sword");
        modItems.addItem(
                new SuspiciousDust(new Item.Settings().food(new SuspiciousDustFoodComponent().getFoodComponent())),
                "suspicious_dust");
        modItems.addItem(
                new VikingHelmet(new VikingAmorMaterial().getMaterial(), ArmorItem.Type.HELMET, new Item.Settings()),
                "viking_helmet");
        modItems.addItem(
                new VikingVest(new VikingAmorMaterial().getMaterial(), ArmorItem.Type.CHESTPLATE, new Item.Settings()),
                "viking_vest");
        modItems.addItem(
                new VikingLeggins(new VikingAmorMaterial().getMaterial(), ArmorItem.Type.LEGGINGS, new Item.Settings()),
                "viking_leggings");
        modItems.addItem(
                new VikingBoots(new VikingAmorMaterial().getMaterial(), ArmorItem.Type.BOOTS, new Item.Settings()),
                "viking_boots");
    }

}
