package net.bucik689.magicalequipment.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier MYTHRIL = new ForgeTier(4, 2000, 8f,
            7f, 10, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.RAW_MYTHRIL));
}