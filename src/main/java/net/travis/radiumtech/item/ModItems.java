package net.travis.radiumtech.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
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

    public static final Item URANIUM_PICKAXE = registerItem("uranium_pickaxe",
            new PickaxeItem(ModToolMaterial.URANIUM, 2, 2f, new FabricItemSettings()));

    public static final Item URANIUM_AXE = registerItem("uranium_axe",
            new AxeItem(ModToolMaterial.URANIUM, 2, 2f, new FabricItemSettings()));

    public static final Item URANIUM_SHOVEL = registerItem("uranium_shovel",
            new ShovelItem(ModToolMaterial.URANIUM, 2, 2f, new FabricItemSettings()));

    public static final Item URANIUM_SWORD = registerItem("uranium_sword",
            new SwordItem(ModToolMaterial.URANIUM, 5, 3f, new FabricItemSettings()));

    public static final Item URANIUM_HOE = registerItem("uranium_hoe",
            new HoeItem(ModToolMaterial.URANIUM, 0, 0f, new FabricItemSettings()));

    public static final Item SERIUM_PICKAXE = registerItem("serium_pickaxe",
            new PickaxeItem(ModToolMaterial.SERIUM, 2, 2f, new FabricItemSettings()));

    public static final Item SERIUM_AXE = registerItem("serium_axe",
            new AxeItem(ModToolMaterial.SERIUM, 2, 2f, new FabricItemSettings()));

    public static final Item SERIUM_SHOVEL = registerItem("serium_shovel",
            new ShovelItem(ModToolMaterial.SERIUM, 2, 2f, new FabricItemSettings()));

    public static final Item SERIUM_SWORD = registerItem("serium_sword",
            new SwordItem(ModToolMaterial.SERIUM, 5, 3f, new FabricItemSettings()));

    public static final Item SERIUM_HOE = registerItem("serium_hoe",
            new HoeItem(ModToolMaterial.SERIUM, 0, 0f, new FabricItemSettings()));

    public static final Item THORIUM_PICKAXE = registerItem("thorium_pickaxe",
            new PickaxeItem(ModToolMaterial.THORIUM, 2, 2f, new FabricItemSettings()));

    public static final Item THORIUM_AXE = registerItem("thorium_axe",
            new AxeItem(ModToolMaterial.THORIUM, 2, 2f, new FabricItemSettings()));

    public static final Item THORIUM_SHOVEL = registerItem("thorium_shovel",
            new ShovelItem(ModToolMaterial.THORIUM, 2, 2f, new FabricItemSettings()));

    public static final Item THORIUM_SWORD = registerItem("thorium_sword",
            new SwordItem(ModToolMaterial.THORIUM, 5, 3f, new FabricItemSettings()));

    public static final Item THORIUM_HOE = registerItem("thorium_hoe",
            new HoeItem(ModToolMaterial.THORIUM, 0, 0f, new FabricItemSettings()));

    public static final Item ACTINIUM_PICKAXE = registerItem("actinium_pickaxe",
            new PickaxeItem(ModToolMaterial.THORIUM, 2, 2f, new FabricItemSettings()));

    public static final Item ACTINIUM_AXE = registerItem("actinium_axe",
            new AxeItem(ModToolMaterial.THORIUM, 2, 2f, new FabricItemSettings()));

    public static final Item ACTINIUM_SHOVEL = registerItem("actinium_shovel",
            new ShovelItem(ModToolMaterial.THORIUM, 2, 2f, new FabricItemSettings()));

    public static final Item ACTINIUM_SWORD = registerItem("actinium_sword",
            new SwordItem(ModToolMaterial.THORIUM, 5, 3f, new FabricItemSettings()));

    public static final Item ACTINIUM_HOE = registerItem("actinium_hoe",
            new HoeItem(ModToolMaterial.THORIUM, 0, 0f, new FabricItemSettings()));

    public static final Item RADIUM_PICKAXE = registerItem("radium_pickaxe",
            new PickaxeItem(ModToolMaterial.RADIUM, 2, 2f, new FabricItemSettings()));

    public static final Item RADIUM_AXE = registerItem("radium_axe",
            new AxeItem(ModToolMaterial.RADIUM, 2, 2f, new FabricItemSettings()));

    public static final Item RADIUM_SHOVEL = registerItem("radium_shovel",
            new ShovelItem(ModToolMaterial.RADIUM, 2, 2f, new FabricItemSettings()));

    public static final Item RADIUM_SWORD = registerItem("radium_sword",
            new SwordItem(ModToolMaterial.RADIUM, 5, 3f, new FabricItemSettings()));

    public static final Item RADIUM_HOE = registerItem("radium_hoe",
            new HoeItem(ModToolMaterial.RADIUM, 0, 0f, new FabricItemSettings()));

    public static final Item NEPTUNIUM_PICKAXE = registerItem("neptunium_pickaxe",
            new PickaxeItem(ModToolMaterial.NEPTUNIUM, 2, 2f, new FabricItemSettings()));

    public static final Item NEPTUNIUM_AXE = registerItem("neptunium_axe",
            new AxeItem(ModToolMaterial.NEPTUNIUM, 2, 2f, new FabricItemSettings()));

    public static final Item NEPTUNIUM_SHOVEL = registerItem("neptunium_shovel",
            new ShovelItem(ModToolMaterial.NEPTUNIUM, 2, 2f, new FabricItemSettings()));

    public static final Item NEPTUNIUM_SWORD = registerItem("neptunium_sword",
            new SwordItem(ModToolMaterial.NEPTUNIUM, 5, 3f, new FabricItemSettings()));

    public static final Item NEPTUNIUM_HOE = registerItem("neptunium_hoe",
            new HoeItem(ModToolMaterial.NEPTUNIUM, 0, 0f, new FabricItemSettings()));

    public static final Item URANIUM_HELMET = registerItem("uranium_helmet",
            new ArmorItem(ModArmorMaterials.URANIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item URANIUM_CHESTPLATE = registerItem("uranium_chestplate",
            new ArmorItem(ModArmorMaterials.URANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item URANIUM_LEGGINGS = registerItem("uranium_leggings",
            new ArmorItem(ModArmorMaterials.URANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item URANIUM_BOOTS = registerItem("uranium_boots",
            new ArmorItem(ModArmorMaterials.URANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item SERIUM_HELMET = registerItem("serium_helmet",
            new ArmorItem(ModArmorMaterials.SERIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SERIUM_CHESTPLATE = registerItem("serium_chestplate",
            new ArmorItem(ModArmorMaterials.SERIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SERIUM_LEGGINGS = registerItem("serium_leggings",
            new ArmorItem(ModArmorMaterials.SERIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SERIUM_BOOTS = registerItem("serium_boots",
            new ArmorItem(ModArmorMaterials.SERIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item THORIUM_HELMET = registerItem("thorium_helmet",
            new ArmorItem(ModArmorMaterials.THORIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item THORIUM_CHESTPLATE = registerItem("thorium_chestplate",
            new ArmorItem(ModArmorMaterials.THORIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item THORIUM_LEGGINGS = registerItem("thorium_leggings",
            new ArmorItem(ModArmorMaterials.THORIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item THORIUM_BOOTS = registerItem("thorium_boots",
            new ArmorItem(ModArmorMaterials.THORIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RadiumTech.MOD_ID, name), item);
    }


    public static void registerModItems() {
        RadiumTech.LOGGER.info("Registering Mod Items for " + RadiumTech.MOD_ID);
    }

}
