package com.barofioso.core;

import com.barofioso.core.lib.Reference;
import com.barofioso.core.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NR)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class CTMain {
	
	@Instance("ChronicTech")
	public static CTMain instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_SIDE_LOCATION, serverSide = Reference.SERVER_SIDE_LOCATION)
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@Init
	public void init(FMLInitializationEvent event) {
		
	}
	
	@PostInit
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}
