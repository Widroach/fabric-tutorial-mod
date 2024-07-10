package com.tutorial.mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class SuspiciousDust {
    private static final FoodComponent FOOD_COMPONENT = new FoodComponent(1, 1, true, 1, null, null);

    public static final Item SUSPICIOUS_DUST = ModItems.register(
            new Item(new Item.Settings().food(FOOD_COMPONENT)),
            "suspicious_dust");

    public static void initialize(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
            .register(itemGroup -> itemGroup.add(SuspiciousDust.SUSPICIOUS_DUST));
    }

}
