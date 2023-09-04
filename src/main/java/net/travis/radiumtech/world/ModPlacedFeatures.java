package net.travis.radiumtech.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.travis.radiumtech.RadiumTech;
import net.travis.radiumtech.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> RED_MAPLE_PLACED_KEY = registerKey("red_maple_placed");
    public static final RegistryKey<PlacedFeature> URANIUM_ORE_PLACED_KEY = registerKey("uranium_ore_placed");
    public static final RegistryKey<PlacedFeature> THORIUM_ORE_PLACED_KEY = registerKey("thorium_ore_placed");
    public static final RegistryKey<PlacedFeature> SERIUM_ORE_PLACED_KEY = registerKey("serium_ore_placed");
    public static final RegistryKey<PlacedFeature> RADIUM_ORE_PLACED_KEY = registerKey("radium_ore_placed");
    public static final RegistryKey<PlacedFeature> ACTINIUM_ORE_PLACED_KEY = registerKey("actinium_ore_placed");
    public static final RegistryKey<PlacedFeature> NEPTUNIUM_ORE_PLACED_KEY = registerKey("neptunium_ore_placed");
    public static final RegistryKey<PlacedFeature> POLONIUM_ORE_PLACED_KEY = registerKey("polonium_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, RED_MAPLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_MAPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), ModBlocks.RED_MAPLE_SAPLING));

        register(context, URANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.URANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

        register(context, THORIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.THORIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(7, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

        register(context, SERIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SERIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

        register(context, RADIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RADIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(9, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

        register(context, ACTINIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ACTINIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

        register(context, NEPTUNIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NEPTUNIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

        register(context, POLONIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.POLONIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(9, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
    }
    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(RadiumTech.MOD_ID, name));
    }


    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}

