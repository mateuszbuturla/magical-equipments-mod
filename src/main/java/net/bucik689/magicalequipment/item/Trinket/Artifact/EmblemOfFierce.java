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

public class EmblemOfFierce extends TrinketBase implements ICurioItem {

    private static final UUID ATTACK_DAMAGE_UUID = UUID.fromString("eb8bca01-bc71-415a-96a0-b47e1204d6af");
    private static final UUID ATTACK_SPEED_UUID = UUID.fromString("c2b18ac6-f659-4d0f-a7f0-57c2cd0dc058");

    private static int attackDamage = 3;
    private static int attackSpeed = 1;

    public EmblemOfFierce(String itemName, Rarrity rarrity, SlotType slotType) {
        super(itemName, rarrity, slotType);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext,
            UUID uuid, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = HashMultimap.create();
        modifiers.put(Attributes.ATTACK_SPEED,
                new AttributeModifier(ATTACK_SPEED_UUID, "Attack Speed", attackSpeed,
                        AttributeModifier.Operation.ADDITION));
        modifiers.put(Attributes.ATTACK_DAMAGE,
                new AttributeModifier(ATTACK_DAMAGE_UUID, "Attack Damage", attackDamage,
                        AttributeModifier.Operation.ADDITION));

        return modifiers;
    }
}
