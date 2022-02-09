package net.bucik689.magicalequipment.item.Staff;

import java.util.List;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.bucik689.magicalequipment.entity.BaseSummonEntity;
import net.bucik689.magicalequipment.interfaces.ISummoningStaff;
import net.bucik689.magicalequipment.item.ModCreativeModeTab;
import net.bucik689.magicalequipment.item.ModItems;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

public class BaseSummoningStaff extends Item implements ISummoningStaff {

    private final String itemName;

    public BaseSummoningStaff(String itemName) {
        super(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.TOOLS_TAB));
        this.itemName = itemName;
        ModItems.ITEMS.register(itemName, () -> this);
    }

    public void summonEntity(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {

        int maxPlayerSummonsCount = 1;

        List<BaseSummonEntity> entities = pLevel.getEntitiesOfClass(BaseSummonEntity.class,
                new AABB(pPlayer.getX() - 300, pPlayer.getY() - 300, pPlayer.getZ() - 300, pPlayer.getX() + 300,
                        pPlayer.getY() + 300, pPlayer.getZ() + 300));

        if (entities.size() < maxPlayerSummonsCount) {
            this.summonEntity(pLevel, pPlayer, pUsedHand);
        } else {
            pPlayer.sendMessage(new TranslatableComponent(MagicalEquipment.MOD_ID + ".entity_cannot_be_summoned"),
                    pPlayer.getUUID());
        }

        return InteractionResultHolder.pass(pPlayer.getItemInHand(pUsedHand));
    }

    public String getItemName() {
        return itemName;
    }
}
