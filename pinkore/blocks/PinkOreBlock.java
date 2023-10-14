package com.ultrre.pinkore.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PinkOreBlock extends Block {
    public PinkOreBlock() {
        super(AbstractBlock.Properties.of(Material.METAL)
                .strength(3.0f,5.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .requiresCorrectToolForDrops()
                .harvestTool(ToolType.PICKAXE)
                .lightLevel(value -> 10)
            );
    }
}
