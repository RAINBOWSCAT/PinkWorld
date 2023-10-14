package com.ultrre.pinkore.armor;

import com.ultrre.pinkore.PinkOre;
import com.ultrre.pinkore.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMet implements IArmorMaterial {

    //xie tui xiong tou


    PINK(PinkOre.MOD_ID + ":pink", 175, new int[]{6,15,18,6}, 35, SoundEvents.ARMOR_EQUIP_DIAMOND, 35.0F,
            () -> {return Ingredient.of(RegistryHandler.PINK.get());},0);
    private static final int[] MAX_DAMAGE = new int[] {21,26,25,23};
    private final  String name;
    private final  int maxDamage;
    private final int[] damageReCount;
    private final int enchant;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMe;
    private final  float knockbackResistance;

    ModArmorMet(String name, int maxDamage, int[] damageReCount, int enchant, SoundEvent soundEvent,
                float toughness, Supplier<Ingredient> repairMe, float knockbackResistance){
        this.name = name;
        this.maxDamage = maxDamage;
        this.damageReCount = damageReCount;
        this.enchant = enchant;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMe = repairMe;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType equipmentSlotType) {
        return MAX_DAMAGE[equipmentSlotType.getIndex()] * this.maxDamage;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType equipmentSlotType) {
        return this.damageReCount[equipmentSlotType.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchant;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMe.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
