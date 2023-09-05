package net.travis.radiumtech.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.travis.radiumtech.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {





    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.URANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.URANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.URANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.URANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.URANIUM_HOE, Models.HANDHELD);

    }
}
