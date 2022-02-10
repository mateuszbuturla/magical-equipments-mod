package net.bucik689.magicalequipment.item.Whip;

import java.util.List;

import javax.annotation.Nullable;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.bucik689.magicalequipment.entity.BaseSummonEntity;
import net.bucik689.magicalequipment.item.ModCreativeModeTab;
import net.bucik689.magicalequipment.item.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.common.ForgeTier;

public class BaseWhip extends SwordItem {

    public BaseWhip(String itemName, ForgeTier tier) {
        super(tier, 0, -2F,
                new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB));
        ModItems.ITEMS.register(itemName, () -> this);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {

        List<BaseSummonEntity> entities = pTarget.getLevel().getEntitiesOfClass(BaseSummonEntity.class,
                new AABB(pAttacker.getX() - 3000, pAttacker.getY() - 3000, pAttacker.getZ() - 3000,
                        pAttacker.getX() + 3000,
                        pAttacker.getY() + 3000, pAttacker.getZ() + 3000),
                (target) -> {
                    return target.getOwnerUUID() == pAttacker.getUUID() && target.isSummonedByStaff();
                });

        for (int i = 0; i < entities.size(); i++) {
            entities.get(i).setOwnerTarget(pTarget);
        }

        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
            TooltipFlag pIsAdvanced) {
        pTooltipComponents
                .add(new TranslatableComponent(
                        MagicalEquipment.MOD_ID + ".item.description.whip")
                                .withStyle(ChatFormatting.GOLD));
    }

}
