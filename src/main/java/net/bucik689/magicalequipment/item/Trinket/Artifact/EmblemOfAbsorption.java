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
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

public class EmblemOfAbsorption extends TrinketBase implements ICurioItem {

    private static final UUID ARMOR_UUID = UUID.fromString("28b77e69-77d6-4290-8c91-193a9ddeb999");
    private static final UUID ARMOR_TOUGHNESS_UUID = UUID.fromString("329f8621-947c-4c4e-b056-f748b84d3835");

    private static int armor = 3;
    private static float armorToughness = 2.5f;
    private static int amplifier = 1;

    public EmblemOfAbsorption(String itemName, Rarrity rarrity, SlotType slotType) {
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

    @Override
    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
        Player player = (Player) livingEntity;

        if (!player.hasEffect(MobEffects.ABSORPTION)) {
            player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, amplifier));
        }

        ICurioItem.super.curioTick(identifier, index, livingEntity, stack);
    }
}
