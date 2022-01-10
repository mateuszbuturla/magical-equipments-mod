package bucik689.magicalequipments.effects.AntiEffect;

import bucik689.magicalequipments.Config;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AntiEffect extends StatusEffect {
  public StatusEffect effectToClear;
  public String effectName;

  public AntiEffect(StatusEffect effectToClear, String effectName, int color) {
    super(
        StatusEffectCategory.BENEFICIAL,
        color);
    this.effectName = effectName;
    this.effectToClear = effectToClear;
    Registry.register(Registry.STATUS_EFFECT, new Identifier(Config.modId, effectName), this);
  }

  @Override
  public boolean canApplyUpdateEffect(int duration, int amplifier) {
    return duration > 0;
  }

  @Override
  public void applyUpdateEffect(LivingEntity entity, int amplifier) {
    if (entity instanceof PlayerEntity) {
      ((PlayerEntity) entity).removeStatusEffect(effectToClear);
    }
  }

}
