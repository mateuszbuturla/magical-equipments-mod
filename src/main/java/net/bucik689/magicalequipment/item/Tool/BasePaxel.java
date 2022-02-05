package net.bucik689.magicalequipment.item.Tool;

import net.bucik689.magicalequipment.item.ModCreativeModeTab;
import net.bucik689.magicalequipment.item.ModItems;
import net.bucik689.magicalequipment.util.ModTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;

public class BasePaxel extends DiggerItem implements Vanishable {
    public BasePaxel(String itemName, Tier tier) {
        super(0, -3, tier, ModTags.Blocks.PAXEL_MINEABLE,
                new Item.Properties().tab(ModCreativeModeTab.MAGICAL_EQUIPMENT_TAB));
        ModItems.ITEMS.register(itemName, () -> this);
    }

}
