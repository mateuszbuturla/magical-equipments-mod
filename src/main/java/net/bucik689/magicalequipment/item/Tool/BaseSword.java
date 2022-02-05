package net.bucik689.magicalequipment.item.Tool;

import net.bucik689.magicalequipment.item.ModCreativeModeTab;
import net.bucik689.magicalequipment.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ForgeTier;

public class BaseSword extends SwordItem {

    public BaseSword(String itemName, ForgeTier tier) {
        super(tier, 0, -2.4F,
                new Item.Properties().tab(ModCreativeModeTab.MAGICAL_EQUIPMENT_TAB));
        ModItems.ITEMS.register(itemName, () -> this);
    }
}
