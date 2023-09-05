package net.travis.radiumtech.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.travis.radiumtech.block.ModBlocks;
import net.travis.radiumtech.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_URANIUM), RecipeCategory.MISC, ModItems.URANIUM,
                0.7f, 200, "uranium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.URANIUM, RecipeCategory.DECORATIONS,
                ModBlocks.URANIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_URANIUM)
                .pattern("SSS")
                .pattern("SCS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('C', ModItems.URANIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STONE),
                        FabricRecipeProvider.conditionsFromItem(Items.STONE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.URANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.URANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAW_URANIUM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.URANIUM_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.URANIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.URANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.URANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.URANIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.URANIUM_AXE)
                .pattern(" CC")
                .pattern(" SC")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.URANIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.URANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.URANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.URANIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.URANIUM_SHOVEL)
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.URANIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.URANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.URANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.URANIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.URANIUM_SWORD)
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.URANIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.URANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.URANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.URANIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.URANIUM_HOE)
                .pattern(" CC")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.URANIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.URANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.URANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.URANIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SERIUM_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.SERIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.SERIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.SERIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.SERIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SERIUM_AXE)
                .pattern(" CC")
                .pattern(" SC")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.SERIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.SERIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.SERIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.SERIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SERIUM_SHOVEL)
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.SERIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.SERIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.SERIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.SERIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SERIUM_SWORD)
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.SERIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.SERIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.SERIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.SERIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SERIUM_HOE)
                .pattern(" CC")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.SERIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.SERIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.SERIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.SERIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THORIUM_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.THORIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.THORIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THORIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THORIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THORIUM_AXE)
                .pattern(" CC")
                .pattern(" SC")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.THORIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.THORIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THORIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THORIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THORIUM_SHOVEL)
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.THORIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.THORIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THORIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THORIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THORIUM_SWORD)
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.THORIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.THORIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THORIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THORIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THORIUM_HOE)
                .pattern(" CC")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.THORIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.THORIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THORIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THORIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ACTINIUM_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.ACTINIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ACTINIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ACTINIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ACTINIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ACTINIUM_AXE)
                .pattern(" CC")
                .pattern(" SC")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.ACTINIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ACTINIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ACTINIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ACTINIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ACTINIUM_SHOVEL)
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.ACTINIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ACTINIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ACTINIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ACTINIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ACTINIUM_SWORD)
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.ACTINIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ACTINIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ACTINIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ACTINIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ACTINIUM_HOE)
                .pattern(" CC")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.ACTINIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ACTINIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ACTINIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ACTINIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIUM_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.RADIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RADIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RADIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RADIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIUM_AXE)
                .pattern(" CC")
                .pattern(" SC")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.RADIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RADIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RADIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RADIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIUM_SHOVEL)
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.RADIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RADIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RADIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RADIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIUM_SWORD)
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.RADIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RADIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RADIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RADIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIUM_HOE)
                .pattern(" CC")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.RADIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RADIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RADIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RADIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEPTUNIUM_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.NEPTUNIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.NEPTUNIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.NEPTUNIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.NEPTUNIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEPTUNIUM_AXE)
                .pattern(" CC")
                .pattern(" SC")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.NEPTUNIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.NEPTUNIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.NEPTUNIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.NEPTUNIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEPTUNIUM_SHOVEL)
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.NEPTUNIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.NEPTUNIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.NEPTUNIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.NEPTUNIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEPTUNIUM_SWORD)
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.NEPTUNIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.NEPTUNIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.NEPTUNIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.NEPTUNIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEPTUNIUM_HOE)
                .pattern(" CC")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.NEPTUNIUM)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.NEPTUNIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.NEPTUNIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.NEPTUNIUM_HOE)));
    }
}
