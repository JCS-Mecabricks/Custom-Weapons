package github.jcsmecabricks.customweapons.init;

import github.jcsmecabricks.customweapons.CustomWeapons;
import github.jcsmecabricks.customweapons.materials.CustomWeaponsToolMaterials;
import github.jcsmecabricks.customweapons.materials.ModArmorMaterials;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ItemInit {
    public static final Item SILVER = register("silver", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomWeapons.MOD_ID, "silver")))));  // Corrected here

    public static final Item SICKLE = register("sickle", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomWeapons.MOD_ID, "sickle")))));

    public static final ArmorItem SPARTAN_HELM = register("spartan_helm",
            new ArmorItem(ModArmorMaterials.CUSTOMWEAPONS, EquipmentType.HELMET, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomWeapons.MOD_ID, "spartan_helm")))));

    public static final ArmorItem SPARTAN_CHESTPLATE = register("spartan_chestplate",
            new ArmorItem(ModArmorMaterials.CUSTOMWEAPONS, EquipmentType.CHESTPLATE, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomWeapons.MOD_ID, "spartan_chestplate")))));

    public static final ArmorItem MEDIEVAL_LEGGINGS = register("medieval_leggings",
            new ArmorItem(ModArmorMaterials.CUSTOMWEAPONS, EquipmentType.LEGGINGS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomWeapons.MOD_ID, "medieval_leggings")))));

    public static final ArmorItem MEDIEVAL_BOOTS = register("medieval_boots",
            new ArmorItem(ModArmorMaterials.CUSTOMWEAPONS, EquipmentType.BOOTS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomWeapons.MOD_ID, "medieval_boots")))));

    public static final SwordItem SICKLES = register("sickles",
            new SwordItem(CustomWeaponsToolMaterials.CUSTOMWEAPONS, 8, -2f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomWeapons.MOD_ID, "sickles")))));

    public static final SwordItem SCYTHE = register("scythe",
            new SwordItem(CustomWeaponsToolMaterials.CUSTOMWEAPONS2, 10, -2.5f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomWeapons.MOD_ID, "scythe")))));

    public static final SwordItem SPEAR = register("spear",
            new SwordItem(CustomWeaponsToolMaterials.CUSTOMWEAPONS, 6, -2f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomWeapons.MOD_ID, "spear")))));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, CustomWeapons.id(name), item);
    }

    public static void load() {}
}
