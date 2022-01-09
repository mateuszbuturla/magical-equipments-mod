package bucik689.magicalequipments;

import bucik689.magicalequipments.effects.ModEffects;
import bucik689.magicalequipments.item.*;
import net.fabricmc.api.ModInitializer;

public class MagicalEquipments implements ModInitializer {

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModEffects.registerModEffects();
	}
}
