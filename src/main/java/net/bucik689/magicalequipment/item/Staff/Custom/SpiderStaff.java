package net.bucik689.magicalequipment.item.Staff.Custom;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.bucik689.magicalequipment.entity.ModEntities;
import net.bucik689.magicalequipment.entity.Summons.AdamantiteGolem;
import net.bucik689.magicalequipment.item.Staff.BaseSummoningStaff;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class SpiderStaff extends BaseSummoningStaff {
    public SpiderStaff(String itemName) {
        super(itemName);
    }

    @Override
    public void summonEntity(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        AdamantiteGolem newGolem = new AdamantiteGolem(ModEntities.ADAMANTITE_GOLEM.get(), pLevel);
        newGolem.setPos(pPlayer.getX(), pPlayer.getY(), pPlayer.getZ());
        newGolem.setOwner(pPlayer);
        if (pLevel.addFreshEntity(newGolem)) {
            MagicalEquipment.LOGGER.info("ADDED");
        }
    }
}
