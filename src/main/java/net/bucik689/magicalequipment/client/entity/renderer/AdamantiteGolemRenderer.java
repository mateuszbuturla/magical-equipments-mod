package net.bucik689.magicalequipment.client.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.bucik689.magicalequipment.client.entity.model.AdamantiteGolemModel;
import net.bucik689.magicalequipment.entity.Summons.AdamantiteGolem;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AdamantiteGolemRenderer extends GeoEntityRenderer<AdamantiteGolem> {

    public AdamantiteGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new AdamantiteGolemModel());
    }

    @Override
    public RenderType getRenderType(AdamantiteGolem golem, float partialTicks, PoseStack stack,
            MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
            ResourceLocation textureLocation) {
        return RenderType.entityTranslucent(getTextureLocation(golem));
    }
}
