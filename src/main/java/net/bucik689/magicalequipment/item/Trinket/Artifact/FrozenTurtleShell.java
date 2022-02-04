package net.bucik689.magicalequipment.item.Trinket.Artifact;

import java.util.UUID;
import net.bucik689.magicalequipment.item.Rarrity;
import net.bucik689.magicalequipment.item.Trinket.SlotType;
import net.bucik689.magicalequipment.item.Trinket.TrinketBase;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class FrozenTurtleShell extends TrinketBase implements ICurioItem {

    private static final UUID ARMOR_UUID = UUID.fromString("2920cfdf-2f4d-4bd8-931f-6efdb08135a5");

    private static int armor = 4;

    public FrozenTurtleShell(String itemName, Rarrity rarrity, SlotType slotType) {
        super(itemName, rarrity, slotType);
    }

    @Override
    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
        Player player = (Player) livingEntity;

        AttributeInstance attackDamageAttribute = player.getAttribute(Attributes.ARMOR);

        if (player.getHealth() > player.getMaxHealth() / 2) {
            if (attackDamageAttribute.getModifier(ARMOR_UUID) == null) {
                attackDamageAttribute.addTransientModifier(
                        new AttributeModifier(ARMOR_UUID, "Armor", armor, AttributeModifier.Operation.ADDITION));
            }
        } else {
            if (attackDamageAttribute.getModifier(ARMOR_UUID) != null) {
                attackDamageAttribute.removeModifier(ARMOR_UUID);
            }
        }

        ICurioItem.super.curioTick(identifier, index, livingEntity, stack);
    }

    @Override
    public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
        Player player = (Player) slotContext.getWearer();

        AttributeInstance attackDamageAttribute = player.getAttribute(Attributes.ARMOR);

        if (attackDamageAttribute.getModifier(ARMOR_UUID) != null) {
            attackDamageAttribute.removeModifier(ARMOR_UUID);
        }
    }
}
