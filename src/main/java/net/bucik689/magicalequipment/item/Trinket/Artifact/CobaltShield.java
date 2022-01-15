package net.bucik689.magicalequipment.item.Trinket.Artifact;

import java.util.UUID;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.bucik689.magicalequipment.item.Rarrity;
import net.bucik689.magicalequipment.item.Trinket.SlotType;
import net.bucik689.magicalequipment.item.Trinket.TrinketBase;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class CobaltShield extends TrinketBase implements ICurioItem {

    private static final UUID KNOCKBACK_REDUCTION_UUID = UUID.fromString("72af269c-e671-4c9e-bbb5-e9bad7fa72aa");

    private static int knockbackReduction = 2;

    public CobaltShield(String itemName, Rarrity rarrity, SlotType slotType) {
        super(itemName, rarrity, slotType);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext,
            UUID uuid, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = HashMultimap.create();
        modifiers.put(Attributes.KNOCKBACK_RESISTANCE,
                new AttributeModifier(KNOCKBACK_REDUCTION_UUID, "Knockback Reduction", knockbackReduction,
                        AttributeModifier.Operation.ADDITION));

        return modifiers;
    }
}
