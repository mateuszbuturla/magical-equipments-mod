package bucik689.magicalequipments.item.Trinket.Artifacts;

import bucik689.magicalequipments.item.Rarrity;
import bucik689.magicalequipments.item.SlotType;
import bucik689.magicalequipments.item.Trinket.TrinketWithAdditionalDescription;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.item.ItemStack;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.LivingEntity;

public class VampiricGountlet extends TrinketWithAdditionalDescription {

    public int chargeAmount = 0;
    public Boolean wasCharged = false;

    public VampiricGountlet(String name, Rarrity rarrity, SlotType slotType) {
        super(name, rarrity, slotType);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        float playerCurrentHealth = entity.getHealth();
        if (entity.getPose() == EntityPose.CROUCHING && Screen.hasAltDown()) {
            if (chargeAmount < 40 && !wasCharged && playerCurrentHealth - 1 > 0) {
                chargeAmount++;
                entity.setHealth(entity.getHealth() - 1);
                wasCharged = true;
            }
        }
        else if (Screen.hasAltDown() && entity.getPose() != EntityPose.CROUCHING) {
            float playerMaxHealth = entity.getMaxHealth();
            int maxHealAmount = chargeAmount / 2;
            float missingHealth = playerMaxHealth - playerCurrentHealth;
            int healMargin = maxHealAmount - (int)missingHealth;
    
            entity.setHealth(entity.getHealth() + maxHealAmount);

            chargeAmount = healMargin > 0 ? healMargin * 2 : 0;
        }
        if (!Screen.hasAltDown()) {
            wasCharged = false;
        }
    }

    // @Override
    // public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
    //     if (!world.isClient()) {
    //         return TypedActionResult.success(user.getStackInHand(hand));
    //     }

    //     if (user.getPose() == EntityPose.CROUCHING) {
    //         if (chargeAmount < 40) {
    //             chargeAmount++;
    //             user.setHealth(user.getHealth() - 1);
    //         }
    //     }
    //     else {
    //         float playerMaxHealth = user.getMaxHealth();
    //         float playerCurrentHealth = user.getHealth();
    //         int maxHealAmount = chargeAmount / 2;
    //         float missingHealth = playerMaxHealth - playerCurrentHealth;
    //         int healMargin = maxHealAmount - (int)missingHealth;
    
    //         user.setHealth(user.getHealth() + maxHealAmount);

    //         chargeAmount = healMargin > 0 ? healMargin * 2 : 0;
    //     }
    //     return TypedActionResult.success(user.getStackInHand(hand));
    // }
}