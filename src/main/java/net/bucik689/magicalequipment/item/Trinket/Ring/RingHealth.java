package net.bucik689.magicalequipment.item.Trinket.Ring;

import java.util.UUID;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.bucik689.magicalequipment.item.Rarrity;
import net.bucik689.magicalequipment.item.Trinket.SlotType;
import net.bucik689.magicalequipment.item.Trinket.TrinketBase;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class RingHealth extends TrinketBase implements ICurioItem {

    private static final UUID MAX_HEALTH_UUID = UUID.fromString("da715194-1f3e-47df-9d02-f66d2f553a4d");

    private final int healthAmount;

    public RingHealth(String name, Rarrity rarrity, SlotType slotType, int healthAmount) {
        super(name, rarrity, slotType);
        this.healthAmount = healthAmount;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext,
            UUID uuid, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = HashMultimap.create();
        modifiers.put(Attributes.MAX_HEALTH,
                new AttributeModifier(MAX_HEALTH_UUID, "Max Health", healthAmount,
                        AttributeModifier.Operation.ADDITION));

        return modifiers;
    }
}