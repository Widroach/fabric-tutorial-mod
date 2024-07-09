package com.tutorial.mod;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(FabricDocsReference.MOD_ID, id);

        return Registry.register(Registries.ITEM, itemID, item);
    }
}
