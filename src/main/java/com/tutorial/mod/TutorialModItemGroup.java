package com.tutorial.mod;

import com.tutorial.mod.viking_armor.VikingAmorMaterial;
import com.tutorial.mod.viking_armor.VikingBoots;
import com.tutorial.mod.viking_armor.VikingHelmet;
import com.tutorial.mod.viking_armor.VikingLeggins;
import com.tutorial.mod.viking_armor.VikingVest;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
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
            .icon(() -> new ItemStack(new AncientSteelSword(new AncientSteelMaterial(), new Item.Settings())))
            .displayName(Text.translatable("itemGroup.tutorial-mod"))
            .build();

    public TutorialModItemGroup() {
        initialize();
    }

    public void initialize() {
        Registry.register(Registries.ITEM_GROUP, TUTORIAL_MOD_ITEM_GROUP_KEY, TUTORIAL_MOD_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(TUTORIAL_MOD_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(new TheMightyStick(new Item.Settings()));
            itemGroup.add(new AncientSteelSword(new AncientSteelMaterial(), new Item.Settings()));
            itemGroup.add(
                    new SuspiciousDust(new Item.Settings().food(new SuspiciousDustFoodComponent().getFoodComponent())));
            itemGroup.add(new VikingHelmet(new VikingAmorMaterial().getMaterial(), ArmorItem.Type.HELMET,
                    new Item.Settings()));
            itemGroup.add(new VikingVest(new VikingAmorMaterial().getMaterial(), ArmorItem.Type.CHESTPLATE,
                    new Item.Settings()));
            itemGroup.add(new VikingLeggins(new VikingAmorMaterial().getMaterial(), ArmorItem.Type.LEGGINGS,
                    new Item.Settings()));
            itemGroup.add(
                    new VikingBoots(new VikingAmorMaterial().getMaterial(), ArmorItem.Type.BOOTS, new Item.Settings()));
        });
    }
}
