package net.bucik689.magicalequipment.interfaces;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public interface ISummoningStaff {
    public void summonEntity(Level pLevel, Player pPlayer, InteractionHand pUsedHand);
}
