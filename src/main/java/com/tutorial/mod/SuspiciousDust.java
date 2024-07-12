package com.tutorial.mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class SuspiciousDust {
    private static final FoodComponent FOOD_COMPONENT = new FoodComponent.Builder()
        .alwaysEdible()
        .nutrition(5)
        .saturationModifier(10f)
        .snack()
        .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20 * 20, 1), 1.0f)
        .build();

    public static final Item SUSPICIOUS_DUST = ModItems.register(
            new Item(new Item.Settings().food(FOOD_COMPONENT)),
            "suspicious_dust");

    public static void initialize(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
            .register(itemGroup -> itemGroup.add(SuspiciousDust.SUSPICIOUS_DUST));
        
        CompostingChanceRegistry.INSTANCE.add(SUSPICIOUS_DUST, 0.3f);

        FuelRegistry.INSTANCE.add(SUSPICIOUS_DUST, 30 * 20);
    }

}
