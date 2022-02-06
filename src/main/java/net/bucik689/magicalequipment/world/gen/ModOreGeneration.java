package net.bucik689.magicalequipment.world.gen;

import net.bucik689.magicalequipment.world.feature.ModPlacedFeatures;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.function.Supplier;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Supplier<PlacedFeature>> base = event.getGeneration()
                .getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(() -> ModPlacedFeatures.MYTHRIL_ORE_PLACED);
        base.add(() -> ModPlacedFeatures.ADAMANTITE_ORE_PLACED);
    }
}