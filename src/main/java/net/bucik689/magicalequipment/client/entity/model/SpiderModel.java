package net.bucik689.magicalequipment.client.entity.model;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.bucik689.magicalequipment.entity.Summons.Spider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class SpiderModel extends AnimatedTickingGeoModel<Spider> {

    @Override
    public ResourceLocation getAnimationFileLocation(Spider entity) {
        return new ResourceLocation(MagicalEquipment.MOD_ID,
                "animations/spider.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(Spider entity) {
        return new ResourceLocation(MagicalEquipment.MOD_ID,
                "geo/spider.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Spider entity) {
        return new ResourceLocation(MagicalEquipment.MOD_ID,
                "textures/entity/spider.png");
    }
}
