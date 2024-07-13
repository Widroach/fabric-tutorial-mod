package com.tutorial.mod;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.*;

public class ModItems {

    public void addItem(Item item, String id) {
        register(item, id);
    }

    private Item register(Item item, String id) {
        Identifier itemID = Identifier.of("tutorial-mod", id);

        return Registry.register(Registries.ITEM, itemID, item);
    }
}
