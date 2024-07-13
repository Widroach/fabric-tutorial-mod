package com.tutorial.mod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public class AncientSteelMaterial implements ToolMaterial {

    @Override
    public float getAttackDamage() {
        return 5.0f;
    }

    @Override
    public int getDurability() {
        return 455;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return BlockTags.INCORRECT_FOR_STONE_TOOL;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(
                new SuspiciousDust(new Item.Settings().food(new SuspiciousDustFoodComponent().getFoodComponent())),
                Items.IRON_INGOT);
    }

}
