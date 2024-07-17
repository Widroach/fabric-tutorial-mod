package com.tutorial.mod;

import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ArmorItem;

public class ModItems {

    public static final TheMightyStick THE_MIGHTY_STICK = new TheMightyStick(new Item.Settings());
    public static final AncientSteelSword ANCIENT_STEEL_SWORD = new AncientSteelSword(new AncientSteelMaterial(),new Item.Settings());
    public static final SuspiciousDust SUSPICIOUS_DUST = new SuspiciousDust(new Item.Settings().food(new SuspiciousDustFoodComponent().getFoodComponent()));
    public static final VikingHelmet VIKING_HELMET = new VikingHelmet(new VikingAmorMaterial().getMaterial(),ArmorItem.Type.HELMET, new Item.Settings());
    public static final VikingVest VIKING_VEST = new VikingVest(new VikingAmorMaterial().getMaterial(),ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final VikingLeggins VIKING_LEGGINS = new VikingLeggins(new VikingAmorMaterial().getMaterial(),ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final VikingBoots VIKING_BOOTS = new VikingBoots(new VikingAmorMaterial().getMaterial(),ArmorItem.Type.BOOTS, new Item.Settings());
    public static final SuspiciousPotion SUSPICIOUS_POTION = new SuspiciousPotion();

    private ModItems() {
    }

    public static Item registerItem(Item item, String id) {
        Identifier itemID = Identifier.of("tutorial-mod", id);

        return Registry.register(Registries.ITEM, itemID, item);
    }

    public static Potion registerPotion(Potion potion, String id) {
        Identifier itemID = Identifier.of("tutorial-mod", id);

        return Registry.register(Registries.POTION, itemID, potion);
    }
}
