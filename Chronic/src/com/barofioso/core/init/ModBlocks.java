package com.barofioso.core.init;



import com.barofioso.block.BlockCopperOre;
import com.barofioso.core.lib.BlockIds;
import com.barofioso.core.lib.BlockNames;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;

public class ModBlocks {

	//Create a Block
	public static Block copperOre;
	
	public static void Init(){
		
		//Set the Block ID for the BlockClass
		copperOre = new BlockCopperOre(BlockIds.COPPER_ORE_ID_DEFAULT+1500);
		
		//Register the Block to Game 
		GameRegistry.registerBlock(copperOre, BlockNames.COPPER_ORE);
	}
}
