package net.bucik689.magicalequipment.item.Trinket;

import net.bucik689.magicalequipment.item.Rarrity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class TrinketEffect extends TrinketBase implements ICurioItem {

    public final ItemEffectParam[] effects;
    public final String itemName;

    public TrinketEffect(String itemName, Rarrity rarrity, SlotType slotType, ItemEffectParam[] effects) {
        super(itemName, rarrity, slotType);
        this.effects = effects;
        this.itemName = itemName;
    }

    @Override
    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
        Player player = (Player) livingEntity;

        for (int i = 0; i < this.effects.length; i++) {
            if (!player.hasEffect(this.effects[i].effect)) {
                player.addEffect(new MobEffectInstance(this.effects[i].effect, 200, this.effects[i].amplifier));
            }
        }

        ICurioItem.super.curioTick(identifier, index, livingEntity, stack);
    }
}