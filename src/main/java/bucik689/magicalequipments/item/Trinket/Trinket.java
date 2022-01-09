package bucik689.magicalequipments.item.Trinket;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.List;

import bucik689.magicalequipments.item.Config;

public class Trinket extends TrinketItem {

    public final String itemName;
    public StatusEffectInstance[] statusEffects;

    public Trinket(Settings settings, String itemName, StatusEffectInstance[] statusEffects) {
        super(settings);
        this.itemName = itemName;
        this.statusEffects = statusEffects;
        Registry.register(Registry.ITEM, new Identifier(Config.modId, itemName), this);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(new TranslatableText("item." + Config.modId + "." + itemName));
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (statusEffects.length > 0) {
            for (int i = 0; i < statusEffects.length; i++) {
                if (!entity.hasStatusEffect(statusEffects[i].getEffectType())) {
                    entity.addStatusEffect(statusEffects[i]);
                }
            }
        }
    }
}