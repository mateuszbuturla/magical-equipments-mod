package bucik689.magicalequipments.effects;

import net.minecraft.entity.effect.StatusEffect;

public class EffectDefiniction {

    public StatusEffect type;
    public int duration;
    public int amplifier;
    public boolean visible;

    public EffectDefiniction(StatusEffect type, int duration, int amplifier, boolean visible) {
        this.type = type;
        this.duration = duration;
        this.amplifier = amplifier;
        this.visible = visible;
    }
}
