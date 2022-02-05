package net.bucik689.magicalequipment.item.Armor;

import net.bucik689.magicalequipment.item.ModCreativeModeTab;
import net.bucik689.magicalequipment.item.ModItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

public class BaseChestplate extends ArmorItem {
    public BaseChestplate(String itemName, ModArmorMaterial material) {
        super(material, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MAGICAL_EQUIPMENT_TAB));
        ModItems.ITEMS.register(itemName, () -> this);
    }
}
