package net.bucik689.magicalequipment.setup;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.bucik689.magicalequipment.client.entity.renderer.AdamantiteGolemRenderer;
import net.bucik689.magicalequipment.client.entity.renderer.SpiderRenderer;
import net.bucik689.magicalequipment.entity.ModEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import software.bernie.example.GeckoLibMod;

@Mod.EventBusSubscriber(modid = MagicalEquipment.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        if (!FMLEnvironment.production && !GeckoLibMod.DISABLE_IN_DEV) {
            event.registerEntityRenderer(ModEntities.ADAMANTITE_GOLEM.get(), AdamantiteGolemRenderer::new);
            event.registerEntityRenderer(ModEntities.SPIDER.get(), SpiderRenderer::new);
        }
    }

    // @SubscribeEvent
    // public static void
    // onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
    // event.registerLayerDefinition(AdamantiteGolemModel.LAYER_LOCATION,
    // AdamantiteGolemModel::createBodyLayer);
    // }

    // @SubscribeEvent
    // public static void registerRenderetrs(EntityRenderersEvent.RegisterRenderers
    // event) {
    // event.registerEntityRenderer(ModEntities.ADAMANTITE_GOLEM.get(),
    // AdamantiteGolemRenderer::new);
    // }
}
