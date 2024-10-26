package github.jcsmecabricks.customweapons.init;

import github.jcsmecabricks.customweapons.CustomWeapons;
import github.jcsmecabricks.customweapons.list.enmus.CustomWeaponsToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit {
    public static final Item SILVER = register("silver", new Item(new Item.Settings()));
    public static final Item SICKLE = register("sickle", new Item(new Item.Settings()));

    public static final ArmorItem SPARTAN_HELM = register("spartan_helm",
            new ArmorItem(ArmorMaterialInit.CUSTOMWEAPONS, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33))));

    public static final ArmorItem SPARTAN_CHESTPLATE = register("spartan_chestplate",
            new ArmorItem(ArmorMaterialInit.CUSTOMWEAPONS, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33))));

    public static final ArmorItem MEDIEVAL_LEGGINGS = register("medieval_leggings",
            new ArmorItem(ArmorMaterialInit.CUSTOMWEAPONS, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33))));

    public static final ArmorItem MEDIEVAL_BOOTS = register("medieval_boots",
            new ArmorItem(ArmorMaterialInit.CUSTOMWEAPONS, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33))));

    public static final SwordItem SICKLES = register("sickles",
            new SwordItem(CustomWeaponsToolMaterials.CUSTOMWEAPONS, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(CustomWeaponsToolMaterials.CUSTOMWEAPONS, 8, -2f))));

    public static final SwordItem SCYTHE = register("scythe",
            new SwordItem(CustomWeaponsToolMaterials.CUSTOMWEAPONS2, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(CustomWeaponsToolMaterials.CUSTOMWEAPONS2, 10, -2.5f))));

    public static final SwordItem SPEAR = register("spear",
            new SwordItem(CustomWeaponsToolMaterials.CUSTOMWEAPONS, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(CustomWeaponsToolMaterials.CUSTOMWEAPONS, 6, -2f))));


       public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, CustomWeapons.id(name), item);
    }
    public static void load() {}
}
