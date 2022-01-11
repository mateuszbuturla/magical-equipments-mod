package bucik689.magicalequipments.item.Trinket.Rings;

import bucik689.magicalequipments.item.Rarrity;
import bucik689.magicalequipments.item.SlotType;
import bucik689.magicalequipments.item.Trinket.TrinketBase;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;

public class RingEffect extends TrinketBase {

    private RingEffectParam[] effects;

    public RingEffect(String name, Rarrity rarrity, SlotType slotType, RingEffectParam[] effects) {
        super(name, rarrity, slotType);
        this.effects = effects;
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
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
