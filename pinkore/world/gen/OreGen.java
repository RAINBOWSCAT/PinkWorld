package com.ultrre.pinkore.world.gen;

import com.ultrre.pinkore.PinkOre;
import com.ultrre.pinkore.blocks.PinkOreBlock;
import com.ultrre.pinkore.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;
public enum OreGen {
    PINK_ORE(Lazy.of(RegistryHandler.PINK_ORE),6,6,20);
    private final Lazy<Block> block;
    private final int maxSize;
    private final int minHeight;
    private final int maxHeight;
    OreGen(Lazy<Block> block, int maxSize, int minHeight, int maxHeight){
        this.block = block;
        this.maxSize = maxSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }
    public Lazy<Block> getBlock(){return block;}
    public int getMaxSize(){return maxSize;}
    public int getMinHeight(){return minHeight;}
    public int getMaxHeight(){return maxHeight;}

    public static OreGen get(Block block){
        for (OreGen ore : values()){
            if (block == ore.block){
                return ore;
            }
        }
        return null;
    }
}
