package bucik689.magicalequipments.item.rings;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.List;

import bucik689.magicalequipments.item.Config;

public class RingOfResistance extends TrinketItem {

    private final String itemName = "ring_of_resistance";

    public RingOfResistance(Settings settings) {
        super(settings);
        Registry.register(Registry.ITEM, new Identifier(Config.modId, itemName), this);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(new TranslatableText("item." + Config.modId + "." + itemName));
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (!entity.hasStatusEffect(StatusEffects.RESISTANCE)) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 0, true, false));
        }
    }
}
