package bucik689.magicalequipments.item.Trinket;

import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableText;
import bucik689.magicalequipments.Config;
import bucik689.magicalequipments.item.ModItemGroup;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.text.Text;
import java.util.List;

public class TrinketBase extends TrinketItem {

    private final String itemName;
    private final int tier;

    public TrinketBase(String itemName, int tier) {
        super(new Settings().group(ModItemGroup.MAGICALEQUIPMENT).maxCount(1));
        this.itemName = itemName;
        this.tier = tier;

        Registry.register(Registry.ITEM, new Identifier(Config.modId, getItemName()), this);
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        switch (tier) {
            case 0 -> tooltip.add(new TranslatableText("tooltip." + Config.modId + ".rarrity.common").formatted(Formatting.GREEN));
            case 1 -> tooltip.add(new TranslatableText("tooltip." + Config.modId + ".rarrity.rare").formatted(Formatting.BLUE));
            case 2 -> tooltip.add(new TranslatableText("tooltip." + Config.modId + ".rarrity.epic").formatted(Formatting.LIGHT_PURPLE));
            case 3 -> tooltip.add(new TranslatableText("tooltip." + Config.modId + ".rarrity.legendary").formatted(Formatting.RED));
            case 4 -> tooltip.add(new TranslatableText("tooltip." + Config.modId + ".rarrity.unique").formatted(Formatting.DARK_RED));
        }
        tooltip.add(new TranslatableText("tooltip." + Config.modId + ".when_equipped").formatted(Formatting.GOLD));
        tooltip.add(new TranslatableText(Config.modId + ".item.description." + itemName).formatted(Formatting.BLUE));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}