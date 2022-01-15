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
import net.bucik689.magicalequipment.item.Trinket.ItemEffectImmuneParam;
import net.bucik689.magicalequipment.item.Trinket.ItemEffectParam;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

public class AnkhShield extends TrinketBase implements ICurioItem {

    private static final UUID KNOCKBACK_REDUCTION_UUID = UUID.fromString("5c65b729-d416-480d-902b-8e34ca5781b5");

    private static int knockbackReduction = 2;

    private final ItemEffectImmuneParam[] effectsImmune = new ItemEffectImmuneParam[] {
            new ItemEffectImmuneParam(MobEffects.POISON),
            new ItemEffectImmuneParam(MobEffects.WEAKNESS),
            new ItemEffectImmuneParam(MobEffects.MOVEMENT_SLOWDOWN),
            new ItemEffectImmuneParam(MobEffects.BLINDNESS),
            new ItemEffectImmuneParam(MobEffects.WITHER),
    };

    private final ItemEffectParam[] effects = new ItemEffectParam[] {
            new ItemEffectParam(MobEffects.FIRE_RESISTANCE, 0),
    };

    public AnkhShield(String itemName, Rarrity rarrity, SlotType slotType) {
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

        for (int i = 0; i < effectsImmune.length; i++) {
            if (player.hasEffect(effectsImmune[i].effect)) {
                player.removeEffect(effectsImmune[i].effect);
            }
        }

        for (int i = 0; i < this.effects.length; i++) {
            if (!player.hasEffect(this.effects[i].effect)) {
                player.addEffect(new MobEffectInstance(this.effects[i].effect, 200, this.effects[i].amplifier));
            }
        }

        ICurioItem.super.curioTick(identifier, index, livingEntity, stack);
    }
}
