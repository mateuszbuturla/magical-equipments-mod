package bucik689.magicalequipments.item;

import bucik689.magicalequipments.item.Material.Material;
import bucik689.magicalequipments.item.Trinket.Trinket;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItems {

        public static final Trinket OBSIDIAN_SKULL = new Trinket(new Item.Settings().group(ItemGroup.MISC), "obsidian_skull", new StatusEffectInstance[] {new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 80, 0, true,false)});
        public static final Trinket RING_OF_RESISTANCE = new Trinket(new Item.Settings().group(ItemGroup.MISC), "ring_of_resistance", new StatusEffectInstance[] {new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 0, true, false)});
        public static final Material OBSIDIAN_CHUNK = new Material(new Item.Settings().group(ItemGroup.MISC), "obsidian_chunk");

        public static void registerModItems() {
        }
}