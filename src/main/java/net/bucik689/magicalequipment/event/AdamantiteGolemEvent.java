package net.bucik689.magicalequipment.event;

import net.bucik689.magicalequipment.entity.Summons.AdamantiteGolem;
import net.bucik689.magicalequipment.item.Armor.Adamantite.AdamantiteChestplate;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class AdamantiteGolemEvent {

    @SubscribeEvent
    public void onLivingDeath(LivingDeathEvent event) {
        LivingEntity e = event.getEntityLiving();
        if (e instanceof AdamantiteGolem) {
            AdamantiteGolem adamantiteGolem = (AdamantiteGolem) e;
            LivingEntity owner = adamantiteGolem.getOwner();
            if (owner instanceof Player) {
                Player player = (Player) owner;
                Item item = player.getInventory().getArmor(2).getItem();
                if (item instanceof AdamantiteChestplate) {
                    AdamantiteChestplate chestplate = (AdamantiteChestplate) item;
                    chestplate.removeGolem();
                }
            }
        }
    }
}
