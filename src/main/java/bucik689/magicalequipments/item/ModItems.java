package bucik689.magicalequipments.item;

import bucik689.magicalequipments.item.Material.Material;
import bucik689.magicalequipments.item.Trinket.TrinketBase;
import bucik689.magicalequipments.item.Trinket.Rings.RingEffect;
import bucik689.magicalequipments.item.Trinket.Rings.RingEffectResistance;
import bucik689.magicalequipments.item.Trinket.Rings.RingHealth;
import net.minecraft.entity.effect.StatusEffects;
public class ModItems {

        public static final Material OBSIDIAN_CHUNK = new Material("obsidian_chunk");


        public static final TrinketBase RING_OF_RESISTANCE = new RingEffect("ring_of_resistance", StatusEffects.RESISTANCE, 1);
        public static final TrinketBase RING_OF_HEALTH = new RingHealth("ring_of_health", 2);
        public static final TrinketBase ADVANCED_RING_OF_HEALTH = new RingHealth("advanced_ring_of_health", 6);


        public static final TrinketBase OBSIDIAN_SKULL = new RingEffect("obsidian_skull", StatusEffects.FIRE_RESISTANCE, 0);
        public static final TrinketBase FAST_CLOCK = new RingEffectResistance("fast_clock", StatusEffects.SLOWNESS);
        public static final TrinketBase BLINDFOLD = new RingEffectResistance("blindfold", StatusEffects.BLINDNESS);
        public static final TrinketBase ADHESIVE_BANDAGE = new RingEffectResistance("adhesive_bandage", StatusEffects.WITHER);
        public static final TrinketBase ARMOR_POLISH = new RingEffectResistance("armor_polish", StatusEffects.BLINDNESS);
        public static final TrinketBase COBALT_SHIELD = new RingEffectResistance("cobalt_shield", StatusEffects.BLINDNESS);
        public static final TrinketBase ANKH_CHARM = new RingEffectResistance("ankh_charm", StatusEffects.BLINDNESS);
        public static final TrinketBase MEDICATED_BANDAGE = new RingEffectResistance("medicated_bandage", StatusEffects.BLINDNESS);
        public static final TrinketBase OBSIDIAN_SHIELD = new RingEffectResistance("obsidian_shield", StatusEffects.FIRE_RESISTANCE);
        public static final TrinketBase ANKH_SHIELD = new RingEffectResistance("ankh_shield", StatusEffects.BLINDNESS);
        public static final TrinketBase ARMOR_BRACING = new RingEffectResistance("armor_bracing", StatusEffects.BLINDNESS);
        public static final TrinketBase VITAMINS = new RingEffectResistance("vitamins", StatusEffects.WEAKNESS);
        public static final TrinketBase BEZOAR = new RingEffectResistance("bezoar", StatusEffects.POISON);

        public static void registerModItems() {
        }
}