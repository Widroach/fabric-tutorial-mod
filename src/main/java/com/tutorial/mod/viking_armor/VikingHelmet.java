package com.tutorial.mod.viking_armor;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.entry.RegistryEntry;

public class VikingHelmet extends ArmorItem {

    public VikingHelmet(RegistryEntry<ArmorMaterial> material, Type type, Settings settings) {
        super(material, type, settings);
        initialize();
    }

    private void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register(itemGroup -> itemGroup.add(this));
    }

}
