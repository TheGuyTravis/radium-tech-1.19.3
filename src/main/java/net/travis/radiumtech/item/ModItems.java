package net.travis.radiumtech.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.travis.radiumtech.RadiumTech;

public class ModItems {

    public static final Item URANIUM = registerItem("uranium",
            new Item(new FabricItemSettings()));

    public static final Item RAW_URANIUM = registerItem("raw_uranium",
            new Item(new FabricItemSettings()));

    public static final Item URANIUM_NUGGET = registerItem("uranium_nugget",
            new Item(new FabricItemSettings()));

    public static final Item SERIUM = registerItem("serium",
            new Item(new FabricItemSettings()));

    public static final Item SERIUM_DUST = registerItem("serium_dust",
            new Item(new FabricItemSettings()));

    public static final Item THORIUM = registerItem("thorium",
            new Item(new FabricItemSettings()));

    public static final Item THORIUM_NUGGET = registerItem("thorium_nugget",
            new Item(new FabricItemSettings()));

    public static final Item RAW_THORIUM = registerItem("raw_thorium",
            new Item(new FabricItemSettings()));

    public static final Item RADIUM = registerItem("radium",
            new Item(new FabricItemSettings()));

    public static final Item RADIUM_DUST = registerItem("radium_dust",
            new Item(new FabricItemSettings()));

    public static final Item ACTINIUM = registerItem("actinium",
            new Item(new FabricItemSettings()));

    public static final Item RAW_ACTINIUM = registerItem("raw_actinium",
            new Item(new FabricItemSettings()));

    public static final Item ACTINIUM_NUGGET = registerItem("actinium_nugget",
            new Item(new FabricItemSettings()));

    public static final Item POLONIUM = registerItem("polonium",
            new Item(new FabricItemSettings()));

    public static final Item POLONIUM_NUGGET = registerItem("polonium_nugget",
            new Item(new FabricItemSettings()));

    public static final Item PLUTONIUM = registerItem("plutonium",
            new Item(new FabricItemSettings()));

    public static final Item PLUTONIUM_NUGGET = registerItem("plutonium_nugget",
            new Item(new FabricItemSettings()));

    public static final Item NEPTUNIUM = registerItem("neptunium",
            new Item(new FabricItemSettings()));

    public static final Item NEPTUNIUM_NUGGET = registerItem("neptunium_nugget",
            new Item(new FabricItemSettings()));

    public static final Item RAW_NEPTUNIUM = registerItem("raw_neptunium",
            new Item(new FabricItemSettings()));

    public static final Item POTASSIUM = registerItem("potassium",
            new Item(new FabricItemSettings()));

    public static final Item U235 = registerItem("u235",
            new Item(new FabricItemSettings()));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RadiumTech.MOD_ID, name), item);
    }


    public static void registerModItems() {
        RadiumTech.LOGGER.info("Registering Mod Items for " + RadiumTech.MOD_ID);
    }

}
