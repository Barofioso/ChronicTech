package com.barofioso.core.handler;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class CTFuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		
		switch(fuel.itemID){
		
		case ModItems.BlackStick.itemID: {return 2400;}
		
		
		
		default: return 0;
		}
	}

}
