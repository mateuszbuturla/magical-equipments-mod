package net.bucik689.magicalequipment.client.entity.model;

import net.bucik689.magicalequipment.MagicalEquipment;
import net.bucik689.magicalequipment.entity.Summons.AdamantiteGolem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class AdamantiteGolemModel extends AnimatedTickingGeoModel<AdamantiteGolem> {

    @Override
    public ResourceLocation getAnimationFileLocation(AdamantiteGolem entity) {
        return new ResourceLocation(MagicalEquipment.MOD_ID,
                "animations/adamantite_golem.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(AdamantiteGolem entity) {
        return new ResourceLocation(MagicalEquipment.MOD_ID,
                "geo/adamantite_golem.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AdamantiteGolem entity) {
        return new ResourceLocation(MagicalEquipment.MOD_ID,
                "textures/entity/adamantite_golem.png");
    }
}
