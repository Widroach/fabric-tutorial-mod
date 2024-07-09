package com.tutorial.mod;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;

public class SuspiciousDust {
    static final FoodComponent FOOD_COMPONENT = new FoodComponent(1, 1, true, 1, null, null);

    public static final Item SUSPICIOUS_DUST = ModItems.register(
            new Item(new Item.Settings().food(FOOD_COMPONENT)),
            "suspicious_dust");

}
