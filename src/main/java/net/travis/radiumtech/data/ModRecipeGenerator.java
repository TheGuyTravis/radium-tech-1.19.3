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
    }
}
