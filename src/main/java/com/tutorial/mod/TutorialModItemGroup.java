package com.tutorial.mod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TutorialModItemGroup {

        private static final RegistryKey<ItemGroup> TUTORIAL_MOD_ITEM_GROUP_KEY = RegistryKey.of(
                        Registries.ITEM_GROUP.getKey(),
                        Identifier.of("tutorial-mod", "item_group"));

        private static final ItemGroup TUTORIAL_MOD_ITEM_GROUP = FabricItemGroup.builder()
                        .icon(() -> new ItemStack(ModItems.ANCIENT_STEEL_SWORD))
                        .displayName(Text.translatable("itemGroup.tutorial-mod"))
                        .build();

        public TutorialModItemGroup() {
                initialize();
        }

        public void initialize() {
                Registry.register(Registries.ITEM_GROUP, TUTORIAL_MOD_ITEM_GROUP_KEY, TUTORIAL_MOD_ITEM_GROUP);
        }

        public RegistryKey<ItemGroup> getKey() {
                return TUTORIAL_MOD_ITEM_GROUP_KEY;
        }
}
