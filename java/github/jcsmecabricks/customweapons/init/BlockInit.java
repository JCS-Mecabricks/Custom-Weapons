package github.jcsmecabricks.customweapons.init;

import github.jcsmecabricks.customweapons.CustomWeapons;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class BlockInit {
    public static final Block SILVER_ORE = registerWithItem("silver_ore", new Block(AbstractBlock.Settings.create()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomWeapons.MOD_ID, "silver_ore")))
            .strength(3.0F, 3.0F)
            .requiresTool()));
    public static final Block DEEPSLATE_SILVER_ORE = registerWithItem("deepslate_silver_ore", new Block(AbstractBlock.Settings.create()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomWeapons.MOD_ID, "deepslate_silver_ore")))
            .strength(4.5F, 3.0F)
            .requiresTool()));
    public static final Block BLOCK_OF_SILVER = registerWithItem("block_of_silver", new Block(AbstractBlock.Settings.create()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomWeapons.MOD_ID, "block_of_silver")))
            .strength(7.0F, 4.0F)
            .requiresTool()));

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, CustomWeapons.id(name), block);
    }
    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }
    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomWeapons.MOD_ID, name))));
    }
    public static void load() {}
}
