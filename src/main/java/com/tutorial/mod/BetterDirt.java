package com.tutorial.mod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class BetterDirt extends Block {

    public BetterDirt(Settings settings) {
        super(settings);
    }

    public BetterDirt() {
        super(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS));
    }

}
