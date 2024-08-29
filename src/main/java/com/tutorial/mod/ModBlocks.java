package com.tutorial.mod;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BETTER_DIRT = new BetterDirt();

    private ModBlocks() {
    }

    public static Block register(Block block, String name, boolean shouldRegister) {

        Identifier id = Identifier.of("tutorial-mod", name);

        if (shouldRegister) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }
}
