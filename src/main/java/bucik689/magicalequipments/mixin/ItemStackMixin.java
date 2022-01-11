package bucik689.magicalequipments.mixin;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import bucik689.magicalequipments.item.Trinket.TrinketBase;

import java.util.List;

@Mixin(ItemStack.class)
public class ItemStackMixin {

    @Inject(at = @At("RETURN"), method = "getTooltip", cancellable = true)
    private void getTooltip(PlayerEntity player, TooltipContext context, CallbackInfoReturnable<List<Text>> info) {
        Item item = ((ItemStack) (Object) this).getItem();
        if(item instanceof TrinketBase) {
            List<Text> tooltip = info.getReturnValue();
            tooltip.remove(new TranslatableText("trinkets.tooltip.slots.single",
                    new TranslatableText("trinkets.slot.hand.ring").formatted(Formatting.BLUE)).formatted(Formatting.GRAY));
            tooltip.remove(new TranslatableText("trinkets.tooltip.slots.single",
                    new TranslatableText("trinkets.slot.offhand.ring").formatted(Formatting.BLUE)).formatted(Formatting.GRAY));

            tooltip.remove(new TranslatableText("trinkets.tooltip.slots.single",
                    new TranslatableText("trinkets.slot.chest.necklace").formatted(Formatting.BLUE)).formatted(Formatting.GRAY));
            tooltip.remove(new TranslatableText("trinkets.tooltip.slots.single",
                    new TranslatableText("trinkets.slot.chest.back").formatted(Formatting.BLUE)).formatted(Formatting.GRAY));
                    
            tooltip.remove(new TranslatableText("trinkets.tooltip.slots.single",
                    new TranslatableText("trinkets.slot.feet.aglet").formatted(Formatting.BLUE)).formatted(Formatting.GRAY));

            tooltip.remove(new TranslatableText("trinkets.tooltip.attributes.all").formatted(Formatting.GRAY));
            tooltip.remove(new TranslatableText("trinkets.tooltip.attributes.single",
                    new TranslatableText("trinkets.slot.hand.ring").formatted(Formatting.BLUE)).formatted(Formatting.GRAY));
            tooltip.remove(new TranslatableText("trinkets.tooltip.attributes.single",
                    new TranslatableText("trinkets.slot.offhand.ring").formatted(Formatting.BLUE)).formatted(Formatting.GRAY));

            tooltip.remove(new TranslatableText("trinkets.tooltip.attributes.single",
                    new TranslatableText("trinkets.slot.chest.necklace").formatted(Formatting.BLUE)).formatted(Formatting.GRAY));
            tooltip.remove(new TranslatableText("trinkets.tooltip.attributes.single",
                    new TranslatableText("trinkets.slot.chest.back").formatted(Formatting.BLUE)).formatted(Formatting.GRAY));

            tooltip.remove(new TranslatableText("trinkets.tooltip.attributes.single",
                    new TranslatableText("trinkets.slot.feet.aglet").formatted(Formatting.BLUE)).formatted(Formatting.GRAY));
        }
    }
}