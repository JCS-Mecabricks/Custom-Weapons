package github.jcsmecabricks.customweapons.data.provider;

import github.jcsmecabricks.customweapons.CustomWeapons;
import github.jcsmecabricks.customweapons.init.BlockInit;
import github.jcsmecabricks.customweapons.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class CustomWeaponsBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public CustomWeaponsBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockInit.DEEPSLATE_SILVER_ORE)
                .add(BlockInit.BLOCK_OF_SILVER)
                .add(BlockInit.SILVER_ORE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(BlockInit.DEEPSLATE_SILVER_ORE)
                .add(BlockInit.BLOCK_OF_SILVER)
                .add(BlockInit.SILVER_ORE);

        getOrCreateTagBuilder(TagList.Blocks.CUSTOMWEAPONS_TAG)
                .add(BlockInit.DEEPSLATE_SILVER_ORE)
                .add(BlockInit.BLOCK_OF_SILVER)
                .add(BlockInit.SILVER_ORE);

        getOrCreateTagBuilder(TagList.Blocks.INCORRECT_FOR_CUSTOMWEAPONS_TOOL);

    }
}
