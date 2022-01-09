package bucik689.magicalequipments.item.materials;

import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import bucik689.magicalequipments.item.Config;

public class ObsidianChunk extends TrinketItem {

    private final String itemName = "obsidian_chunk";

    public ObsidianChunk(Settings settings) {
        super(settings);
        Registry.register(Registry.ITEM, new Identifier(Config.modId, itemName), this);
    }
}
