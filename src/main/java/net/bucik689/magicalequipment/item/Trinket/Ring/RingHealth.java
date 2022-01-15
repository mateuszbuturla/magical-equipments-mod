package net.bucik689.magicalequipment.item.Trinket.Ring;

import net.bucik689.magicalequipment.item.Rarrity;
import net.bucik689.magicalequipment.item.Trinket.SlotType;
import net.bucik689.magicalequipment.item.Trinket.TrinketBase;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class RingHealth extends TrinketBase implements ICurioItem {

    private final int healthAmount;

    public RingHealth(String name, Rarrity rarrity, SlotType slotType, int healthAmount) {
        super(name, rarrity, slotType);
        this.healthAmount = healthAmount;
    }

    @Override
    public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
        slotContext.getWearer().getAttribute(Attributes.MAX_HEALTH).setBaseValue(20 + healthAmount);

        onEquip(slotContext.identifier(), slotContext.index(), slotContext.entity(), stack);
    }

    @Override
    public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
        LivingEntity livingEntity = slotContext.getWearer();
        livingEntity.getAttribute(Attributes.MAX_HEALTH)
                .setBaseValue(livingEntity.getAttributeValue(Attributes.MAX_HEALTH) - healthAmount);
        onUnequip(slotContext.identifier(), slotContext.index(), slotContext.entity(), stack);
    }
}