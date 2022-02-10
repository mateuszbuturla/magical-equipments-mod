package net.bucik689.magicalequipment.item.Armor;

import javax.annotation.Nullable;

import java.util.List;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;

public class BaseArmorItem extends ArmorItem {
        private String description;
        private String additionalDescription;
        private int minionCapacity = 0;

        public BaseArmorItem(ModArmorMaterial pMaterial, EquipmentSlot pSlot, Item.Properties pProperties,
                        @Nullable String description, @Nullable String additionalDescription) {
                super(pMaterial, pSlot, pProperties);
                this.description = description;
                this.additionalDescription = additionalDescription;
                if (pMaterial.getMinionCapacity(pSlot) != 0) {
                        this.minionCapacity = pMaterial.getMinionCapacity(pSlot);
                }
        }

        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
                        TooltipFlag pIsAdvanced) {
                if (this.description != null) {
                        pTooltipComponents
                                        .add(new TranslatableComponent(
                                                        MagicalEquipment.MOD_ID + ".item.description."
                                                                        + this.description)
                                                                                        .withStyle(ChatFormatting.GOLD));
                }

                if (this.additionalDescription != null) {
                        pTooltipComponents
                                        .add(new TranslatableComponent(
                                                        "tooltip." + MagicalEquipment.MOD_ID
                                                                        + ".shift_to_additional_information")
                                                                                        .withStyle(ChatFormatting.DARK_BLUE));
                        if (Screen.hasShiftDown()) {
                                pTooltipComponents
                                                .add(new TranslatableComponent(
                                                                MagicalEquipment.MOD_ID + ".item.advanced_description."
                                                                                + this.additionalDescription)
                                                                                                .withStyle(ChatFormatting.GOLD));
                        }
                }

                if (this.minionCapacity != 0) {
                        pTooltipComponents
                                        .add(new TranslatableComponent(
                                                        "tooltip." + MagicalEquipment.MOD_ID + ".minion_capacity",
                                                        new TextComponent(String.valueOf(this.minionCapacity))));
                }
        }
}
