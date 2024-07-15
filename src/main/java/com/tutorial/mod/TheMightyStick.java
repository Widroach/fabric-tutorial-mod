package com.tutorial.mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TheMightyStick extends Item {

    public TheMightyStick(Settings settings) {
        super(settings);
        initialize();
    }

    public void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register(itemGroup -> itemGroup.add(this));
        ItemGroupEvents.modifyEntriesEvent(ModGroups.TUTORIAL_MOD_ITEM_GROUP_KEY)
                .register(itemGroup -> itemGroup.add(this));

    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) {
            return TypedActionResult.pass(user.getStackInHand(hand));
        }

        BlockPos frontOfPlayer = user.getBlockPos().offset(user.getHorizontalFacing(), 10);

        LightningEntity lightningBolt = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
        lightningBolt.setPosition(frontOfPlayer.toCenterPos());
        world.spawnEntity(lightningBolt);

        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
