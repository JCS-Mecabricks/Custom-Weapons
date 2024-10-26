package github.jcsmecabricks.customweapons.list.enmus;


import github.jcsmecabricks.customweapons.init.ItemInit;
import github.jcsmecabricks.customweapons.list.TagList;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import javax.tools.Tool;

public enum CustomWeaponsToolMaterials implements ToolMaterial {
    CUSTOMWEAPONS(
            300,
            8.0f,
            1.8f,
            TagList.Blocks.INCORRECT_FOR_CUSTOMWEAPONS_TOOL,
            18,
            Ingredient.ofItems(ItemInit.SILVER)
    ),
        CUSTOMWEAPONS2(
                350,
                8.0f,
                1.8f,
                TagList.Blocks.INCORRECT_FOR_CUSTOMWEAPONS_TOOL2,
                18,
                Ingredient.ofItems(ItemInit.SILVER)
        );

    private final int durability;
    private final float miningSpeedMultiplier, attackDamage;
    private final TagKey<Block> inverseTag;
    private final int enchantability;
    private final Ingredient repairIngredient;

    CustomWeaponsToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, TagKey<Block> inverseTag, int enchantability, Ingredient repairIngredient) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.inverseTag = inverseTag;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}

