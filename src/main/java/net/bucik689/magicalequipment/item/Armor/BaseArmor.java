package net.bucik689.magicalequipment.item.Armor;

public class BaseArmor {

    public final String setName;
    public final BaseBoots BOOTS;
    public final BaseLeggins LEGGINGS;
    public final BaseChestplate CHESTPLATE;
    public final BaseHelmet HELMET;

    public BaseArmor(String setName, ModArmorMaterial material) {
        this.setName = setName;
        this.BOOTS = new BaseBoots(setName + "_boots", material, null, null);
        this.LEGGINGS = new BaseLeggins(setName + "_leggins", material, null, null);
        this.CHESTPLATE = new BaseChestplate(setName + "_chestplate", material, null, null);
        this.HELMET = new BaseHelmet(setName + "_helmet", material, null, null);
    }
}
