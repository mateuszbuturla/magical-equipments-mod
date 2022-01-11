package bucik689.magicalequipments.item.Trinket.Rings;

import bucik689.magicalequipments.item.Trinket.TrinketBase;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public class RingEffectResistance extends TrinketBase {

    private final RingEffectResistanceParam[] effects;

    public RingEffectResistance(String name, int tier, RingEffectResistanceParam[] effects) {
        super(name, tier);
        this.effects = effects;
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        super.tick(stack, slot, entity);
        if (effects.length > 0) {
            for (int i = 0; i < effects.length; i++) {
                if(entity.hasStatusEffect(effects[i].effect)) {
                    entity.removeStatusEffect(effects[i].effect);
                }
            }
        }
    }

}
