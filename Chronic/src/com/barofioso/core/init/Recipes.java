package com.barofioso.core.init;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {


	public static void Init() {
	
		//Static Recipe
				GameRegistry.addRecipe(new ItemStack(ModBlocks.copperOre,3,0), new Object[]{
					"DDD","SSS","DDD",'D', Block.dirt, 'S', Block.stone
				});
			//Shapeless Recipe
				GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.copperOre,2,0), new Object[]{
					new ItemStack(Block.dirt), new ItemStack(Block.dirt), new ItemStack(Block.dirt), new ItemStack(Block.stone)
				});
			//Melting Recipe
				GameRegistry.addSmelting(Block.dirt.blockID, new ItemStack(ModBlocks.copperOre,5,0),1f);
			//Enchant
				ItemStack enchant = new ItemStack(ModBlocks.copperOre);
				enchant.addEnchantment(Enchantment.sharpness, 2);
				
				GameRegistry.addRecipe(enchant, new Object[]{
						"DSD","DSD","DSD", 'D', Block.dirt, 'S', Block.stone
				});
	}

}
