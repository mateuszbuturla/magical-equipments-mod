package bucik689.magicalequipments.item;

import bucik689.magicalequipments.item.Material.Material;
import bucik689.magicalequipments.item.Trinket.TrinketBase;
import bucik689.magicalequipments.item.Trinket.Rings.RingEffect;
import bucik689.magicalequipments.item.Trinket.Rings.RingEffectParam;
import bucik689.magicalequipments.item.Trinket.Rings.RingEffectResistance;
import bucik689.magicalequipments.item.Trinket.Rings.RingEffectResistanceParam;
import bucik689.magicalequipments.item.Trinket.Rings.RingHealth;
import net.minecraft.entity.effect.StatusEffects;
public class ModItems {

        public static final Material OBSIDIAN_CHUNK = new Material("obsidian_chunk");

        public static final TrinketBase RING_OF_RESISTANCE = new RingEffect("ring_of_resistance", new RingEffectParam[] {new RingEffectParam(StatusEffects.RESISTANCE, 0), new RingEffectParam(StatusEffects.ABSORPTION, 0)});
        public static final TrinketBase ADVANCED_RING_OF_RESISTANCE = new RingEffect("advanced_ring_of_resistance", new RingEffectParam[] {new RingEffectParam(StatusEffects.RESISTANCE, 1)});
        public static final TrinketBase RING_OF_HEALTH = new RingHealth("ring_of_health", 2);
        public static final TrinketBase ADVANCED_RING_OF_HEALTH = new RingHealth("advanced_ring_of_health", 6);
        public static final TrinketBase RING_OF_SPEED = new RingEffect("ring_of_speed", new RingEffectParam[] {new RingEffectParam(StatusEffects.SPEED, 0)});
        public static final TrinketBase ADVANCED_RING_OF_SPEED = new RingEffect("advanced_ring_of_speed", new RingEffectParam[] {new RingEffectParam(StatusEffects.SPEED, 1)});
        public static final TrinketBase RING_OF_STRENGTH = new RingEffect("ring_of_strength", new RingEffectParam[] {new RingEffectParam(StatusEffects.STRENGTH, 0)});
        public static final TrinketBase ADVANCED_RING_OF_STRENGTH = new RingEffect("advanced_ring_of_strength", new RingEffectParam[] {new RingEffectParam(StatusEffects.STRENGTH, 1)});

        public static final TrinketBase OBSIDIAN_SKULL = new RingEffect("obsidian_skull", new RingEffectParam[] {new RingEffectParam(StatusEffects.FIRE_RESISTANCE, 0)});
        public static final TrinketBase FAST_CLOCK = new RingEffectResistance("fast_clock", new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.SLOWNESS)});
        public static final TrinketBase BLINDFOLD = new RingEffectResistance("blindfold", new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.BLINDNESS)});
        public static final TrinketBase ADHESIVE_BANDAGE = new RingEffectResistance("adhesive_bandage", new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.WITHER)});
        public static final TrinketBase ARMOR_POLISH = new RingEffectResistance("armor_polish", new RingEffectResistanceParam[] {});
        public static final TrinketBase COBALT_SHIELD = new RingEffectResistance("cobalt_shield", new RingEffectResistanceParam[] {});
        public static final TrinketBase ANKH_CHARM = new RingEffectResistance("ankh_charm", new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.SLOWNESS), new RingEffectResistanceParam(StatusEffects.WITHER), new RingEffectResistanceParam(StatusEffects.POISON), new RingEffectResistanceParam(StatusEffects.WEAKNESS), new RingEffectResistanceParam(StatusEffects.BLINDNESS)});
        public static final TrinketBase MEDICATED_BANDAGE = new RingEffectResistance("medicated_bandage", new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.WITHER), new RingEffectResistanceParam(StatusEffects.BLINDNESS)});
        public static final TrinketBase OBSIDIAN_SHIELD = new RingEffect("obsidian_shield", new RingEffectParam[] {new RingEffectParam(StatusEffects.FIRE_RESISTANCE, 0)});
        public static final TrinketBase ANKH_SHIELD = new RingEffectResistance("ankh_shield",  new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.SLOWNESS), new RingEffectResistanceParam(StatusEffects.WITHER), new RingEffectResistanceParam(StatusEffects.POISON), new RingEffectResistanceParam(StatusEffects.WEAKNESS), new RingEffectResistanceParam(StatusEffects.BLINDNESS)});//UPDATE
        public static final TrinketBase ARMOR_BRACING = new RingEffectResistance("armor_bracing",  new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.WEAKNESS)});
        public static final TrinketBase VITAMINS = new RingEffectResistance("vitamins",  new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.WEAKNESS)});
        public static final TrinketBase BEZOAR = new RingEffectResistance("bezoar", new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.POISON)});

        public static void registerModItems() {
                
        }
}