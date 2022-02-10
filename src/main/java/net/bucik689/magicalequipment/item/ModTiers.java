package net.bucik689.magicalequipment.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
        public static final ForgeTier MYTHRIL = new ForgeTier(4, 2000, 8f,
                        7f, 10, BlockTags.NEEDS_DIAMOND_TOOL,
                        () -> Ingredient.of(ModItems.ADAMANTITE_INGOT));

        public static final ForgeTier ADAMANTITE = new ForgeTier(4, 2500, 9f,
                        8f, 10, BlockTags.NEEDS_DIAMOND_TOOL,
                        () -> Ingredient.of(ModItems.ADAMANTITE_INGOT));

        public static final ForgeTier LEATHER = new ForgeTier(1, 500, 1f,
                        2f, 15, null,
                        () -> Ingredient.of(ModItems.ADAMANTITE_INGOT));
}