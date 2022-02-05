package net.bucik689.magicalequipment.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab MATERIALS_TAB = new CreativeModeTab(
            "magicalequipment_materials") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MYTHRIL_INGOT);
        }
    };
    public static final CreativeModeTab TOOLS_TAB = new CreativeModeTab(
            "magicalequipment_tools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MYTHRIL_TOOLS.SHOPICKAXE);
        }
    };
    public static final CreativeModeTab ARMOR_TAB = new CreativeModeTab(
            "magicalequipment_armors") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MYTHRIL_ARMOR.CHESTPLATE);
        }
    };
    public static final CreativeModeTab BLOCKS_TAB = new CreativeModeTab(
            "magicalequipment_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_MYTHRIL);
        }
    };
    public static final CreativeModeTab ACCESSORIES_TAB = new CreativeModeTab(
            "magicalequipment_accessories") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.EMBLEM_OF_ABSORPTION);
        }
    };

}