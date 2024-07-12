package com.tutorial.mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;

import java.util.*;

public class VikingArmor {
    public static final RegistryEntry<ArmorMaterial> VIKING_ARMOR = ModAmorMaterials.registerMaterial("viking_armor",
            Map.of(
                    ArmorItem.Type.HELMET, 3,
                    ArmorItem.Type.CHESTPLATE, 8,
                    ArmorItem.Type.LEGGINGS, 6,
                    ArmorItem.Type.BOOTS, 3),
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            () -> Ingredient.ofItems(Items.LEATHER),
            0.0F,
            0.0F,
            false);

    public static final Item VIKING_HELMET = ModItems
            .register(new ArmorItem(VIKING_ARMOR, ArmorItem.Type.HELMET, new Item.Settings()), "viking_helmet");
    public static final Item VIKING_VEST = ModItems
            .register(new ArmorItem(VIKING_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings()), "viking_vest");
    public static final Item VIKING_LEGGINGS = ModItems
            .register(new ArmorItem(VIKING_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings()), "viking_leggings");
    public static final Item VIKING_BOOTS = ModItems
            .register(new ArmorItem(VIKING_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings()), "viking_boots");

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register(itemGroup -> {
                    itemGroup.add(VIKING_HELMET);
                    itemGroup.add(VIKING_VEST);
                    itemGroup.add(VIKING_LEGGINGS);
                    itemGroup.add(VIKING_BOOTS);
                });
    }
}
