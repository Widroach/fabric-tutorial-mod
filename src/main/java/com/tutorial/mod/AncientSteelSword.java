package com.tutorial.mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;

public class AncientSteelSword {
    public static final AncientSteelMaterial INSTANCE = new AncientSteelMaterial();
    public static final Item ANCIENT_STEEL_SWORD = ModItems.register(new SwordItem(INSTANCE, new Item.Settings()), "ancient_steel_sword");

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
            .register(itemGroup -> itemGroup.add(ANCIENT_STEEL_SWORD));
    }
}
