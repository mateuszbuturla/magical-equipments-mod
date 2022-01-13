package net.bucik689.magicalequipment.item;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        MagicalEquipment.MOD_ID);

        public static final Material OBSIDIAN_CHUNK = new Material("obsidian_chunk");

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
