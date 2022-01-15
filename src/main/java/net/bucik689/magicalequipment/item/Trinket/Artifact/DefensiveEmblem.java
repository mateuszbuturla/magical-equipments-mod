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

public class DefensiveEmblem extends TrinketBase implements ICurioItem {

    private static final UUID ARMOR_UUID = UUID.fromString("ccaf5c72-b2fc-4afd-bc30-983878b2ce7d");
    private static final UUID ARMOR_TOUGHNESS_UUID = UUID.fromString("b50adbb0-8c7b-498a-b62e-8cf034a8e19f");

    private static int armor = 2;
    private static int armorToughness = 2;

    public DefensiveEmblem(String itemName, Rarrity rarrity, SlotType slotType) {
        super(itemName, rarrity, slotType);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext,
            UUID uuid, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = HashMultimap.create();
        modifiers.put(Attributes.ARMOR,
                new AttributeModifier(ARMOR_UUID, "Armor", armor,
                        AttributeModifier.Operation.ADDITION));
        modifiers.put(Attributes.ARMOR_TOUGHNESS,
                new AttributeModifier(ARMOR_TOUGHNESS_UUID, "Armor Thoughness", armorToughness,
                        AttributeModifier.Operation.ADDITION));

        return modifiers;
    }
}
