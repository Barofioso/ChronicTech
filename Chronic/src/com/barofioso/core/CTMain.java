package com.barofioso.core;

import net.minecraft.creativetab.CreativeTabs;

import com.barofioso.core.creativeTabs.TabCTMain;
import com.barofioso.core.creativeTabs.TabCTMachines;
import com.barofioso.core.creativeTabs.TabCTOres;
import com.barofioso.core.handler.CTFuelHandler;
import com.barofioso.core.handler.LocalizationHandler;
import com.barofioso.core.init.ModBlocks;
import com.barofioso.core.init.ModItems;
import com.barofioso.core.init.Recipes;
import com.barofioso.core.lib.Reference;
import com.barofioso.core.proxies.CommonProxy;
import com.barofioso.core.world.CTWorldGenerator;

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
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NR)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class CTMain {
	
	@Instance("ChronicTech")
	public static CTMain instance;
	
	CTFuelHandler fuelHandler = new CTFuelHandler();
	CTWorldGenerator worldGenerator = new CTWorldGenerator();
	
	
	@SidedProxy(clientSide = Reference.CLIENT_SIDE_LOCATION, serverSide = Reference.SERVER_SIDE_LOCATION)
	public static CommonProxy proxy;
	
	public static CreativeTabs TabCTMain = new TabCTMain(CreativeTabs.getNextID(), Reference.TAB_MAIN);
	public static CreativeTabs TabCTMachines = new TabCTMachines(CreativeTabs.getNextID(), Reference.TAB_MACHINES);
	public static CreativeTabs TabCTOre = new TabCTOres(CreativeTabs.getNextID(), Reference.TAB_ORES);
	
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
		LocalizationHandler.loadLanguages();
		ModBlocks.Init();
		ModItems.Init();
		Recipes.Init();
		
		GameRegistry.registerFuelHandler(fuelHandler);
		GameRegistry.registerWorldGenerator(worldGenerator);
	}
	
	
	
	
	@Init
	public void init(FMLInitializationEvent event) {
		

	}
	
	
	
	
	@PostInit
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}
