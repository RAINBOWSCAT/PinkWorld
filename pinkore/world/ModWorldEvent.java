package com.ultrre.pinkore.world;


import com.ultrre.pinkore.PinkOre;
import com.ultrre.pinkore.world.gen.ModOreGen;
import com.ultrre.pinkore.world.gen.OreGen;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PinkOre.MOD_ID)
public class ModWorldEvent {
    @SubscribeEvent
    public static void biomeLoadEvent(final BiomeLoadingEvent event){
        ModOreGen.generateOre(event);
    }
}
