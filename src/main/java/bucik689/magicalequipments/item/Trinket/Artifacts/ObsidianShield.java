package bucik689.magicalequipments.item.Trinket.Artifacts;

import bucik689.magicalequipments.item.Rarrity;
import bucik689.magicalequipments.item.SlotType;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;

public class ObsidianShield extends CobaltShield {

    public ObsidianShield(String name, Rarrity rarrity, SlotType slotType) {
        super(name, rarrity, slotType);
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (!entity.hasStatusEffect(StatusEffects.FIRE_RESISTANCE)) {
            StatusEffectInstance effectInstance = new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 160, 0, false, false);
            entity.addStatusEffect(effectInstance);
        }
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity.hasStatusEffect(StatusEffects.FIRE_RESISTANCE)) {
            entity.removeStatusEffect(StatusEffects.FIRE_RESISTANCE);
        }
    }
}