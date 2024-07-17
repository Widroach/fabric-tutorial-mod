package com.tutorial.mod;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.entry.RegistryEntry;

public class SuspiciousPotionStatusEffect extends StatusEffectInstance {

    public SuspiciousPotionStatusEffect(RegistryEntry<StatusEffect> effect, int duration, int amplifier) {
        super(effect, duration, amplifier);
    }

    public SuspiciousPotionStatusEffect() {
        this(StatusEffects.GLOWING, 600 * 20, 1);
    }

}
