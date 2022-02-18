package net.bucik689.magicalequipment.item.Trinket;

import net.bucik689.magicalequipment.item.ModItems;
import net.bucik689.magicalequipment.item.Rarrity;

public class SummonerTrinketBase extends TrinketBase {

    private int bonusMinionCapacity = 0;
    private int bonusMinionDamage = 0;

    public SummonerTrinketBase(String itemName, Rarrity rarrity, SlotType slotType, int minionCapacity,
                               int bonusMinionDamage) {
        super(itemName, rarrity, slotType);
        this.bonusMinionCapacity = minionCapacity;
        this.bonusMinionDamage = bonusMinionDamage;
        ModItems.ITEMS_FOR_SUMMONER_CLASS.add(this);
    }

    public int getBonusMinionCapacity() {
        return this.bonusMinionCapacity;
    }

    public int getBonusMinionDamage() {
        return this.bonusMinionDamage;
    }
}
