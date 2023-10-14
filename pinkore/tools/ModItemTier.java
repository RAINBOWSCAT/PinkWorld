package com.ultrre.pinkore.tools;

import com.ultrre.pinkore.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    PINK(4,2000,22.0F,5.0F,30,
            () -> {return Ingredient.of(RegistryHandler.PINK.get());});

    private final int harvestLevel;
    private final int maxUse;
    private final int enchantablilty;
    private final float efficiency;
    private final float attackDamage;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUse, float efficiency, float attackDamage,int enchantability, Supplier<Ingredient> repairMaterial){
        this.repairMaterial = repairMaterial;
        this.harvestLevel = harvestLevel;
        this.attackDamage = attackDamage;
        this.enchantablilty = enchantability;
        this.efficiency = efficiency;
        this.maxUse = maxUse;

    }

    @Override
    public int getUses() {
        return maxUse;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantablilty;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
}
