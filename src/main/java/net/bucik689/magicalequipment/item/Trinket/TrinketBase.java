package net.bucik689.magicalequipment.item.Trinket;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.bucik689.magicalequipment.item.ModCreativeModeTab;
import net.bucik689.magicalequipment.item.ModItems;
import net.bucik689.magicalequipment.item.Rarrity;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.ChatFormatting;

public class TrinketBase extends Item {

        private final String itemName;
        private final Rarrity rarrity;
        private final SlotType slotType;

        public TrinketBase(String itemName, Rarrity rarrity, SlotType slotType) {
                super(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.MAGICAL_EQUIPMENT_TAB));
                this.itemName = itemName;
                this.rarrity = rarrity;
                this.slotType = slotType;
                ModItems.ITEMS.register(itemName, () -> this);
        }

        public String getItemName() {
                return itemName;
        }

        public void additionalAppendTooltip(ItemStack pStack, @Nullable Level pLevel,
                        List<Component> pTooltipComponents,
                        TooltipFlag pIsAdvanced) {
        }

        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
                        TooltipFlag pIsAdvanced) {
                switch (slotType) {
                        case RING -> pTooltipComponents.add(
                                        new TranslatableComponent("tooltip." + MagicalEquipment.MOD_ID + ".slot.ring")
                                                        .withStyle(ChatFormatting.GOLD));
                        case NECKLACE -> pTooltipComponents
                                        .add(new TranslatableComponent(
                                                        "tooltip." + MagicalEquipment.MOD_ID + ".slot.necklace")
                                                                        .withStyle(ChatFormatting.GOLD));
                        case ARTIFACT -> pTooltipComponents
                                        .add(new TranslatableComponent(
                                                        "tooltip." + MagicalEquipment.MOD_ID + ".slot.artifact")
                                                                        .withStyle(ChatFormatting.GOLD));
                }
                switch (rarrity) {
                        case COMMON -> pTooltipComponents.add(
                                        new TranslatableComponent(
                                                        "tooltip." + MagicalEquipment.MOD_ID + ".rarrity.common")
                                                                        .withStyle(ChatFormatting.GREEN));
                        case RARE -> pTooltipComponents
                                        .add(new TranslatableComponent(
                                                        "tooltip." + MagicalEquipment.MOD_ID + ".rarrity.rare")
                                                                        .withStyle(ChatFormatting.BLUE));
                        case EPIC -> pTooltipComponents
                                        .add(new TranslatableComponent(
                                                        "tooltip." + MagicalEquipment.MOD_ID + ".rarrity.epic")
                                                                        .withStyle(ChatFormatting.LIGHT_PURPLE));
                        case LEGENDARY -> pTooltipComponents.add(
                                        new TranslatableComponent(
                                                        "tooltip." + MagicalEquipment.MOD_ID + ".rarrity.legendary")
                                                                        .withStyle(ChatFormatting.RED));
                        case UNIQUE -> pTooltipComponents.add(
                                        new TranslatableComponent(
                                                        "tooltip." + MagicalEquipment.MOD_ID + ".rarrity.unique")
                                                                        .withStyle(ChatFormatting.DARK_RED));
                }
                pTooltipComponents
                                .add(new TranslatableComponent("tooltip." + MagicalEquipment.MOD_ID + ".when_equipped")
                                                .withStyle(ChatFormatting.GOLD));
                pTooltipComponents.add(
                                new TranslatableComponent(MagicalEquipment.MOD_ID + ".item.description." + itemName)
                                                .withStyle(ChatFormatting.BLUE));
                additionalAppendTooltip(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }

        @Override
        public boolean isFoil(ItemStack pStack) {
                return true;
        }
}
