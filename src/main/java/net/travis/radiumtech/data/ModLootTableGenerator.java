package net.travis.radiumtech.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.travis.radiumtech.block.ModBlocks;
import net.travis.radiumtech.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.URANIUM_BLOCK);
        oreDrops(ModBlocks.URANIUM_ORE, ModItems.RAW_URANIUM);
        oreDrops(ModBlocks.DEEPSLATE_URANIUM_ORE, ModItems.RAW_URANIUM);
    }
}
