package bucik689.magicalequipments.mixin;

import net.minecraft.entity.LivingEntity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class MainMixin {

	public int test = 0;

	@Inject(at = @At("HEAD"), method = "onAttacking()V")
	private void init(CallbackInfo info) {

	}
}