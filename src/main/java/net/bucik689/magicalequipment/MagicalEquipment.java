package net.bucik689.magicalequipment;

import net.bucik689.magicalequipment.block.ModBlock;
import net.bucik689.magicalequipment.entity.ModEntities;
import net.bucik689.magicalequipment.event.AdamantiteGolemEvent;
import net.bucik689.magicalequipment.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.SlotTypePreset;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MagicalEquipment.MOD_ID)
public class MagicalEquipment {
    public static final String MOD_ID = "magicalequipment";

    public static final Logger LOGGER = LogManager.getLogger();

    public MagicalEquipment() {
        GeckoLib.initialize();
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlock.register(eventBus);
        ModEntities.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::enqueueIMC);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new AdamantiteGolemEvent());
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE,
                () -> SlotTypePreset.CHARM.getMessageBuilder().build());
        InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE,
                () -> SlotTypePreset.RING.getMessageBuilder().size(2).build());
        InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE,
                () -> SlotTypePreset.BELT.getMessageBuilder().size(3).build());
    }

    private void setup(final FMLCommonSetupEvent event) {
    }
}
