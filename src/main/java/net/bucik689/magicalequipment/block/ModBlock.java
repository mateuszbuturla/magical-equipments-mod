package net.bucik689.magicalequipment.block;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            MagicalEquipment.MOD_ID);

    public static final BlockBase MYTHRIL_ORE = new BlockBase("mythril_ore", Material.STONE, 8f, true);
    public static final BlockBase ADAMANTITE_ORE = new BlockBase("adamantite_ore", Material.STONE, 9f, true);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
