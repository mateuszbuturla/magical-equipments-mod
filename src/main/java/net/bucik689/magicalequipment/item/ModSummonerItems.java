package net.bucik689.magicalequipment.item;

import net.bucik689.magicalequipment.item.Trinket.SummonerTrinketBase;

public class ModSummonerItems {
    public SummonerTrinketBase[] ITEMS = {};

    public void add(SummonerTrinketBase item) {
        int n = this.ITEMS.length;

        SummonerTrinketBase newarr[] = new SummonerTrinketBase[n + 1];

        for (int i = 0; i < n; i++)
            newarr[i] = this.ITEMS[i];

        newarr[n] = item;

        this.ITEMS = newarr;
    }
}
