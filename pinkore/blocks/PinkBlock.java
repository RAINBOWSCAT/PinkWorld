package com.ultrre.pinkore.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PinkBlock extends Block {
    public PinkBlock() {
        super(AbstractBlock.Properties.of(Material.GLASS)
                .strength(4.0f,6.2f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .requiresCorrectToolForDrops()
                .harvestTool(ToolType.PICKAXE)
                .lightLevel(value -> 12));
    }
}
