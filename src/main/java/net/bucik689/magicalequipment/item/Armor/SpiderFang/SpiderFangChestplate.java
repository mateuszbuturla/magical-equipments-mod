package net.bucik689.magicalequipment.item.Armor.SpiderFang;

import net.bucik689.magicalequipment.item.Armor.BaseChestplate;
import net.bucik689.magicalequipment.item.Armor.ModArmorMaterial;

public class SpiderFangChestplate extends BaseChestplate {

    private int fullSetBonusMinionCapacity = 1;

    public SpiderFangChestplate(String itemName, ModArmorMaterial material) {
        super(itemName, material, "spider_fang_set", null);
        this.setFullSetBonuusMinionCapacity(this.fullSetBonusMinionCapacity);
    }
}
