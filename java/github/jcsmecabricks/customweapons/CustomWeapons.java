package github.jcsmecabricks.customweapons;

import github.jcsmecabricks.customweapons.init.*;
import github.jcsmecabricks.customweapons.materials.ModArmorMaterials;
import github.jcsmecabricks.customweapons.worldgen.BiomeModificationInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomWeapons implements ModInitializer {
	public static final String MOD_ID = "custom-weapons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading...");
		ItemInit.load();
		BlockInit.load();
		ItemGroupInit.load();
		BiomeModificationInit.load();
		EnchantmentInit.load();
		ModArmorMaterials.load();
		registerCustomTrades();

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
			entries.addAfter(Items.MACE, ItemInit.SILVER_HAMMER);
			entries.addAfter(ItemInit.SILVER_HAMMER, ItemInit.SICKLE);
			entries.addAfter(ItemInit.SICKLE, ItemInit.SICKLES);
			entries.addAfter(ItemInit.SICKLES, ItemInit.SPEAR);
			entries.addAfter(Items.GOLDEN_BOOTS, ItemInit.SPARTAN_HELM);
			entries.addAfter(ItemInit.SPARTAN_HELM, ItemInit.SPARTAN_CHESTPLATE);
			entries.addAfter(ItemInit.SPARTAN_CHESTPLATE, ItemInit.MEDIEVAL_LEGGINGS);
			entries.addAfter(ItemInit.MEDIEVAL_LEGGINGS, ItemInit.MEDIEVAL_BOOTS);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addAfter(Items.IRON_INGOT, ItemInit.SILVER);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.addAfter(Items.REDSTONE_ORE, BlockInit.SILVER_ORE);
			entries.addAfter(BlockInit.SILVER_ORE, BlockInit.DEEPSLATE_SILVER_ORE);
			entries.addAfter(BlockInit.DEEPSLATE_SILVER_ORE, Blocks.REDSTONE_BLOCK);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.addAfter(Items.REDSTONE_ORE, BlockInit.SILVER_ORE);
			entries.addAfter(BlockInit.SILVER_ORE, BlockInit.DEEPSLATE_SILVER_ORE);
			entries.addAfter(BlockInit.DEEPSLATE_SILVER_ORE, Blocks.REDSTONE_BLOCK);
		});


	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}

	private static void registerCustomTrades() {
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 1),
					new ItemStack(ItemInit.SILVER, 1), 20, 3, 0.04f
			));
		});
	}
}