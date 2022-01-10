package bucik689.magicalequipments.item.Trinket.Rings;

import bucik689.magicalequipments.item.Trinket.TrinketBase;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemStack;

public class RingEffectResistance extends TrinketBase {

    private final StatusEffect effect;

    public RingEffectResistance(String name, StatusEffect effect) {
        super(name);
        this.effect = effect;
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        super.tick(stack, slot, entity);
        if(entity.hasStatusEffect(effect)) {
            entity.removeStatusEffect(effect);
        }
    }

}
