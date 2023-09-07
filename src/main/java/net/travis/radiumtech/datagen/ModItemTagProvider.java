package net.travis.radiumtech.datagen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.travis.radiumtech.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;


import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.URANIUM_HELMET, ModItems.URANIUM_CHESTPLATE, ModItems.URANIUM_LEGGINGS, ModItems.URANIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SERIUM_HELMET, ModItems.SERIUM_CHESTPLATE, ModItems.SERIUM_LEGGINGS, ModItems.SERIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.THORIUM_HELMET, ModItems.THORIUM_CHESTPLATE, ModItems.THORIUM_LEGGINGS, ModItems.THORIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.NEPTUNIUM_HELMET, ModItems.NEPTUNIUM_CHESTPLATE, ModItems.NEPTUNIUM_LEGGINGS, ModItems.NEPTUNIUM_BOOTS);



        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ACTINIUM_HELMET, ModItems.ACTINIUM_CHESTPLATE, ModItems.ACTINIUM_LEGGINGS, ModItems.ACTINIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RADIUM_HELMET, ModItems.RADIUM_CHESTPLATE, ModItems.RADIUM_LEGGINGS, ModItems.RADIUM_BOOTS);
    }
}
