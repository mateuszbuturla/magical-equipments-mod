package net.bucik689.magicalequipment.item.Trinket.Artifact;

import net.bucik689.magicalequipment.item.Rarrity;
import net.bucik689.magicalequipment.item.Trinket.SlotType;
import net.bucik689.magicalequipment.item.Trinket.TrinketBase;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import java.util.UUID;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class ObsidianShield extends TrinketBase implements ICurioItem {

    private static final UUID KNOCKBACK_REDUCTION_UUID = UUID.fromString("27757886-d247-4da8-b035-a8a2f427a3e9");

    private static int knockbackReduction = 2;

    public ObsidianShield(String itemName, Rarrity rarrity, SlotType slotType) {
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

    @Override
    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
        Player player = (Player) livingEntity;

        if (!player.hasEffect(MobEffects.FIRE_RESISTANCE)) {
            player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200, 0));
        }

        ICurioItem.super.curioTick(identifier, index, livingEntity, stack);
    }
}
