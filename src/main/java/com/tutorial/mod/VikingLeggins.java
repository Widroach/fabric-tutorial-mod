package com.tutorial.mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.entry.RegistryEntry;

public class VikingLeggins extends ArmorItem {

    public VikingLeggins(RegistryEntry<ArmorMaterial> material, Type type, Settings settings) {
        super(material, type, settings);
        initialize();
    }

    private void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register(itemGroup -> itemGroup.add(this));
        ItemGroupEvents.modifyEntriesEvent(ModGroups.TUTORIAL_MOD_ITEM_GROUP_KEY)
                .register(itemGroup -> itemGroup.add(this));
    }

}
