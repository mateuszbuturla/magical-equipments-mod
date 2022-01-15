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

public class SmallEmblem extends TrinketBase implements ICurioItem {

    private static final UUID ARMOR_UUID = UUID.fromString("ecef8366-c3c4-448d-a76d-c4494d714a82");
    private static final UUID ATTACK_DAMAGE_UUID = UUID.fromString("0ed65227-0e12-4897-afca-a6f491aa8659");

    private static int attackDamage = 1;
    private static int armor = 1;

    public SmallEmblem(String itemName, Rarrity rarrity, SlotType slotType) {
        super(itemName, rarrity, slotType);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext,
            UUID uuid, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = HashMultimap.create();
        modifiers.put(Attributes.ARMOR,
                new AttributeModifier(ARMOR_UUID, "Armor", armor, AttributeModifier.Operation.ADDITION));
        modifiers.put(Attributes.ATTACK_DAMAGE,
                new AttributeModifier(ATTACK_DAMAGE_UUID, "Attack Damage", attackDamage,
                        AttributeModifier.Operation.ADDITION));

        return modifiers;
    }
}
