package bucik689.magicalequipments.item;

import bucik689.magicalequipments.effects.EffectDefiniction;
import bucik689.magicalequipments.effects.ModEffects;
import bucik689.magicalequipments.item.Material.Material;
import bucik689.magicalequipments.item.Trinket.Trinket;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItems {

        public static final Trinket OBSIDIAN_SKULL = new Trinket(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "obsidian_skull", new EffectDefiniction[] {new EffectDefiniction(StatusEffects.FIRE_RESISTANCE, 20 * 2 * 1, 0,false)});
        public static final Trinket RING_OF_RESISTANCE = new Trinket(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "ring_of_resistance", new EffectDefiniction[] {new EffectDefiniction(StatusEffects.RESISTANCE, 20 * 2 * 1, 0, false)});
        public static final Material OBSIDIAN_CHUNK = new Material(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "obsidian_chunk");
        public static final Trinket FAST_CLOCK = new Trinket(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "fast_clock", new EffectDefiniction[] {new EffectDefiniction(ModEffects.ANTI_SLOWNESS, 20 * 2 * 1, 0, false)});
        public static final Trinket BLINDFOLD = new Trinket(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "blindfold", new EffectDefiniction[] {new EffectDefiniction(ModEffects.ANTI_BLINDNESS, 20 * 2 * 1, 0, false)});
        public static final Trinket ADHESIVE_BANDAGE = new Trinket(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "adhesive_bandage", new EffectDefiniction[] {});
        public static final Trinket ARMOR_POLISH = new Trinket(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "armor_polish", new EffectDefiniction[] {});
        public static final Trinket COBALT_SHIELD = new Trinket(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "cobalt_shield", new EffectDefiniction[] {});
        public static final Trinket ANKH_CHARM = new Trinket(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "ankh_charm", new EffectDefiniction[] {});
        public static final Trinket MEDICATED_BANDAGE = new Trinket(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "medicated_bandage", new EffectDefiniction[] {});
        public static final Trinket OBSIDIAN_SHIELD = new Trinket(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "obsidian_shield", new EffectDefiniction[] {});
        public static final Trinket ANKH_SHIELD = new Trinket(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "ankh_shield", new EffectDefiniction[] {});
        public static final Trinket ARMOR_BRACING = new Trinket(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "armor_bracing", new EffectDefiniction[] {});
        public static final Trinket VITAMINS = new Trinket(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "vitamins", new EffectDefiniction[] {new EffectDefiniction(ModEffects.ANTI_WEAKNESS, 20 * 2 * 1, 0, false)});
        public static final Trinket BEZOAR = new Trinket(new Item.Settings().group(ModItemGroup.MAGICALEQUIPMENT), "bezoar", new EffectDefiniction[] {new EffectDefiniction(ModEffects.ANTI_POISON, 20 * 2 * 1, 0, false)});

        public static void registerModItems() {
        }
}