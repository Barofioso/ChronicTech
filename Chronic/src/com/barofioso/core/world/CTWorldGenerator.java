package com.barofioso.core.world;

import java.util.Random;

import com.barofioso.core.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import cpw.mods.fml.common.IWorldGenerator;

public class CTWorldGenerator implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		
		case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
		
		}
		
	}

	private void generateNether(World world, Random random, int chunkX,int chunkZ) {
		this.spawnOres(ModBlocks.copperOre, Block.stone,world,random,chunkX,chunkZ,16,16,5,50,0,50);
		
	}

	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
		this.spawnOres(ModBlocks.copperOre, Block.whiteStone,world,random,chunkX,chunkZ,16,16,5,50,0,50);
		
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ){
		this.spawnOres(ModBlocks.copperOre, Block.netherrack,world,random,chunkX,chunkZ,16,16,5,50,0,50);
	}
	
	
	/**
	 * 
	 * @param block welchen du spawnen möchtest
	 * @param blockReplaced Welcher Block ersetzt werden sollte durch den ausgewählten Block
	 * @param world wo du ihn spawnen möchtest
	 * @param random Randomizer wird für den Zufall benutzt
	 * @param chunkX Die Chunk Waagrechte seite
	 * @param chunkZ Die Chunk Senkrechte seite
	 * @param maxX Maximale X-Grösse wo der Block spawnen kann
	 * @param maxZ Maximale Z-Grösse wo der Block Spawnen kann
	 * @param vainSize Die Grösse des Erzvorkommens
	 * @param spawnChance Die chance den Block spawnen zu lassen
	 * @param yMin Minimum Höhe für den Block
	 * @param yMax Maximum Höhe für den Block
	 */
	public void spawnOres(Block block,Block blockReplaced, World world, Random random, int chunkX, int chunkZ, int maxX, int maxZ, int vainSize, int spawnChance, int yMin, int yMax){
		for(int i = 0; i < spawnChance; i++){
			int posX = chunkX + random.nextInt(15);
			int posZ = chunkZ + random.nextInt(15);
			int posY = yMin + random.nextInt(yMax - yMin);
			(new WorldGenMinable(block.blockID, vainSize, blockReplaced.blockID)).generate(world,random,posX,posY,posZ);
		}
	}

}
