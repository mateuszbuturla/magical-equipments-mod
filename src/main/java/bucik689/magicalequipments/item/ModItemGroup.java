package bucik689.magicalequipments.item;

import bucik689.magicalequipments.Config;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MAGICALEQUIPMENT = FabricItemGroupBuilder.build(
            new Identifier(Config.modId, Config.modId),
            () -> new ItemStack(ModItems.ANKH_SHIELD));
}