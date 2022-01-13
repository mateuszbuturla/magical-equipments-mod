package bucik689.magicalequipments.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import bucik689.magicalequipments.doubleJump.DoubleJumpEffect;
import bucik689.magicalequipments.item.ModItems;
import java.util.Optional;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;

@Mixin(ClientPlayerEntity.class)
public class DoubleJumpMixin {

	private int jumpCount = 0;

	@Inject(at = @At("HEAD"), method = "tickMovement")
	private void tickMovement(CallbackInfo info) {
		ClientPlayerEntity player = (ClientPlayerEntity) (Object) this;
		if (player.isOnGround() || player.isClimbing()) {
			jumpCount = 1;
		} else if (jumpCount > 0 && player.getVelocity().y < 0) {
			if (player.input.jumping && !player.getAbilities().flying) {
				if (canJump(player)) {
					--jumpCount;
					player.jump();

					DoubleJumpEffect.play(player);
				}
			}
		}
	}

	private boolean canJump(ClientPlayerEntity player) {
		return !wearingUsableElytra(player) && !player.isFallFlying() && !player.hasVehicle()
				&& !player.isTouchingWater() && !player.hasStatusEffect(StatusEffects.LEVITATION) && haveAmuletEquipped(player);
	}

	private boolean wearingUsableElytra(ClientPlayerEntity player) {
		ItemStack chestItemStack = player.getEquippedStack(EquipmentSlot.CHEST);
		return chestItemStack.getItem() == Items.ELYTRA && ElytraItem.isUsable(chestItemStack);
	}


	public boolean haveAmuletEquipped(ClientPlayerEntity player) {
		Optional<TrinketComponent> optionalComponent = TrinketsApi.getTrinketComponent(player);
		if (optionalComponent.isPresent()) {
			TrinketComponent component = optionalComponent.get();
			if (component.isEquipped(ModItems.ANGEL_NECKLACE)) {
				return true;
			}
		}
		return false;
	}
}