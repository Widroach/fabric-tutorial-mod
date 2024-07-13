package com.tutorial.mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class SuspiciousDust extends Item {

    public SuspiciousDust(Settings settings) {
        super(settings);
        initialize();
    }

    private void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(itemGroup -> itemGroup.add(this));

        CompostingChanceRegistry.INSTANCE.add(this, 0.3f);
        FuelRegistry.INSTANCE.add(this, 30 * 20);
    }

}
