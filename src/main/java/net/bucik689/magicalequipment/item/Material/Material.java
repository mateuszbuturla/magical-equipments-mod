package net.bucik689.magicalequipment.item.Material;

import net.bucik689.magicalequipment.item.ModCreativeModeTab;
import net.bucik689.magicalequipment.item.ModItems;
import net.minecraft.world.item.Item;

public class Material extends Item {

    public final String itemName;

    public Material(String itemName) {
        super(new Item.Properties().tab(ModCreativeModeTab.MAGICAL_EQUIPMENT_TAB));
        this.itemName = itemName;
        ModItems.ITEMS.register(itemName, () -> this);
    }
}
