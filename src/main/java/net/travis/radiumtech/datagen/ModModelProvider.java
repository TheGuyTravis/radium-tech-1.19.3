package net.travis.radiumtech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.item.ArmorItem;
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

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.URANIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.URANIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.URANIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.URANIUM_BOOTS));

    }
}
