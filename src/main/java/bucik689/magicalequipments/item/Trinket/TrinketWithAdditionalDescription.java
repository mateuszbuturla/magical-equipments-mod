package bucik689.magicalequipments.item.Trinket;

import bucik689.magicalequipments.Config;
import bucik689.magicalequipments.item.Rarrity;
import bucik689.magicalequipments.item.SlotType;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import java.util.List;

public class TrinketWithAdditionalDescription extends TrinketBase {

    public final String itemName;

    public TrinketWithAdditionalDescription(String itemName, Rarrity rarrity, SlotType slotType) {
        super(itemName, rarrity, slotType);
        this.itemName = itemName;
    }

    @Override
    public void additionalAppendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText(
                "tooltip." + Config.modId + ".shift_to_additional_information")
                        .formatted(Formatting.BLUE));
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText(
                    Config.modId + ".item.advanced_description." + itemName));
        }
    }
}
