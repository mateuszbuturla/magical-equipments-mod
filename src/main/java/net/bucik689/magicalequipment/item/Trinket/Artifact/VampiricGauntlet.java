package net.bucik689.magicalequipment.item.Trinket.Artifact;

import java.util.List;

import javax.annotation.Nullable;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.bucik689.magicalequipment.item.Rarrity;
import net.bucik689.magicalequipment.item.Trinket.SlotType;
import net.bucik689.magicalequipment.item.Trinket.TrinketBase;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;

public class VampiricGauntlet extends TrinketBase {

    public final String itemName;

    public int usedCount = 0;

    public VampiricGauntlet(String itemName, Rarrity rarrity, SlotType slotType) {
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

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack itemStackIn = pPlayer.getMainHandItem();
        CompoundTag nbtTagCompound = itemStackIn.getTag();

        if (nbtTagCompound == null) {
            nbtTagCompound = new CompoundTag();
            itemStackIn.setTag(nbtTagCompound);
        }
        int currentCount = nbtTagCompound.getInt("usedCount");

        if (pPlayer.isCrouching()) {
            if (pPlayer.getHealth() > 2 && currentCount < 20) {
                pPlayer.setHealth(pPlayer.getHealth() - 2);
                nbtTagCompound.putInt("usedCount", currentCount + 1);
            }
        } else {
            pPlayer.heal(currentCount);
            nbtTagCompound.putInt("usedCount", 0);
        }

        return InteractionResultHolder.pass(pPlayer.getItemInHand(pUsedHand));
    }
}
