package com.ultrre.pinkore.items;

import com.ultrre.pinkore.PinkOre;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Apple extends Item {
    public Apple() {
        super(new Item.Properties()
                .tab(PinkOre.TAB)
                .food(new Food.Builder()
                        .nutrition(7)
                        .saturationMod(35f)
                        .effect(new EffectInstance(Effects.LUCK,6000,3),1.0f)
                        .effect(new EffectInstance(Effects.DAMAGE_RESISTANCE,6000,5),1.0f)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE,6000,5),1.0f)
                        .effect(new EffectInstance(Effects.REGENERATION,6000,5),1.0f)
                        .effect(new EffectInstance(Effects.HEALTH_BOOST,6000,50),1.0f)
                        .alwaysEat()
                        .build())

        );
    }
}
