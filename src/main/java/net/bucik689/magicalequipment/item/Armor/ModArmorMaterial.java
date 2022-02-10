package net.bucik689.magicalequipment.item.Armor;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.bucik689.magicalequipment.item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;
import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
    MYTHRIL("mythril", 37, new int[] { 4, 6, 8, 3 }, 10,
            SoundEvents.ARMOR_EQUIP_IRON, 2.5F, 0.1F, () -> {
                return Ingredient.of(ModItems.MYTHRIL_INGOT);
            }, new int[] { 0, 0, 0, 0 }),

    ADAMANTITE("adamantite", 42, new int[] { 3, 7, 9, 4 }, 12,
            SoundEvents.ARMOR_EQUIP_IRON, 3F, 0.1F, () -> {
                return Ingredient.of(ModItems.ADAMANTITE_INGOT);
            }, new int[] { 0, 0, 0, 0 }),

    SPIDER_FANG("spider_fang", 15, new int[] { 1, 3, 4, 2 }, 12,
            SoundEvents.ARMOR_EQUIP_LEATHER, 3F, 0.1F, () -> {
                return Ingredient.of(ModItems.SPIDER_FANG);
            }, new int[] { 0, 0, 1, 0 });

    private static final int[] HEALTH_PER_SLOT = new int[] { 13, 15, 16, 11 };
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredient;
    private final int[] minionsCapacity;

    ModArmorMaterial(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue,
            SoundEvent sound, float toughness,
            float knockbackResistance, Supplier<Ingredient> repairIngredient, int[] minionsCapacity) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = Lazy.of(repairIngredient);
        this.minionsCapacity = minionsCapacity;
    }

    public int getMinionCapacity(EquipmentSlot pSlot) {
        return this.minionsCapacity[pSlot.getIndex()];
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return MagicalEquipment.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
