package net.bucik689.magicalequipment.item.Trinket.Artifact;

import net.bucik689.magicalequipment.item.Rarrity;
import net.bucik689.magicalequipment.item.Trinket.SlotType;
import net.bucik689.magicalequipment.item.Trinket.SummonerTrinketBase;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class HerculesBeetle extends SummonerTrinketBase implements ICurioItem {
    public HerculesBeetle(String itemName, Rarrity rarrity, SlotType slotType) {
        super(itemName, rarrity, slotType, 0, 15);
    }
}
