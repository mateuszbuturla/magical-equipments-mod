package bucik689.magicalequipments.item.Trinket.Artifacts;

import bucik689.magicalequipments.item.Rarrity;
import bucik689.magicalequipments.item.SlotType;
import bucik689.magicalequipments.item.Trinket.Rings.RingEffectParam;
import bucik689.magicalequipments.item.Trinket.Rings.RingEffectResistanceParam;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;

public class AnkhShield extends CobaltShield {

    public final RingEffectResistanceParam effectsResistance[] = new RingEffectResistanceParam[] { 
        new RingEffectResistanceParam(StatusEffects.WEAKNESS),
        new RingEffectResistanceParam(StatusEffects.WITHER),
        new RingEffectResistanceParam(StatusEffects.POISON),
        new RingEffectResistanceParam(StatusEffects.BLINDNESS),
        new RingEffectResistanceParam(StatusEffects.SLOWNESS),
    };

    public final RingEffectParam effects[] = new RingEffectParam[] { 
        new RingEffectParam(StatusEffects.FIRE_RESISTANCE, 0),
    };

    public AnkhShield(String name, Rarrity rarrity, SlotType slotType) {
        super(name, rarrity, slotType);
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (!entity.hasStatusEffect(StatusEffects.FIRE_RESISTANCE)) {
            StatusEffectInstance effectInstance = new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 160, 0, false, false);
            entity.addStatusEffect(effectInstance);
        }

        if (effects.length > 0) {
            for (int i = 0; i < effects.length; i++) {
                if (!entity.hasStatusEffect(effects[i].effect)) {
                    StatusEffectInstance effectInstance = new StatusEffectInstance(effects[i].effect, 160,
                            effects[i].amplifier, false, false);
                    entity.addStatusEffect(effectInstance);
                }
            }
        }
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        super.tick(stack, slot, entity);
        if (effectsResistance.length > 0) {
            for (int i = 0; i < effectsResistance.length; i++) {
                if(entity.hasStatusEffect(effectsResistance[i].effect)) {
                    entity.removeStatusEffect(effectsResistance[i].effect);
                }
            }
        }
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (effects.length > 0) {
            for (int i = 0; i < effects.length; i++) {
                if (entity.hasStatusEffect(effects[i].effect)) {
                    entity.removeStatusEffect(effects[i].effect);
                }
            }
        }
    }
}