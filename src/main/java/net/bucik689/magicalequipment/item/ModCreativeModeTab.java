package net.bucik689.magicalequipment.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MAGICAL_EQUIPMENT_TAB = new CreativeModeTab("magicalequipment") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OBSIDIAN_CHUNK);
        }
    };

}