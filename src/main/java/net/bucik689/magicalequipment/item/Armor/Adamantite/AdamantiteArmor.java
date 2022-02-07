package net.bucik689.magicalequipment.item.Armor.Adamantite;

import net.bucik689.magicalequipment.item.Armor.BaseHelmet;
import net.bucik689.magicalequipment.item.Armor.BaseLeggins;
import net.bucik689.magicalequipment.item.Armor.ModArmorMaterial;
import net.bucik689.magicalequipment.item.Armor.BaseBoots;

public class AdamantiteArmor {
    public final String setName = "adamantite";
    public final BaseBoots BOOTS;
    public final BaseLeggins LEGGINGS;
    public final AdamantiteChestplate CHESTPLATE;
    public final BaseHelmet HELMET;

    public AdamantiteArmor() {
        this.BOOTS = new BaseBoots(setName + "_boots", ModArmorMaterial.ADAMANTITE, "adamantite_set", "adamantite_set");
        this.LEGGINGS = new BaseLeggins(setName + "_leggins", ModArmorMaterial.ADAMANTITE, "adamantite_set",
                "adamantite_set");
        this.CHESTPLATE = new AdamantiteChestplate(setName + "_chestplate", ModArmorMaterial.ADAMANTITE);
        this.HELMET = new BaseHelmet(setName + "_helmet", ModArmorMaterial.ADAMANTITE, "adamantite_set",
                "adamantite_set");
    }
}
