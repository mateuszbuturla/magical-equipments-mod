package bucik689.magicalequipments.item.Trinket;

import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.item.ItemStack;
import bucik689.magicalequipments.Config;
import bucik689.magicalequipments.item.ModItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TrinketBase extends TrinketItem {

    private final String itemName;

    public TrinketBase(String itemName) {
        super(new Settings().group(ModItemGroup.MAGICALEQUIPMENT).maxCount(1));
        this.itemName = itemName;

        Registry.register(Registry.ITEM, new Identifier(Config.modId, getItemName()), this);
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}