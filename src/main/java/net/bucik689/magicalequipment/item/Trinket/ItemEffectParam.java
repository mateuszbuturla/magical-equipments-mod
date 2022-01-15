package net.bucik689.magicalequipment.item.Trinket;

import net.minecraft.world.effect.MobEffect;

public class ItemEffectParam {

    public final MobEffect effect;
    public final int amplifier;

    public ItemEffectParam(MobEffect effect, int amplifier) {
        this.effect = effect;
        this.amplifier = amplifier;
    }
}
