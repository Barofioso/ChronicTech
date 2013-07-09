package com.barofioso.core.init;

import com.barofioso.core.lib.ItemIds;
import com.barofioso.core.lib.ItemNames;
import com.barofioso.item.ItemCopperIngot;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.Item;

public class ModItems {

	
	public static Item copperIngot;
	
	
	public static void Init(){
		
		copperIngot = new ItemCopperIngot(ItemIds.COPPER_INGOT_ID_DEFAULT);
		GameRegistry.registerItem(copperIngot, ItemNames.COPPER_INGOT);
	}
}
