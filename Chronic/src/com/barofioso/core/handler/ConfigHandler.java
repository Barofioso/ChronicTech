package com.barofioso.core.handler;

import java.io.File;
import java.util.logging.Level;

import com.barofioso.core.lib.BlockIds;
import com.barofioso.core.lib.BlockNames;
import com.barofioso.core.lib.ItemIds;
import com.barofioso.core.lib.ItemNames;
import com.barofioso.core.lib.Reference;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {

	public static Configuration config;
	
	public static void Init(File file){
		config = new Configuration(file);
		
		try{
			
			config.load();
			
			//Blocks
			BlockIds.COPPER_ORE_ID = config.getBlock(BlockNames.COPPER_ORE, BlockIds.COPPER_ORE_ID_DEFAULT).getInt(BlockIds.COPPER_ORE_ID_DEFAULT);
		
			
			//Items
			ItemIds.COPPER_INGOT_ID = config.getItem(ItemNames.COPPER_INGOT, ItemIds.COPPER_INGOT_ID_DEFAULT).getInt(ItemIds.COPPER_INGOT_ID_DEFAULT);
		
		
		
		
		}
		catch(Exception e){
			FMLLog.log(Level.SEVERE,e, Reference.MOD_ID + "Has a problem loading the config file");
		}
		finally {
			config.save();
		}
	}
}
