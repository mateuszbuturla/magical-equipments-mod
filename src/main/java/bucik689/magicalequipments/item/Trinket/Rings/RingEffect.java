package bucik689.magicalequipments.item.Trinket.Rings;

import bucik689.magicalequipments.item.Trinket.TrinketBase;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;

public class RingEffect extends TrinketBase {

    private final StatusEffect effect;
    private final int amplifier;

    public RingEffect(String name, StatusEffect effect, int amplifier) {
        super(name);
        this.effect = effect;
        this.amplifier = amplifier;
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity.hasStatusEffect(effect)) {
            return;
        }
        StatusEffectInstance effectInstance = new StatusEffectInstance(effect, 160, amplifier, false, false);
        entity.addStatusEffect(effectInstance);
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (!entity.hasStatusEffect(effect)) {
            return;
        }
        entity.removeStatusEffect(effect);
    }

}
