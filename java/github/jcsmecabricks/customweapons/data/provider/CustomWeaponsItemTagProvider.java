package github.jcsmecabricks.customweapons.data.provider;

import github.jcsmecabricks.customweapons.init.ItemInit;
import github.jcsmecabricks.customweapons.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class CustomWeaponsItemTagProvider extends FabricTagProvider<Item> {
    public CustomWeaponsItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ItemInit.SPEAR)
                .add(ItemInit.SCYTHE)
                .add(ItemInit.SICKLES);


        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ItemInit.SPARTAN_HELM);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ItemInit.SPARTAN_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ItemInit.MEDIEVAL_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ItemInit.MEDIEVAL_BOOTS);

        getOrCreateTagBuilder(ModTags.Items.SILVER_REPAIR)
                .add(ItemInit.SILVER);

    }
}
