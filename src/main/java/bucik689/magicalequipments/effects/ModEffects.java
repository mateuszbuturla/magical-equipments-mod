package bucik689.magicalequipments.effects;

import net.minecraft.entity.effect.StatusEffects;
import bucik689.magicalequipments.effects.AntiEffect.AntiEffect;
import net.minecraft.entity.effect.StatusEffect;

public class ModEffects {

        public static final StatusEffect ANTI_SLOWNESS = new AntiEffect(StatusEffects.SLOWNESS, "anti_slowness", 0x98D982);

        public static void registerModEffects() {
        }
}