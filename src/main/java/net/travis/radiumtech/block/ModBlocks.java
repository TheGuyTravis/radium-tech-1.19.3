package net.travis.radiumtech.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.travis.radiumtech.RadiumTech;
import net.travis.radiumtech.world.tree.RedMapleSaplingGenerator;

public class ModBlocks {

    public static final Block URANIUM_ORE = registerBlock("uranium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block URANIUM_BLOCK = registerBlock("uranium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block SERIUM_BLOCK = registerBlock("serium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block DEEPSLATE_SERIUM_ORE = registerBlock("deepslate_serium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block SERIUM_ORE = registerBlock("serium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block THORIUM_BLOCK = registerBlock("thorium_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block THORIUM_ORE = registerBlock("thorium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block DEEPSLATE_THORIUM_ORE = registerBlock("deepslate_thorium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block RADIUM_ORE = registerBlock("radium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block RADIUM_BLOCK = registerBlock("radium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block DEEPSLATE_RADIUM_ORE = registerBlock("deepslate_radium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block ACTINIUM_BLOCK = registerBlock("actinium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block ACTINIUM_ORE = registerBlock("actinium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block DEEPSLATE_ACTINIUM_ORE = registerBlock("deepslate_actinium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block DEEPSLATE_NEPTUNIUM_ORE = registerBlock("deepslate_neptunium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block NEPTUNIUM_ORE = registerBlock("neptunium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block NEPTUNIUM_BLOCK = registerBlock("neptunium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block PLUTONIUM_BLOCK = registerBlock("plutonium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block POLONIUM_BLOCK = registerBlock("polonium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block POLONIUM_ORE = registerBlock("polonium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block DEEPSLATE_POLONIUM_ORE = registerBlock("deepslate_polonium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 6)));

    public static final Block POTASSIUM_BLOCK = registerBlock("potassium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block RED_MAPLE_LOG = registerBlock("red_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()));
    public static final Block RED_MAPLE_WOOD = registerBlock("red_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f).requiresTool()));
    public static final Block STRIPPED_RED_MAPLE_LOG = registerBlock("stripped_red_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()));
    public static final Block STRIPPED_RED_MAPLE_WOOD = registerBlock("stripped_red_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()));

    public static final Block RED_MAPLE_PLANKS = registerBlock("red_maple_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()));
    public static final Block RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()));

    public static final Block RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",
            new SaplingBlock(new RedMapleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RadiumTech.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(RadiumTech.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }


    public static void registerModBlocks() {
        RadiumTech.LOGGER.info("Registering ModBlocks for " + RadiumTech.MOD_ID);
    }
}
