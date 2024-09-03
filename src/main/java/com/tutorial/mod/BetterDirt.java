package com.tutorial.mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;

public class BetterDirt extends Block {

    public BetterDirt(Settings settings) {
        super(settings);
    }

    public BetterDirt() {
        super(AbstractBlock.Settings.copy(Blocks.STONE)
                .strength(0.5f, 0.5f)
                .sounds(BlockSoundGroup.GRAVEL)
                .requiresTool());
        initialize();
    }

    private void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ModGroups.TUTORIAL_MOD_ITEM_GROUP_KEY)
                .register(itemGroup -> itemGroup.add(this.asItem()));
    }

}