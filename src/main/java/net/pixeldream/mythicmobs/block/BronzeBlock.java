package net.pixeldream.mythicmobs.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.pixeldream.mythicmobs.registry.BlockRegistry;

public class BronzeBlock extends Block {
    public BronzeBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        Item item = player.getStackInHand(Hand.MAIN_HAND).getItem();
        if (item == Items.IRON_PICKAXE || item == Items.GOLDEN_PICKAXE || item == Items.DIAMOND_PICKAXE || item == Items.NETHERITE_PICKAXE) {
            item.use(world, player, hand);
            world.addBlockBreakParticles(pos, this.getDefaultState());
            world.setBlockState(pos, BlockRegistry.CUT_BRONZE_BLOCK.getDefaultState());
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}
