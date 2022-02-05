package net.bucik689.magicalequipment.item.Tool;

import net.bucik689.magicalequipment.item.ModCreativeModeTab;
import net.bucik689.magicalequipment.item.ModItems;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

import net.minecraftforge.common.ForgeTier;

public class BaseAxe extends AxeItem {

    public BaseAxe(String itemName, ForgeTier tier) {
        super(tier, 2F, -3F,
                new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB));
        ModItems.ITEMS.register(itemName, () -> this);
    }
}
