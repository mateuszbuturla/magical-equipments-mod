package net.bucik689.magicalequipment.item.Trinket;

import net.bucik689.magicalequipment.item.Rarrity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class TrinketEffectImmune extends TrinketBase implements ICurioItem {

    public final ItemEffectImmuneParam[] effects;
    public final String itemName;

    public TrinketEffectImmune(String itemName, Rarrity rarrity, SlotType slotType, ItemEffectImmuneParam[] effects) {
        super(itemName, rarrity, slotType);
        this.effects = effects;
        this.itemName = itemName;
    }

    @Override
    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
        Player player = (Player) livingEntity;

        for (int i = 0; i < this.effects.length; i++) {
            if (player.hasEffect(this.effects[i].effect)) {
                player.removeEffect(this.effects[i].effect);
            }
        }

        ICurioItem.super.curioTick(identifier, index, livingEntity, stack);
    }
}