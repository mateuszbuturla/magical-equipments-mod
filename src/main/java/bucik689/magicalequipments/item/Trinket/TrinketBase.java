package bucik689.magicalequipments.item.Trinket;

import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableText;
import bucik689.magicalequipments.Config;
import bucik689.magicalequipments.item.ModItemGroup;
import bucik689.magicalequipments.item.Rarrity;
import bucik689.magicalequipments.item.SlotType;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.text.Text;
import java.util.List;

public class TrinketBase extends TrinketItem {

    private final String itemName;
    private final Rarrity rarrity;
    private final SlotType slotType;

    public TrinketBase(String itemName, Rarrity rarrity, SlotType slotType) {
        super(new Settings().group(ModItemGroup.MAGICALEQUIPMENT).maxCount(1));
        this.itemName = itemName;
        this.rarrity = rarrity;
        this.slotType = slotType;

        Registry.register(Registry.ITEM, new Identifier(Config.modId, getItemName()), this);
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        switch (slotType) {
            case RING -> tooltip.add(
                    new TranslatableText("tooltip." + Config.modId + ".slot.ring")
                            .formatted(Formatting.GOLD));
            case NECKLACE -> tooltip
                    .add(new TranslatableText("tooltip." + Config.modId + ".slot.necklace")
                            .formatted(Formatting.GOLD));
            case ARTIFACT -> tooltip.add(new TranslatableText("tooltip." + Config.modId + ".slot.artifact")
                    .formatted(Formatting.GOLD));
        }
        switch (rarrity) {
            case COMMON -> tooltip.add(
                    new TranslatableText("tooltip." + Config.modId + ".rarrity.common")
                            .formatted(Formatting.GREEN));
            case RARE -> tooltip
                    .add(new TranslatableText("tooltip." + Config.modId + ".rarrity.rare")
                            .formatted(Formatting.BLUE));
            case EPIC -> tooltip.add(new TranslatableText("tooltip." + Config.modId + ".rarrity.epic")
                    .formatted(Formatting.LIGHT_PURPLE));
            case LEGENDARY -> tooltip.add(
                    new TranslatableText("tooltip." + Config.modId + ".rarrity.legendary")
                            .formatted(Formatting.RED));
            case UNIQUE -> tooltip.add(
                    new TranslatableText("tooltip." + Config.modId + ".rarrity.unique")
                            .formatted(Formatting.DARK_RED));
        }
        tooltip.add(new TranslatableText("tooltip." + Config.modId + ".when_equipped")
                .formatted(Formatting.GOLD));
        tooltip.add(new TranslatableText(Config.modId + ".item.description." + itemName)
                .formatted(Formatting.BLUE));
        additionalAppendTooltip(stack, world, tooltip, context);
    }

    public void additionalAppendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {}

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}