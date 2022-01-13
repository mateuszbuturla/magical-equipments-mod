package bucik689.magicalequipments.item.Trinket.Rings;

import net.minecraft.entity.effect.StatusEffect;

public class RingEffectParam {
    
    public StatusEffect effect;
    public int amplifier;

    public RingEffectParam(StatusEffect effect, int amplifier) {
        this.effect = effect;
        this.amplifier = amplifier;
    }
}
