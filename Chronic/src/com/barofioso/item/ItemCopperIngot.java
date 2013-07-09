package com.barofioso.item;

import com.barofioso.core.CTMain;
import com.barofioso.core.lib.ItemNames;
import com.barofioso.core.ItemBase;

public class ItemCopperIngot extends ItemBase {

	public ItemCopperIngot(int id) {
		super(id);
		this.setCreativeTab(CTMain.TabCTOre);
		this.setUnlocalizedName(ItemNames.COPPER_INGOT);
	}

}
