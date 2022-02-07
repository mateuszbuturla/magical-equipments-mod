package net.bucik689.magicalequipment.item.Armor.Adamantite;

import net.bucik689.magicalequipment.entity.ModEntities;
import net.bucik689.magicalequipment.entity.Summons.AdamantiteGolem;
import net.bucik689.magicalequipment.item.Armor.BaseChestplate;
import net.bucik689.magicalequipment.item.Armor.ModArmorMaterial;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AdamantiteChestplate extends BaseChestplate {

    private AdamantiteGolem golem = null;
    private int ticksBetweenGolemRespawn = 20 * 120; // 20 minecraft ticks(1 second) * 120 = 2 minutes respawn time
    private int ticksLeftToGolemRestawn = 0;

    public AdamantiteChestplate(String itemName, ModArmorMaterial material) {
        super(itemName, material, "adamantite_set", "adamantite_set");
    }

    public void removeGolem() {
        this.golem = null;
    }

    private void spawnGolem(Player pEntity, Level pLevel) {
        AdamantiteGolem newGolem = new AdamantiteGolem(ModEntities.ADAMANTITE_GOLEM.get(), pLevel);
        newGolem.setPos(pEntity.getX(), pEntity.getY(), pEntity.getZ());
        newGolem.setOwner(pEntity);
        if (pLevel.addFreshEntity(newGolem)) {
            this.golem = newGolem;
            this.ticksLeftToGolemRestawn = this.ticksBetweenGolemRespawn;
        }
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if (this.hasFullSuitOfArmorOn(player) && this.hasCorrectArmorOn(this.getMaterial(), player)) {
            if (this.golem == null) {
                this.ticksLeftToGolemRestawn -= 1;
            }
            if (this.golem == null && this.ticksLeftToGolemRestawn <= 0) {
                this.spawnGolem(player, world);
            }
        }
    }
}
