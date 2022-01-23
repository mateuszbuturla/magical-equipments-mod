package net.bucik689.magicalequipment.keybind;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.minecraft.client.KeyMapping;

import net.minecraftforge.client.ClientRegistry;

public class KeyBind extends KeyMapping {
    public KeyBind(String action, int defaultKey, String category) {
        super("key." + MagicalEquipment.MOD_ID + "." + action, 342, "key." + MagicalEquipment.MOD_ID + "." + category);
        ClientRegistry.registerKeyBinding(this);
    }
}
