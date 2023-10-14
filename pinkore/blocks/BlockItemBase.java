package com.ultrre.pinkore.blocks;


import com.ultrre.pinkore.PinkOre;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().tab(PinkOre.TAB));
    }
}
