package bucik689.magicalequipments.item;

import bucik689.magicalequipments.item.Material.Material;
import bucik689.magicalequipments.item.Trinket.TrinketBase;
import bucik689.magicalequipments.item.Trinket.Artifacts.AnkhShield;
import bucik689.magicalequipments.item.Trinket.Artifacts.CobaltShield;
import bucik689.magicalequipments.item.Trinket.Artifacts.EmblemOfDefensive;
import bucik689.magicalequipments.item.Trinket.Artifacts.EmblemOfFierce;
import bucik689.magicalequipments.item.Trinket.Artifacts.ObsidianShield;
import bucik689.magicalequipments.item.Trinket.Rings.RingEffect;
import bucik689.magicalequipments.item.Trinket.Rings.RingEffectParam;
import bucik689.magicalequipments.item.Trinket.Rings.RingEffectResistance;
import bucik689.magicalequipments.item.Trinket.Rings.RingEffectResistanceParam;
import bucik689.magicalequipments.item.Trinket.Rings.RingHealth;
import net.minecraft.entity.effect.StatusEffects;
public class ModItems {

        public static final Material OBSIDIAN_CHUNK = new Material("obsidian_chunk");

        public static final TrinketBase RING_OF_RESISTANCE = new RingEffect("ring_of_resistance", Rarrity.RARE, SlotType.RING, new RingEffectParam[] {new RingEffectParam(StatusEffects.RESISTANCE, 0), new RingEffectParam(StatusEffects.ABSORPTION, 0)});
        public static final TrinketBase ADVANCED_RING_OF_RESISTANCE = new RingEffect("advanced_ring_of_resistance", Rarrity.EPIC, SlotType.RING, new RingEffectParam[] {new RingEffectParam(StatusEffects.RESISTANCE, 1)});
        public static final TrinketBase RING_OF_HEALTH = new RingHealth("ring_of_health", Rarrity.EPIC, SlotType.RING, 2);
        public static final TrinketBase ADVANCED_RING_OF_HEALTH = new RingHealth("advanced_ring_of_health", Rarrity.LEGENDARY, SlotType.RING, 6);
        public static final TrinketBase RING_OF_SPEED = new RingEffect("ring_of_speed", Rarrity.COMMON, SlotType.RING, new RingEffectParam[] {new RingEffectParam(StatusEffects.SPEED, 0)});
        public static final TrinketBase ADVANCED_RING_OF_SPEED = new RingEffect("advanced_ring_of_speed", Rarrity.RARE, SlotType.RING, new RingEffectParam[] {new RingEffectParam(StatusEffects.SPEED, 1)});
        public static final TrinketBase RING_OF_STRENGTH = new RingEffect("ring_of_strength", Rarrity.RARE, SlotType.RING, new RingEffectParam[] {new RingEffectParam(StatusEffects.STRENGTH, 0)});
        public static final TrinketBase ADVANCED_RING_OF_STRENGTH = new RingEffect("advanced_ring_of_strength", Rarrity.EPIC, SlotType.RING, new RingEffectParam[] {new RingEffectParam(StatusEffects.STRENGTH, 1)});
        public static final TrinketBase RING_OF_TANK = new RingEffect("ring_of_tank", Rarrity.EPIC, SlotType.RING, new RingEffectParam[] {new RingEffectParam(StatusEffects.RESISTANCE, 2), new RingEffectParam(StatusEffects.SLOWNESS, 2)});

        public static final TrinketBase OBSIDIAN_SKULL = new RingEffect("obsidian_skull", Rarrity.COMMON, SlotType.ARTIFACT, new RingEffectParam[] {new RingEffectParam(StatusEffects.FIRE_RESISTANCE, 0)});
        public static final TrinketBase FAST_CLOCK = new RingEffectResistance("fast_clock", Rarrity.RARE, SlotType.ARTIFACT, new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.SLOWNESS)});
        public static final TrinketBase BLINDFOLD = new RingEffectResistance("blindfold", Rarrity.RARE, SlotType.ARTIFACT, new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.BLINDNESS)});
        public static final TrinketBase ADHESIVE_BANDAGE = new RingEffectResistance("adhesive_bandage", Rarrity.RARE, SlotType.ARTIFACT, new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.WITHER)});
        public static final TrinketBase ARMOR_POLISH = new RingEffectResistance("armor_polish", Rarrity.RARE, SlotType.ARTIFACT, new RingEffectResistanceParam[] {});
        public static final TrinketBase COBALT_SHIELD = new CobaltShield("cobalt_shield", Rarrity.RARE, SlotType.ARTIFACT);
        public static final TrinketBase ANKH_CHARM = new RingEffectResistance("ankh_charm", Rarrity.EPIC, SlotType.ARTIFACT, new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.SLOWNESS), new RingEffectResistanceParam(StatusEffects.WITHER), new RingEffectResistanceParam(StatusEffects.POISON), new RingEffectResistanceParam(StatusEffects.WEAKNESS), new RingEffectResistanceParam(StatusEffects.BLINDNESS)});
        public static final TrinketBase MEDICATED_BANDAGE = new RingEffectResistance("medicated_bandage", Rarrity.RARE, SlotType.ARTIFACT, new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.WITHER), new RingEffectResistanceParam(StatusEffects.BLINDNESS)});
        public static final TrinketBase OBSIDIAN_SHIELD = new ObsidianShield("obsidian_shield", Rarrity.EPIC, SlotType.ARTIFACT);
        public static final TrinketBase ANKH_SHIELD = new AnkhShield("ankh_shield", Rarrity.LEGENDARY, SlotType.ARTIFACT);
        public static final TrinketBase ARMOR_BRACING = new RingEffectResistance("armor_bracing", Rarrity.EPIC, SlotType.ARTIFACT,  new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.WEAKNESS)});
        public static final TrinketBase VITAMINS = new RingEffectResistance("vitamins", Rarrity.RARE, SlotType.ARTIFACT, new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.WEAKNESS)});
        public static final TrinketBase BEZOAR = new RingEffectResistance("bezoar", Rarrity.RARE, SlotType.ARTIFACT, new RingEffectResistanceParam[] {new RingEffectResistanceParam(StatusEffects.POISON)});
        public static final TrinketBase EMBLEM_OF_ABSORPTION = new RingEffect("emblem_of_absorption", Rarrity.EPIC, SlotType.ARTIFACT, new RingEffectParam[] {new RingEffectParam(StatusEffects.ABSORPTION, 1)});
        public static final TrinketBase EMBLEM_OF_FIERCE = new EmblemOfFierce("emblem_of_fierce", Rarrity.EPIC, SlotType.ARTIFACT);
        public static final TrinketBase EMBLEM_OF_DEFENSIVE = new EmblemOfDefensive("emblem_of_defensive", Rarrity.EPIC, SlotType.ARTIFACT);

        public static void registerModItems() {
                
        }
}