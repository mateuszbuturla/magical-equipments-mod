package net.bucik689.magicalequipment.item.Tool;

import net.bucik689.magicalequipment.item.ModCreativeModeTab;
import net.bucik689.magicalequipment.item.ModItems;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;

import net.minecraftforge.common.ForgeTier;

public class BaseHoe extends HoeItem {

    public BaseHoe(String itemName, ForgeTier tier) {
        super(tier, -7, 1,
                new Item.Properties().tab(ModCreativeModeTab.MAGICAL_EQUIPMENT_TAB));
        ModItems.ITEMS.register(itemName, () -> this);
    }
}
