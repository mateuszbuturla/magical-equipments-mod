package net.bucik689.magicalequipment.item.Trinket.Artifact;

import java.util.List;

import javax.annotation.Nullable;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.bucik689.magicalequipment.item.Rarrity;
import net.bucik689.magicalequipment.item.Trinket.SlotType;
import net.bucik689.magicalequipment.item.Trinket.TrinketBase;
import net.bucik689.magicalequipment.keybind.ModKeyBinds;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import java.util.UUID;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class BloodWell extends TrinketBase implements ICurioItem {

    public final String itemName;

    private static final UUID ATTACK_DAMAGE_UUID = UUID.fromString("9b874db1-75f9-4cf1-b240-a98213fed923");
    private static final UUID ATTACK_SPEED_UUID = UUID.fromString("79eee79c-cae5-4a4f-8c5d-5348f6e6c54c");

    private int ticksBetweenDamagePlayer = 20;
    private int ticksToDamagePlayer = 0;
    private int healthDrain = 1;
    public int attackDamage = 4;
    public int attackSpeed = 1;
    private boolean isActive = false;
    private boolean addedModifiers = false;
    private boolean canBeToggled = true;

    public BloodWell(String itemName, Rarrity rarrity, SlotType slotType) {
        super(itemName, rarrity, slotType);
        this.itemName = itemName;
    }

    public void additionalAppendTooltip(ItemStack pStack, @Nullable Level pLevel,
            List<Component> pTooltipComponents,
            TooltipFlag pIsAdvanced) {
        pTooltipComponents
                .add(new TranslatableComponent(
                        "tooltip." + MagicalEquipment.MOD_ID + ".shift_to_additional_information")
                                .withStyle(ChatFormatting.DARK_BLUE));
        if (Screen.hasShiftDown()) {
            pTooltipComponents
                    .add(new TranslatableComponent(
                            MagicalEquipment.MOD_ID + ".item.advanced_description." + this.itemName)
                                    .withStyle(ChatFormatting.GOLD));
        }
    }

    // @Override
    // public Multimap<Attribute, AttributeModifier>
    // getAttributeModifiers(SlotContext slotContext,
    // UUID uuid, ItemStack stack) {
    // Multimap<Attribute, AttributeModifier> modifiers = HashMultimap.create();
    // if (this.isActive) {
    // modifiers.put(Attributes.ATTACK_DAMAGE,
    // new AttributeModifier(ATTACK_DAMAGE_UUID, "Attack Damage", attackDamage,
    // AttributeModifier.Operation.ADDITION));
    // modifiers.put(Attributes.ATTACK_SPEED,
    // new AttributeModifier(ATTACK_SPEED_UUID, "Attack Speed", attackSpeed,
    // AttributeModifier.Operation.ADDITION));
    // }
    // return modifiers;
    // }

    @Override
    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
        Player player = (Player) livingEntity;

        if (this.isActive) {
            this.ticksToDamagePlayer--;
            if (this.ticksToDamagePlayer < 1) {
                player.hurt(DamageSource.MAGIC, this.healthDrain);
                this.ticksToDamagePlayer = this.ticksBetweenDamagePlayer;
            }
            if (!this.addedModifiers) {
                this.addedModifiers = true;
                MagicalEquipment.LOGGER.info("attribute added");
                player.getAttribute(Attributes.ATTACK_DAMAGE)
                        .addTransientModifier(new AttributeModifier(ATTACK_DAMAGE_UUID, "Attack Damage", attackDamage,
                                AttributeModifier.Operation.ADDITION));
            }
        } else {
            this.ticksToDamagePlayer = 0;
            if (this.addedModifiers) {
                this.addedModifiers = false;
                MagicalEquipment.LOGGER.info("attribute removed");
                player.getAttribute(Attributes.ATTACK_DAMAGE).removeModifier(ATTACK_DAMAGE_UUID);
            }
        }

        if (ModKeyBinds.ACTIVATE_BLOOD_WEEL.isDown() && this.canBeToggled) {
            this.isActive = !this.isActive;
            this.canBeToggled = false;
        } else if (!ModKeyBinds.ACTIVATE_BLOOD_WEEL.isDown()) {
            this.canBeToggled = true;
        }
    }
}
