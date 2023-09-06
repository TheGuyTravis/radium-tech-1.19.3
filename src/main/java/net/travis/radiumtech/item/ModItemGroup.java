package net.travis.radiumtech.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.travis.radiumtech.RadiumTech;
import net.travis.radiumtech.block.ModBlocks;

public class ModItemGroup {

    public static ItemGroup URANIUM = Registry.register(Registries.ITEM_GROUP, new Identifier(RadiumTech.MOD_ID, "uranium"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.uranium"))
                    .icon(() -> new ItemStack(ModItems.URANIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.URANIUM);
                        entries.add(ModItems.RAW_URANIUM);
                        entries.add(ModItems.URANIUM_NUGGET);
                        entries.add(ModItems.SERIUM);
                        entries.add(ModItems.SERIUM_DUST);
                        entries.add(ModItems.THORIUM);
                        entries.add(ModItems.THORIUM_NUGGET);
                        entries.add(ModItems.RAW_THORIUM);
                        entries.add(ModItems.RADIUM);
                        entries.add(ModItems.RADIUM_DUST);
                        entries.add(ModItems.ACTINIUM);
                        entries.add(ModItems.RAW_ACTINIUM);
                        entries.add(ModItems.ACTINIUM_NUGGET);
                        entries.add(ModItems.POLONIUM);
                        entries.add(ModItems.POLONIUM_NUGGET);
                        entries.add(ModItems.PLUTONIUM);
                        entries.add(ModItems.PLUTONIUM_NUGGET);
                        entries.add(ModItems.NEPTUNIUM);
                        entries.add(ModItems.RAW_NEPTUNIUM);
                        entries.add(ModItems.NEPTUNIUM_NUGGET);
                        entries.add(ModItems.POTASSIUM);
                        entries.add(ModItems.U235);
                        entries.add(ModItems.URANIUM_PICKAXE);
                        entries.add(ModItems.URANIUM_AXE);
                        entries.add(ModItems.URANIUM_SHOVEL);
                        entries.add(ModItems.URANIUM_SWORD);
                        entries.add(ModItems.URANIUM_HOE);
                        entries.add(ModItems.SERIUM_PICKAXE);
                        entries.add(ModItems.SERIUM_AXE);
                        entries.add(ModItems.SERIUM_SHOVEL);
                        entries.add(ModItems.SERIUM_SWORD);
                        entries.add(ModItems.SERIUM_HOE);
                        entries.add(ModItems.THORIUM_PICKAXE);
                        entries.add(ModItems.THORIUM_AXE);
                        entries.add(ModItems.THORIUM_SHOVEL);
                        entries.add(ModItems.THORIUM_SWORD);
                        entries.add(ModItems.THORIUM_HOE);

                        entries.add(ModItems.URANIUM_HELMET);
                        entries.add(ModItems.URANIUM_CHESTPLATE);
                        entries.add(ModItems.URANIUM_LEGGINGS);
                        entries.add(ModItems.URANIUM_BOOTS);

                        entries.add(ModItems.ACTINIUM_PICKAXE);
                        entries.add(ModItems.ACTINIUM_AXE);
                        entries.add(ModItems.ACTINIUM_SHOVEL);
                        entries.add(ModItems.ACTINIUM_SWORD);
                        entries.add(ModItems.ACTINIUM_HOE);

                        entries.add(ModItems.RADIUM_PICKAXE);
                        entries.add(ModItems.RADIUM_AXE);
                        entries.add(ModItems.RADIUM_SHOVEL);
                        entries.add(ModItems.RADIUM_SWORD);
                        entries.add(ModItems.RADIUM_HOE);

                        entries.add(ModItems.NEPTUNIUM_PICKAXE);
                        entries.add(ModItems.NEPTUNIUM_AXE);
                        entries.add(ModItems.NEPTUNIUM_SHOVEL);
                        entries.add(ModItems.NEPTUNIUM_SWORD);
                        entries.add(ModItems.NEPTUNIUM_HOE);

                        entries.add(ModBlocks.URANIUM_ORE);
                        entries.add(ModBlocks.URANIUM_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_URANIUM_ORE);
                        entries.add(ModBlocks.SERIUM_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_SERIUM_ORE);
                        entries.add(ModBlocks.SERIUM_ORE);
                        entries.add(ModBlocks.THORIUM_BLOCK);
                        entries.add(ModBlocks.THORIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_THORIUM_ORE);
                        entries.add(ModBlocks.RADIUM_ORE);
                        entries.add(ModBlocks.RADIUM_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_RADIUM_ORE);
                        entries.add(ModBlocks.ACTINIUM_BLOCK);
                        entries.add(ModBlocks.ACTINIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ACTINIUM_ORE);
                        entries.add(ModBlocks.NEPTUNIUM_ORE);
                        entries.add(ModBlocks.NEPTUNIUM_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_NEPTUNIUM_ORE);
                        entries.add(ModBlocks.PLUTONIUM_BLOCK);
                        entries.add(ModBlocks.POLONIUM_BLOCK);
                        entries.add(ModBlocks.POLONIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_POLONIUM_ORE);
                        entries.add(ModBlocks.POTASSIUM_BLOCK);
                        entries.add(ModBlocks.RED_MAPLE_LOG);
                        entries.add(ModBlocks.RED_MAPLE_WOOD);
                        entries.add(ModBlocks.STRIPPED_RED_MAPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_RED_MAPLE_WOOD);
                        entries.add(ModBlocks.RED_MAPLE_PLANKS);
                        entries.add(ModBlocks.RED_MAPLE_SAPLING);
                    }).build());

    public static void registerItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.URANIUM);
            entries.add(ModItems.RAW_URANIUM);
        });
    }


}
