package dev.hiitsdevin.git.devinfabriclearning;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BedrockPowderItem extends Item {

    public BedrockPowderItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        if(hand == Hand.MAIN_HAND)  {
            System.out.println("An indestructible force is felt around you...");
        }
        return super.use(world, playerEntity, hand);
    }
}
