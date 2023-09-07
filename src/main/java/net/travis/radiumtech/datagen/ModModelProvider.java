package net.travis.radiumtech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.travis.radiumtech.block.ModBlocks;
import net.travis.radiumtech.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_URANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_ORE);

        blockStateModelGenerator.registerLog(ModBlocks.RED_MAPLE_LOG).log(ModBlocks.RED_MAPLE_LOG).wood(ModBlocks.RED_MAPLE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_RED_MAPLE_LOG).log(ModBlocks.STRIPPED_RED_MAPLE_LOG).wood(ModBlocks.STRIPPED_RED_MAPLE_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_MAPLE_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_MAPLE_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.RED_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.URANIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.URANIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.URANIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.URANIUM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SERIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SERIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SERIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SERIUM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.THORIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.THORIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.THORIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.THORIUM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NEPTUNIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NEPTUNIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NEPTUNIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NEPTUNIUM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ACTINIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ACTINIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ACTINIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ACTINIUM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RADIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RADIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RADIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RADIUM_BOOTS));

        itemModelGenerator.register(ModItems.URANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_URANIUM, Models.GENERATED);




    }

    }
