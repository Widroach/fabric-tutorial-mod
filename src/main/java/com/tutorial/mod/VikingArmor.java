package com.tutorial.mod;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
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
}
