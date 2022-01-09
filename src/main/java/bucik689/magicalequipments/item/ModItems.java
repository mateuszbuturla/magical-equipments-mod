package bucik689.magicalequipments.item;

import bucik689.magicalequipments.item.materials.ObsidianChunk;
import bucik689.magicalequipments.item.rings.RingOfResistance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItems {

    public static final RingOfResistance RING_OF_RESISTANCE = new RingOfResistance(
            new Item.Settings().group(ItemGroup.MISC));
    public static final ObsidianChunk OBSIDIAN_CHUNK = new ObsidianChunk(
            new Item.Settings().group(ItemGroup.MATERIALS));
    public static final ObsidianSkull OBSIDIAN_SKULL = new ObsidianSkull(
            new Item.Settings().group(ItemGroup.MISC));

    public static void registerModItems() {
    }
}