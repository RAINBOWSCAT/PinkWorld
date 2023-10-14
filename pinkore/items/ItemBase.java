package com.ultrre.pinkore.items;

import com.ultrre.pinkore.PinkOre;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().tab(PinkOre.TAB));
    }
}
