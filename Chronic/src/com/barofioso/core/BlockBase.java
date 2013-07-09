package com.barofioso.core;

import com.barofioso.core.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockBase extends Block {

	public BlockBase(int id, Material material) {
		super(id, material);
	
	}
	
	@Override
	public void registerIcons(IconRegister register){
		blockIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
}
