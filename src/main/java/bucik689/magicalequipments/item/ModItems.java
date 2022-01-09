package bucik689.magicalequipments.item;

import bucik689.magicalequipments.item.rings.RingOfResistance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final RingOfResistance RING_OF_RESISTANCE = new RingOfResistance(
            new Item.Settings().group(ItemGroup.MISC));

    public static void registerModItems() {
    }
}