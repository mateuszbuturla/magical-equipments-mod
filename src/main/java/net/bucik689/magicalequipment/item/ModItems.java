package net.bucik689.magicalequipment.item;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.bucik689.magicalequipment.item.Material.Material;
import net.bucik689.magicalequipment.item.Trinket.ItemEffectParam;
import net.bucik689.magicalequipment.item.Trinket.ItemEffectImmuneParam;
import net.bucik689.magicalequipment.item.Trinket.SlotType;
import net.bucik689.magicalequipment.item.Trinket.TrinketEffect;
import net.bucik689.magicalequipment.item.Trinket.TrinketEffectImmune;
import net.bucik689.magicalequipment.item.Trinket.Artifact.AnkhShield;
import net.bucik689.magicalequipment.item.Trinket.Artifact.CobaltShield;
import net.bucik689.magicalequipment.item.Trinket.Artifact.DefensiveEmblem;
import net.bucik689.magicalequipment.item.Trinket.Artifact.EmblemOfAbsorption;
import net.bucik689.magicalequipment.item.Trinket.Artifact.EmblemOfFierce;
import net.bucik689.magicalequipment.item.Trinket.Artifact.ObsidianShield;
import net.bucik689.magicalequipment.item.Trinket.Artifact.OffensiveEmblem;
import net.bucik689.magicalequipment.item.Trinket.Artifact.SmallEmblem;
import net.bucik689.magicalequipment.item.Trinket.Artifact.VampiricGauntlet;
import net.bucik689.magicalequipment.item.Trinket.Ring.RingHealth;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        MagicalEquipment.MOD_ID);

        public static final Material OBSIDIAN_CHUNK = new Material("obsidian_chunk");
        public static final TrinketEffect OBSIDIAN_SKULL = new TrinketEffect("obsidian_skull", Rarrity.COMMON,
                        SlotType.ARTIFACT,
                        new ItemEffectParam[] { new ItemEffectParam(MobEffects.FIRE_RESISTANCE, 0) });
        public static final TrinketEffectImmune FAST_CLOCK = new TrinketEffectImmune("fast_clock", Rarrity.RARE,
                        SlotType.ARTIFACT,
                        new ItemEffectImmuneParam[] { new ItemEffectImmuneParam(MobEffects.MOVEMENT_SLOWDOWN) });
        public static final TrinketEffectImmune BLINDFOLD = new TrinketEffectImmune("blindfold", Rarrity.RARE,
                        SlotType.ARTIFACT,
                        new ItemEffectImmuneParam[] { new ItemEffectImmuneParam(MobEffects.BLINDNESS) });
        public static final TrinketEffectImmune ADHESIVE_BANDAGE = new TrinketEffectImmune("adhesive_bandage",
                        Rarrity.RARE, SlotType.ARTIFACT,
                        new ItemEffectImmuneParam[] { new ItemEffectImmuneParam(MobEffects.WITHER) });
        public static final TrinketEffectImmune ARMOR_POLISH = new TrinketEffectImmune("armor_polish", Rarrity.RARE,
                        SlotType.ARTIFACT, new ItemEffectImmuneParam[] {});
        public static final CobaltShield COBALT_SHIELD = new CobaltShield("cobalt_shield", Rarrity.RARE,
                        SlotType.ARTIFACT);
        public static final TrinketEffectImmune ANKH_CHARM = new TrinketEffectImmune("ankh_charm", Rarrity.EPIC,
                        SlotType.ARTIFACT,
                        new ItemEffectImmuneParam[] { new ItemEffectImmuneParam(MobEffects.MOVEMENT_SLOWDOWN),
                                        new ItemEffectImmuneParam(MobEffects.WITHER),
                                        new ItemEffectImmuneParam(MobEffects.POISON),
                                        new ItemEffectImmuneParam(MobEffects.WEAKNESS),
                                        new ItemEffectImmuneParam(MobEffects.BLINDNESS) });
        public static final TrinketEffectImmune MEDICATED_BANDAGE = new TrinketEffectImmune("medicated_bandage",
                        Rarrity.RARE, SlotType.ARTIFACT,
                        new ItemEffectImmuneParam[] { new ItemEffectImmuneParam(MobEffects.WITHER),
                                        new ItemEffectImmuneParam(MobEffects.BLINDNESS) });
        public static final ObsidianShield OBSIDIAN_SHIELD = new ObsidianShield("obsidian_shield", Rarrity.EPIC,
                        SlotType.ARTIFACT);
        public static final AnkhShield ANKH_SHIELD = new AnkhShield("ankh_shield",
                        Rarrity.LEGENDARY, SlotType.ARTIFACT);
        public static final TrinketEffectImmune ARMOR_BRACING = new TrinketEffectImmune("armor_bracing", Rarrity.EPIC,
                        SlotType.ARTIFACT,
                        new ItemEffectImmuneParam[] { new ItemEffectImmuneParam(MobEffects.WEAKNESS) });
        public static final TrinketEffectImmune VITAMINS = new TrinketEffectImmune("vitamins", Rarrity.RARE,
                        SlotType.ARTIFACT,
                        new ItemEffectImmuneParam[] { new ItemEffectImmuneParam(MobEffects.WEAKNESS) });
        public static final TrinketEffectImmune BEZOAR = new TrinketEffectImmune("bezoar", Rarrity.RARE,
                        SlotType.ARTIFACT,
                        new ItemEffectImmuneParam[] { new ItemEffectImmuneParam(MobEffects.POISON) });

        public static final SmallEmblem SMALL_EMBLEM = new SmallEmblem("small_emblem", Rarrity.COMMON,
                        SlotType.ARTIFACT);
        public static final OffensiveEmblem OFFENSIVE_EMBLEM = new OffensiveEmblem("offensive_emblem", Rarrity.RARE,
                        SlotType.ARTIFACT);
        public static final DefensiveEmblem DEFENSIVE_EMBLEM = new DefensiveEmblem("defensive_emblem", Rarrity.RARE,
                        SlotType.ARTIFACT);
        public static final EmblemOfFierce EMBLEM_OF_FIERCE = new EmblemOfFierce("emblem_of_fierce", Rarrity.EPIC,
                        SlotType.ARTIFACT);
        public static final EmblemOfAbsorption EMBLEM_OF_ABSORPTION = new EmblemOfAbsorption("emblem_of_absorption",
                        Rarrity.EPIC,
                        SlotType.ARTIFACT);

        public static final RingHealth RING_OF_HEALTH = new RingHealth("ring_of_health", Rarrity.RARE,
                        SlotType.ARTIFACT, 2);
        public static final RingHealth ADVANCED_RING_OF_HEALTH = new RingHealth("advanced_ring_of_health", Rarrity.EPIC,
                        SlotType.ARTIFACT, 6);
        public static final TrinketEffect RING_OF_RESISTANCE = new TrinketEffect("ring_of_resistance", Rarrity.RARE,
                        SlotType.RING, new ItemEffectParam[] { new ItemEffectParam(MobEffects.DAMAGE_RESISTANCE, 0) });
        public static final TrinketEffect ADVANCED_RING_OF_RESISTANCE = new TrinketEffect(
                        "advanced_ring_of_resistance",
                        Rarrity.EPIC, SlotType.RING,
                        new ItemEffectParam[] { new ItemEffectParam(MobEffects.DAMAGE_RESISTANCE, 0) });

        public static final TrinketEffect RING_OF_SPEED = new TrinketEffect("ring_of_speed", Rarrity.RARE,
                        SlotType.RING, new ItemEffectParam[] { new ItemEffectParam(MobEffects.MOVEMENT_SPEED, 0) });
        public static final TrinketEffect ADVANCED_RING_OF_SPEED = new TrinketEffect(
                        "advanced_ring_of_speed",
                        Rarrity.EPIC, SlotType.RING,
                        new ItemEffectParam[] { new ItemEffectParam(MobEffects.MOVEMENT_SPEED, 1) });

        public static final TrinketEffect RING_OF_STRENGTH = new TrinketEffect("ring_of_strength", Rarrity.RARE,
                        SlotType.RING, new ItemEffectParam[] { new ItemEffectParam(MobEffects.DAMAGE_BOOST, 0) });
        public static final TrinketEffect ADVANCED_RING_OF_STRENGTH = new TrinketEffect(
                        "advanced_ring_of_strength",
                        Rarrity.EPIC, SlotType.RING,
                        new ItemEffectParam[] { new ItemEffectParam(MobEffects.DAMAGE_BOOST, 1) });
        public static final TrinketEffect RING_OF_TANK = new TrinketEffect(
                        "ring_of_tank",
                        Rarrity.EPIC, SlotType.RING,
                        new ItemEffectParam[] { new ItemEffectParam(MobEffects.DAMAGE_RESISTANCE, 2),
                                        new ItemEffectParam(MobEffects.MOVEMENT_SLOWDOWN, 2) });

        public static final VampiricGauntlet VAMPIRIC_GAUNTLET = new VampiricGauntlet("vampiric_gauntlet",
                        Rarrity.UNIQUE, SlotType.NONE);

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
