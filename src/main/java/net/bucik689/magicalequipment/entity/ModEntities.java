package net.bucik689.magicalequipment.entity;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.bucik689.magicalequipment.entity.Summons.AdamantiteGolem;
import net.bucik689.magicalequipment.entity.Summons.Spider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
            MagicalEquipment.MOD_ID);

    public static final RegistryObject<EntityType<AdamantiteGolem>> ADAMANTITE_GOLEM = ENTITIES.register(
            "adamantite_golem",
            () -> EntityType.Builder.of(AdamantiteGolem::new, MobCategory.CREATURE)
                    .sized(0.6f, 1.95f).clientTrackingRange(8).setShouldReceiveVelocityUpdates(false)
                    .build("adamantite_golem"));

    public static final RegistryObject<EntityType<Spider>> SPIDER = ENTITIES.register(
            "spider",
            () -> EntityType.Builder.of(Spider::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.8f).clientTrackingRange(8).setShouldReceiveVelocityUpdates(false)
                    .build("spider"));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
