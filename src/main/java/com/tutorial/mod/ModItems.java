package com.tutorial.mod;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.*;

public class ModItems {
    private final Set<Item> items = new HashSet<>();

    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of("tutorial-mod", id);

        return Registry.register(Registries.ITEM, itemID, item);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Set<Item> getItems() {
        return items;
    }
}
