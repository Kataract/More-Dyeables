/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.02, 8/31/14
 */
package com.kataract.moredyeables.world;

import java.util.Random;

import com.kataract.moredyeables.block.MoreDyeablesBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenGlowStone1;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class MoreDyeablesWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
			case 0:
				GenerateOverworld(random, chunkX * 16, chunkZ * 16, world);
				break;
			case 1:
				GenerateEnd(random, chunkX * 16, chunkZ * 16, world);
				break;
			case -1:
				GenerateNether(random, chunkX * 16, chunkZ * 16, world);
				break;
		}

	}
	
	private void GenerateOverworld(Random random, int x, int z, World world) {
		
	}
	
	private void GenerateNether(Random random, int x, int z, World world) {
		this.addGlowstoneSpawn(MoreDyeablesBlocks.coloredGlowstone, 16, world, random, x, z, 10, 15, 3, 0, 128);
		this.addGlowstoneSpawn(MoreDyeablesBlocks.neonGlowstone, 6, world, random, x, z, 10, 15, 3, 0, 128);
	}

	private void GenerateEnd(Random random, int x, int z, World world) {
		
	}

	/**
	 * Adds custom glowstone to the specified world.  Coordinates are
	 * randomized per the number specified in chancesToSpawn, and then passes
	 * the parameters to the world generator to replace blocks.
	 * 
	 * @param block Block to add
	 * @param metadata Metadata value for the block.  For none, set to 0
	 * @param world World to add to
	 * @param random Random number generator
	 * @param blockXPosition X position of a chunk
	 * @param blockZPosition Z position of a chunk
	 * @param minVeinSize Minimum vein size
	 * @param maxVeinSize Maximum vein size
	 * @param chancesToSpawn Chance for the block to spawn
	 * @param minY Lowest point to spawn
	 * @param maxY Highest point to spawn
	 */
	public void addGlowstoneSpawn(Block block, int metadata, World world, Random random, int blockXPosition, int blockZPosition, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
		
		WorldGenGlowStone3 glowstone = new WorldGenGlowStone3(); 
		for(int i = 0; i < chancesToSpawn; i++) {
			int posX = blockXPosition + random.nextInt(16);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPosition + random.nextInt(16);
			glowstone.generate(world, random, posX, posY, posZ, block, random.nextInt(metadata));
		}
	}


}
