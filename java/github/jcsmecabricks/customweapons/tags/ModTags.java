package github.jcsmecabricks.customweapons.tags;

import github.jcsmecabricks.customweapons.CustomWeapons;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");
        public static final TagKey<Item> SILVER_REPAIR = createTag("silver_repair");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(CustomWeapons.MOD_ID, name));
        }
    }
}
