package com.tutorial.mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class AncientSteelSword extends SwordItem {

    public AncientSteelSword(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
        initialize();
    }

    private void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register(itemGroup -> itemGroup.add(this));

        ItemGroupEvents.modifyEntriesEvent(ModGroups.TUTORIAL_MOD_ITEM_GROUP_KEY)
                .register(itemGroup -> itemGroup.add(this));
    }
}
