package net.bucik689.magicalequipment.item.Trinket;

import net.bucik689.magicalequipment.item.Rarrity;
import net.bucik689.magicalequipment.item.Trinket.SlotType;
import net.bucik689.magicalequipment.item.Trinket.TrinketBase;

public class SummonerTrinketBase extends TrinketBase {

    private int bonusMinionCapacity = 1;

    public SummonerTrinketBase(String itemName, Rarrity rarrity, SlotType slotType, int minionCapacity) {
        super(itemName, rarrity, slotType);
        this.bonusMinionCapacity = minionCapacity;
    }

    public int getBonusMinionCapacity() {
        return this.bonusMinionCapacity;
    }

}
