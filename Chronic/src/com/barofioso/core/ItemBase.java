package com.barofioso.core;

import com.barofioso.core.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	
	/*
	 * Die ist die Base Klasse für alle Items
	 * Jedes neue Item muss diese Klasse erweitern
	 */
	
	public ItemBase(int id) {
		super(id-256);
		
	}
	
	/*
	 * Registriert die Texturen für die einzelnen Items. 
	 * Wurde vom Item diese Klasse erweitert, muss in keinem weiteren selbst erstellten item dieser Befehl ausgeführt werden.
	 * Er wird automatisch weitergegeben und hier für jedes Item das diese Klasse erweitert registriert
	 */
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		itemIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}

}
