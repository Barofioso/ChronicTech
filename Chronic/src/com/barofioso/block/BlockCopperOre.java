package com.barofioso.block;

import net.minecraft.block.material.Material;

import com.barofioso.core.BlockBase;
import com.barofioso.core.CTMain;
import com.barofioso.core.lib.BlockNames;

public class BlockCopperOre extends BlockBase {

	public BlockCopperOre(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(BlockNames.COPPER_ORE);
		this.setCreativeTab(CTMain.TabCTOre);
	}

}
