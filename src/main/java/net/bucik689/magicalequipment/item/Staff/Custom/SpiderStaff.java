package net.bucik689.magicalequipment.item.Staff.Custom;

import net.bucik689.magicalequipment.entity.ModEntities;
import net.bucik689.magicalequipment.entity.Summons.Spider;
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
        Spider newSpider = new Spider(ModEntities.SPIDER.get(), pLevel);
        newSpider.setPos(pPlayer.getX(), pPlayer.getY(), pPlayer.getZ());
        newSpider.setOwner(pPlayer);
        newSpider.setSummonedByStaff(true);
        pLevel.addFreshEntity(newSpider);
    }
}
