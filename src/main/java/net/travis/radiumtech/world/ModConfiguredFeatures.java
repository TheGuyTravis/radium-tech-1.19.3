package net.travis.radiumtech.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.travis.radiumtech.RadiumTech;
import net.travis.radiumtech.block.ModBlocks;

import java.util.List;


public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_MAPLE_KEY = registerKey("red_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> URANIUM_ORE_KEY = registerKey("uranium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> THORIUM_ORE_KEY = registerKey("thorium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SERIUM_ORE_KEY = registerKey("serium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RADIUM_ORE_KEY = registerKey("radium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACTINIUM_ORE_KEY = registerKey("actinium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NEPTUNIUM_ORE_KEY = registerKey("neptunium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POLONIUM_ORE_KEY = registerKey("polonium_ore");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {


        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldUraniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.URANIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_URANIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldThoriumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.THORIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_THORIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSeriumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SERIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_SERIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldRadiumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RADIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_RADIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldActiniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ACTINIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_ACTINIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldNeptuniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.NEPTUNIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_NEPTUNIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldPoloniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.POLONIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_POLONIUM_ORE.getDefaultState()));

        register(context, RED_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.RED_MAPLE_LOG),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(ModBlocks.RED_MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, URANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldUraniumOres, 12));
        register(context, THORIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldThoriumOres, 7));
        register(context, SERIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSeriumOres, 9));
        register(context, RADIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRadiumOres, 9));
        register(context, ACTINIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldActiniumOres, 9));
        register(context, NEPTUNIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldNeptuniumOres, 9));
        register(context, POLONIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPoloniumOres, 9));


    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(RadiumTech.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));


    }
}


