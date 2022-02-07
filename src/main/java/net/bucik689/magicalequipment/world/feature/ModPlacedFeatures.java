package net.bucik689.magicalequipment.world.feature;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {

        public static final PlacedFeature MYTHRIL_ORE_PLACED = PlacementUtils.register("mythril_ore_placed",
                        ModConfiguredFeature.MYTHRIL_ORE.placed(ModOrePlacement.commonOrePlacement(7,
                                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                                                        VerticalAnchor.aboveBottom(80)))));

        public static final PlacedFeature ADAMANTITE_ORE_PLACED = PlacementUtils.register("adamantite_ore_placed",
                        ModConfiguredFeature.ADAMANTITE_ORE.placed(ModOrePlacement.commonOrePlacement(7,
                                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                                                        VerticalAnchor.aboveBottom(80)))));

}