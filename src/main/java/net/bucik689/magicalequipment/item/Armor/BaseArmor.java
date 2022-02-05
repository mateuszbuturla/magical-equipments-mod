package net.bucik689.magicalequipment.item.Armor;

public class BaseArmor {

    public final String setName;
    public final BaseBoots MYTHRIL_BOOTS;
    public final BaseLeggins MYTHRIL_LEGGINGS;
    public final BaseChestplate MYTHRIL_CHESTPLATE;
    public final BaseHelmet MYTHRIL_HELMET;

    public BaseArmor(String setName, ModArmorMaterial material) {
        this.setName = setName;
        this.MYTHRIL_BOOTS = new BaseBoots(setName + "_boots", material);
        this.MYTHRIL_LEGGINGS = new BaseLeggins(setName + "_leggins", material);
        this.MYTHRIL_CHESTPLATE = new BaseChestplate(setName + "_chestplate", material);
        this.MYTHRIL_HELMET = new BaseHelmet(setName + "_helmet", material);
    }
}
