package net.bucik689.magicalequipment.client.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.bucik689.magicalequipment.client.entity.model.SpiderModel;
import net.bucik689.magicalequipment.entity.Summons.Spider;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SpiderRenderer extends GeoEntityRenderer<Spider> {

    public SpiderRenderer(EntityRendererProvider.Context context) {
        super(context, new SpiderModel());
    }

    @Override
    public RenderType getRenderType(Spider spider, float partialTicks, PoseStack stack,
            MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
            ResourceLocation textureLocation) {
        return RenderType.entityTranslucent(getTextureLocation(spider));
    }
}
