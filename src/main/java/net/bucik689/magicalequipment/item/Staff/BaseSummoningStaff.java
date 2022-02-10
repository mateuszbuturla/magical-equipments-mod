package net.bucik689.magicalequipment.item.Staff;

import java.util.List;

import net.bucik689.magicalequipment.entity.BaseSummonEntity;
import net.bucik689.magicalequipment.interfaces.ISummoningStaff;
import net.bucik689.magicalequipment.item.ModCreativeModeTab;
import net.bucik689.magicalequipment.item.ModItems;
import net.bucik689.magicalequipment.item.Armor.BaseArmorItem;
import net.bucik689.magicalequipment.item.Armor.BaseChestplate;
import net.bucik689.magicalequipment.item.Armor.ModArmorMaterial;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.entity.EquipmentSlot;

public class BaseSummoningStaff extends Item implements ISummoningStaff {

    private final String itemName;

    public BaseSummoningStaff(String itemName) {
        super(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.TOOLS_TAB));
        this.itemName = itemName;
        ModItems.ITEMS.register(itemName, () -> this);
    }

    public void summonEntity(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
    }

    private int checkIfPlayerHasItemThatGiveAdditionalMinionCapacity(Player pPlayer, EquipmentSlot slot) {

        int armorSlot = 0;
        int fullSetBonus = 0;

        switch (slot) {
            case HEAD -> armorSlot = 3;
            case CHEST -> armorSlot = 2;
            case LEGS -> armorSlot = 1;
            case FEET -> armorSlot = 0;
        }

        Item item = pPlayer.getInventory().getArmor(armorSlot).getItem();

        if (item instanceof BaseArmorItem) {
            ArmorItem armorItem = (ArmorItem) item;
            ArmorMaterial armorMaterial = armorItem.getMaterial();

            if (slot == EquipmentSlot.CHEST) {
                if (armorItem instanceof BaseChestplate) {
                    BaseChestplate chestplate = (BaseChestplate) armorItem;
                    fullSetBonus = chestplate.getFullSetBonusMinionCapacity(pPlayer);
                }
            }

            if (armorMaterial instanceof ModArmorMaterial) {
                ModArmorMaterial modArmorMaterial = (ModArmorMaterial) armorMaterial;
                return modArmorMaterial.getMinionCapacity(slot) + fullSetBonus;
            }
        }

        return 0;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {

        int maxPlayerMinionCapacity = 1;

        maxPlayerMinionCapacity += this.checkIfPlayerHasItemThatGiveAdditionalMinionCapacity(pPlayer,
                EquipmentSlot.HEAD);
        maxPlayerMinionCapacity += this.checkIfPlayerHasItemThatGiveAdditionalMinionCapacity(pPlayer,
                EquipmentSlot.CHEST);
        maxPlayerMinionCapacity += this.checkIfPlayerHasItemThatGiveAdditionalMinionCapacity(pPlayer,
                EquipmentSlot.LEGS);
        maxPlayerMinionCapacity += this.checkIfPlayerHasItemThatGiveAdditionalMinionCapacity(pPlayer,
                EquipmentSlot.FEET);

        List<BaseSummonEntity> entities = pLevel.getEntitiesOfClass(BaseSummonEntity.class,
                new AABB(pPlayer.getX() - 3000, pPlayer.getY() - 3000, pPlayer.getZ() - 3000,
                        pPlayer.getX() + 3000,
                        pPlayer.getY() + 3000, pPlayer.getZ() + 3000),
                (target) -> {
                    return target.getOwnerUUID() == pPlayer.getUUID() && target.isSummonedByStaff();
                });

        if (entities.size() < maxPlayerMinionCapacity) {
            this.summonEntity(pLevel, pPlayer, pUsedHand);
        } else {
            if (entities.get(0).hurt(DamageSource.GENERIC, entities.get(0).getMaxHealth())) {
                this.summonEntity(pLevel, pPlayer, pUsedHand);
            }
        }

        return InteractionResultHolder.pass(pPlayer.getItemInHand(pUsedHand));
    }

    public String getItemName() {
        return itemName;
    }
}
