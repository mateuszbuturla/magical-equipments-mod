package net.bucik689.magicalequipment.block;

import com.google.common.base.Supplier;

import net.bucik689.magicalequipment.item.ModCreativeModeTab;
import net.bucik689.magicalequipment.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

public class BlockBase {

    private Block block;

    public BlockBase(String blockName, Material material, float strength, boolean requiresCorrectToolForDrops) {
        final Block block = requiresCorrectToolForDrops
                ? new Block(BlockBehaviour.Properties.of(material)
                        .requiresCorrectToolForDrops().strength(strength))
                : new Block(BlockBehaviour.Properties.of(material)
                        .strength(strength));

        this.block = block;

        registerBlock(blockName,
                () -> block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = ModBlock.BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.MAGICAL_EQUIPMENT_TAB)));
    }

    public Block get() {
        return this.block;
    }
}
