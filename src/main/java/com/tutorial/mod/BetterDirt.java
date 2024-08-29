package com.tutorial.mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class BetterDirt extends Block {

    public BetterDirt(Settings settings) {
        super(settings);
    }

    public BetterDirt() {
        super(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS));
        initialize();
    }

    private void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ModGroups.TUTORIAL_MOD_ITEM_GROUP_KEY)
                .register(itemGroup -> itemGroup.add(this.asItem()));
    }

}