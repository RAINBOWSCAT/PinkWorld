package com.ultrre.pinkore.util;

import com.ultrre.pinkore.PinkOre;
import com.ultrre.pinkore.armor.ModArmorMet;
import com.ultrre.pinkore.blocks.BlockItemBase;
import com.ultrre.pinkore.items.ItemBase;
import com.ultrre.pinkore.items.Apple;
import com.ultrre.pinkore.blocks.PinkBlock;
import com.ultrre.pinkore.blocks.PinkOreBlock;
import com.ultrre.pinkore.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.swing.*;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PinkOre.MOD_ID);

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PinkOre.MOD_ID);

    //Item
    public static final RegistryObject<Item> PINK  = ITEMS.register("pink",ItemBase::new);
    public static final RegistryObject<Item> PINK_POWDER = ITEMS.register("pink_powder", ItemBase::new);
    public static final RegistryObject<Item> PINK_GEM = ITEMS.register("pink_gem", ItemBase::new);




    //Blocks on the ground
    public static final RegistryObject<Block> PINK_BLOCK = BLOCKS.register("pink_block", PinkBlock::new);
    public static final RegistryObject<Block> PINK_ORE = BLOCKS.register("pink_ore", PinkOreBlock::new);




    //In hand
    public static final RegistryObject<Item> PINK_BLOCK_ITEM = ITEMS.register("pink_block", () -> new BlockItemBase(PINK_BLOCK.get()));
    public static final RegistryObject<Item> PINK_ORE_ITEM = ITEMS.register("pink_ore", () -> new BlockItemBase(PINK_ORE.get()));

    //Tools
    public static final RegistryObject<SwordItem> PINK_SWORD = ITEMS.register("pink_sword", () -> new SwordItem(ModItemTier.PINK, 11,15.25F, new Item.Properties().tab(PinkOre.TAB)));
    public static final RegistryObject<PickaxeItem> PINK_PICKAXE = ITEMS.register("pink_pickaxe", () -> new PickaxeItem(ModItemTier.PINK, -2,0.0F, new Item.Properties().tab(PinkOre.TAB)));
    public static final RegistryObject<HoeItem> PINK_HOE = ITEMS.register("pink_hoe", () -> new HoeItem(ModItemTier.PINK, -2,0.0F, new Item.Properties().tab(PinkOre.TAB)));
    public static final RegistryObject<ShovelItem> PINK_SHOVEL = ITEMS.register("pink_shovel", () -> new ShovelItem(ModItemTier.PINK, -2,0.0F, new Item.Properties().tab(PinkOre.TAB)));
    public static final RegistryObject<AxeItem> PINK_AXE = ITEMS.register("pink_axe", () -> new AxeItem(ModItemTier.PINK, 13,10.25F, new Item.Properties().tab(PinkOre.TAB)));


    //Armor
    public static final RegistryObject<ArmorItem> PINK_HELMET = ITEMS.register("pink_helmet",
            () -> new ArmorItem(ModArmorMet.PINK, EquipmentSlotType.HEAD, new Item.Properties().tab(PinkOre.TAB)));
    public static final RegistryObject<ArmorItem> PINK_CHEST = ITEMS.register("pink_chestplate",
            () -> new ArmorItem(ModArmorMet.PINK, EquipmentSlotType.CHEST, new Item.Properties().tab(PinkOre.TAB)));
    public static final RegistryObject<ArmorItem> PINK_LEGS = ITEMS.register("pink_leggings",
            () -> new ArmorItem(ModArmorMet.PINK, EquipmentSlotType.LEGS, new Item.Properties().tab(PinkOre.TAB)));
    public static final RegistryObject<ArmorItem> PINK_BOOTS = ITEMS.register("pink_boots",
            () -> new ArmorItem(ModArmorMet.PINK, EquipmentSlotType.FEET, new Item.Properties().tab(PinkOre.TAB)));
    public static final RegistryObject<Apple> PINK_APPLE = ITEMS.register("pink_apple",Apple::new);


    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
