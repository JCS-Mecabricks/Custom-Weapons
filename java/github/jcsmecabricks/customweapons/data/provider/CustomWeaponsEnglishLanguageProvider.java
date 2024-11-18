package github.jcsmecabricks.customweapons.data.provider;


import github.jcsmecabricks.customweapons.CustomWeapons;
import github.jcsmecabricks.customweapons.init.BlockInit;
import github.jcsmecabricks.customweapons.init.EnchantmentInit;
import github.jcsmecabricks.customweapons.init.ItemGroupInit;
import github.jcsmecabricks.customweapons.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class CustomWeaponsEnglishLanguageProvider extends FabricLanguageProvider {
    public CustomWeaponsEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            CustomWeapons.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ItemInit.SICKLE, "Sickle");
        translationBuilder.add(ItemInit.SILVER, "Silver");
        translationBuilder.add(ItemInit.SPEAR, "Spear");
        translationBuilder.add(ItemInit.SCYTHE, "Scythe");
        translationBuilder.add(BlockInit.SILVER_ORE, "Silver Ore");
        translationBuilder.add(BlockInit.BLOCK_OF_SILVER, "Block of Silver");
        translationBuilder.add(BlockInit.DEEPSLATE_SILVER_ORE, "Deepslate Silver Ore");
        translationBuilder.add(ItemInit.MEDIEVAL_LEGGINGS, "Medieval Leggings");
        translationBuilder.add(ItemInit.MEDIEVAL_BOOTS, "Medieval Boots");
        translationBuilder.add(ItemInit.SPARTAN_HELM, "Spartan Helm");
        translationBuilder.add(ItemInit.SPARTAN_CHESTPLATE, "Spartan Chestplate");
        translationBuilder.add(ItemInit.SICKLES, "Sickles");
        addText(translationBuilder, ItemGroupInit.CUSTOMWEAPONS_TITLE, "Custom Weapons");

        translationBuilder.addEnchantment(EnchantmentInit.BOLTING_ENCHANTMENT_KEY, "Bolting");

    }
}

