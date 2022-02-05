package net.bucik689.magicalequipment.world.feature;

import net.bucik689.magicalequipment.block.ModBlock;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;

import java.util.List;

public class ModConfiguredFeature {

        public static final List<OreConfiguration.TargetBlockState> OVERWORLD_MYTHRIL_ORES = List.of(
                        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                                        ModBlock.MYTHRIL_ORE.get().defaultBlockState()),
                        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                                        ModBlock.MYTHRIL_ORE.get().defaultBlockState()));

        public static final ConfiguredFeature<?, ?> MYTHRIL_ORE = FeatureUtils.register("mythril_ore",
                        Feature.ORE.configured(new OreConfiguration(OVERWORLD_MYTHRIL_ORES, 4)));

}