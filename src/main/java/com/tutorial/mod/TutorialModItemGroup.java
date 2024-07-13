package com.tutorial.mod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TutorialModItemGroup {
    public static final RegistryKey<ItemGroup> TUTORIAL_MOD_ITEM_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(),
            Identifier.of("tutorial-mod", "item_group"));

    public static final ItemGroup TUTORIAL_MOD_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(AncientSteelSword.ANCIENT_STEEL_SWORD))
            .displayName(Text.translatable("itemGroup.tutorial-mod"))
            .build();
}
