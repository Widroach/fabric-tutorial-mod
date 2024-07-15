package com.tutorial.mod;

import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class ModGroups {
    private static final TutorialModItemGroup TUTORIAL_MOD_ITEM_GROUP = new TutorialModItemGroup();
    public static final RegistryKey<ItemGroup> TUTORIAL_MOD_ITEM_GROUP_KEY = TUTORIAL_MOD_ITEM_GROUP.getKey();

    private ModGroups() {
    }
}
