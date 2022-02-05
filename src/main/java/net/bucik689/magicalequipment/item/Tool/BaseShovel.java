package net.bucik689.magicalequipment.item.Tool;

import net.bucik689.magicalequipment.item.ModCreativeModeTab;
import net.bucik689.magicalequipment.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraftforge.common.ForgeTier;

public class BaseShovel extends ShovelItem {

    public BaseShovel(String itemName, ForgeTier tier) {
        super(tier, -1.5F, -3F,
                new Item.Properties().tab(ModCreativeModeTab.MAGICAL_EQUIPMENT_TAB));
        ModItems.ITEMS.register(itemName, () -> this);
    }
}
