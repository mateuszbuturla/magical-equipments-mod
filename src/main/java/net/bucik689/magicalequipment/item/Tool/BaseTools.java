package net.bucik689.magicalequipment.item.Tool;

import net.minecraftforge.common.ForgeTier;

public class BaseTools {
    public final String setName;
    public final BasePickaxe PICKAXE;
    public final BaseAxe AXE;
    public final BaseShovel SHOVEL;
    public final BaseHoe HOE;
    public final BasePaxel SHOPICKAXE;
    public final BaseSword SWORD;

    public BaseTools(String setName, ForgeTier tier) {
        this.setName = setName;
        this.PICKAXE = new BasePickaxe(setName + "_pickaxe", tier);
        this.AXE = new BaseAxe(setName + "_axe", tier);
        this.SHOVEL = new BaseShovel(setName + "_shovel", tier);
        this.HOE = new BaseHoe(setName + "_hoe", tier);
        this.SHOPICKAXE = new BasePaxel(setName + "_shopickaxe", tier);
        this.SWORD = new BaseSword(setName + "_sword", tier);
    }
}
