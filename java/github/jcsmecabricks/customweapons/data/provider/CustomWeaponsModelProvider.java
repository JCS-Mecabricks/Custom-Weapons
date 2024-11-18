package github.jcsmecabricks.customweapons.data.provider;

import github.jcsmecabricks.customweapons.init.BlockInit;
import github.jcsmecabricks.customweapons.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class CustomWeaponsModelProvider extends FabricModelProvider {
    public CustomWeaponsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DEEPSLATE_SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.BLOCK_OF_SILVER);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.SICKLE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.SICKLES, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.SILVER, Models.GENERATED);
        itemModelGenerator.register(ItemInit.SPARTAN_HELM, Models.GENERATED);
        itemModelGenerator.register(ItemInit.SPARTAN_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.MEDIEVAL_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.MEDIEVAL_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.SCYTHE, Models.HANDHELD);

    }
}
