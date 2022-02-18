package net.bucik689.magicalequipment.item.Staff.Custom;

import java.util.UUID;

import net.bucik689.magicalequipment.entity.ModEntities;
import net.bucik689.magicalequipment.entity.Summons.Spider;
import net.bucik689.magicalequipment.item.Staff.BaseSummoningStaff;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class SpiderStaff extends BaseSummoningStaff {
    private static final UUID ATTACK_DAMAGE_UUID = UUID.fromString("27757886-d247-1111-b035-a8a2f427a3e9");

    public SpiderStaff(String itemName) {
        super(itemName);
    }

    @Override
    public void summonEntity(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        Spider newSpider = new Spider(ModEntities.SPIDER.get(), pLevel);
        newSpider.setPos(pPlayer.getX(), pPlayer.getY(), pPlayer.getZ());
        newSpider.setOwner(pPlayer);
        newSpider.setSummonedByStaff(true);
        // double bonusEntityDamage =
        // newSpider.getAttribute(Attributes.ATTACK_DAMAGE).getValue()
        // * (this.getPlayerMinionDamageBonus(pPlayer) / 100);
        // newSpider.getAttribute(Attributes.ATTACK_DAMAGE)
        // .addPermanentModifier(new AttributeModifier(ATTACK_DAMAGE_UUID, "Attack
        // Damage",
        // bonusEntityDamage, Operation.ADDITION));
        pLevel.addFreshEntity(newSpider);
    }
}
