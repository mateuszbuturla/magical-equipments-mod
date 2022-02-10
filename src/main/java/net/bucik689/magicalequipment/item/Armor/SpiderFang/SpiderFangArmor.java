package net.bucik689.magicalequipment.item.Armor.SpiderFang;

import net.bucik689.magicalequipment.item.Armor.BaseHelmet;
import net.bucik689.magicalequipment.item.Armor.BaseLeggins;
import net.bucik689.magicalequipment.item.Armor.ModArmorMaterial;
import net.bucik689.magicalequipment.item.Armor.BaseBoots;

public class SpiderFangArmor {
    public final String setName = "spider_fang";
    public final BaseBoots BOOTS;
    public final BaseLeggins LEGGINGS;
    public final SpiderFangChestplate CHESTPLATE;
    public final BaseHelmet HELMET;

    public SpiderFangArmor() {
        this.BOOTS = new BaseBoots(setName + "_boots", ModArmorMaterial.SPIDER_FANG, "spider_fang_set", null);
        this.LEGGINGS = new BaseLeggins(setName + "_leggins", ModArmorMaterial.SPIDER_FANG, "spider_fang_set", null);
        this.CHESTPLATE = new SpiderFangChestplate(setName + "_chestplate",
                ModArmorMaterial.SPIDER_FANG);
        this.HELMET = new BaseHelmet(setName + "_helmet", ModArmorMaterial.SPIDER_FANG, "spider_fang_set", null);
    }
}
