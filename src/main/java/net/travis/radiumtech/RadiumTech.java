package net.travis.radiumtech;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.travis.radiumtech.block.ModBlocks;
import net.travis.radiumtech.block.ModFlammableBlockRegistry;
import net.travis.radiumtech.item.ModItemGroup;
import net.travis.radiumtech.item.ModItems;
import net.travis.radiumtech.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RadiumTech implements ModInitializer {

	public static final String MOD_ID = "radiumtech";
    public static final Logger LOGGER = LoggerFactory.getLogger("radiumtech");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();

		ModFlammableBlockRegistry.registerFlammableBlocks();
		StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_LOG, ModBlocks.STRIPPED_RED_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_WOOD, ModBlocks.STRIPPED_RED_MAPLE_WOOD);

		FuelRegistry.INSTANCE.add(ModItems.U235, 20000);

	}
}