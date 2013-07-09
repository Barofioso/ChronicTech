package com.barofioso.core.handler;

import com.barofioso.core.ItemBase;
import com.barofioso.core.init.ModItems;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class CTFuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		
		if(fuel.itemID == ModItems.copperIngot.itemID){
			return 2400;
		}
		else{
		return 0;
	
		}
		
	}

}
