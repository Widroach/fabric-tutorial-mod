package com.tutorial.mod;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class SuspiciousDustFoodComponent{
    private final FoodComponent foodComponent;

    public SuspiciousDustFoodComponent() {
        foodComponent = new FoodComponent.Builder()
                .alwaysEdible()
                .nutrition(5)
                .saturationModifier(10f)
                .snack()
                .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20 * 20, 1), 1.0f)
                .build();
    }

    public FoodComponent getFoodComponent() {
        return foodComponent;
    }
}
