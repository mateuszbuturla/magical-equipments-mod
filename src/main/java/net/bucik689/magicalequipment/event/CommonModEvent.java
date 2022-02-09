package net.bucik689.magicalequipment.event;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.bucik689.magicalequipment.entity.ModEntities;
import net.bucik689.magicalequipment.entity.Summons.AdamantiteGolem;
import net.bucik689.magicalequipment.entity.Summons.Spider;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = MagicalEquipment.MOD_ID, bus = Bus.MOD)
public class CommonModEvent {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.ADAMANTITE_GOLEM.get(), AdamantiteGolem.createAttributes().build());
        event.put(ModEntities.SPIDER.get(), Spider.createAttributes().build());
    }
}
