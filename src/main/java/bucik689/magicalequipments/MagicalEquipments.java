package bucik689.magicalequipments;

import bucik689.magicalequipments.item.*;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class MagicalEquipments implements ModInitializer {
	
	public static final Logger LOGGER = LogManager.getLogger("magicalequipments");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
