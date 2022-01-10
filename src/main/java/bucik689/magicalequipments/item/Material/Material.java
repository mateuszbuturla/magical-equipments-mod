package bucik689.magicalequipments.item.Material;

import bucik689.magicalequipments.Config;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Material extends TrinketItem {

    public Material(Settings settings, String itemName) {
        super(settings);
        Registry.register(Registry.ITEM, new Identifier(Config.modId, itemName), this);
    }
}
