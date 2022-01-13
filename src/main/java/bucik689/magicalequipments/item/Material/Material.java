package bucik689.magicalequipments.item.Material;

import bucik689.magicalequipments.Config;
import bucik689.magicalequipments.item.ModItemGroup;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Material extends Item {

    private final String itemName;

    public Material(String itemName) {
        super(new Settings().group(ModItemGroup.MAGICALEQUIPMENT).maxCount(64));
        this.itemName = itemName;
        Registry.register(Registry.ITEM, new Identifier(Config.modId, itemName), this);
    }

    public String getItemName() {
        return itemName;
    }
}
