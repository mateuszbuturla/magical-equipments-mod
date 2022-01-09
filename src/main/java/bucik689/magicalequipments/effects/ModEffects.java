package bucik689.magicalequipments.effects;

import net.minecraft.entity.effect.StatusEffects;
import bucik689.magicalequipments.effects.AntiEffect.AntiEffect;
import net.minecraft.entity.effect.StatusEffect;

public class ModEffects {

        public static final StatusEffect ANTI_SLOWNESS = new AntiEffect(StatusEffects.SLOWNESS, "anti_slowness", 0x98D982);
        public static final StatusEffect ANTI_BLINDNESS = new AntiEffect(StatusEffects.BLINDNESS,"anti_blindness", 0x98D982);
        public static final StatusEffect ANTI_WEAKNESS = new AntiEffect(StatusEffects.WEAKNESS, "anti_weakness", 0x98D982);

        public static void registerModEffects() {
        }
}