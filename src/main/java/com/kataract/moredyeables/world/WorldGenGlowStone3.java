/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.02, 8/31/14
 */
package com.kataract.moredyeables.world;

import java.util.Random;

import com.kataract.moredyeables.block.MoreDyeablesBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenGlowStone3 extends WorldGenerator {
	/**
	 * This class mimics the original glowstone generation, but for custom
	 * glowstone blocks.
	 */

	/**
	 * An overloaded version of the typical generate method.  Takes in a block
	 * to place, and otherwise operates like the normal
	 * WorldGenGlowStone1/2.generate method.  Note that this is intended to be
	 * called in the nether, as it checks for netherrack as an obstacle.
	 * Original obfuscated variables were renamed for clarity purposes, based
	 * on educated guessing.
	 * 
	 * @param world World to place in
	 * @param random Random number generator
	 * @param x X coord
	 * @param y Y coord
	 * @param z Z coord
	 * @param block Block to place
	 * @param metadata Metadata information for the block
	 * @return True on success, false if something was in the way
	 */
	public boolean generate(World world, Random random,	int x, int y, int z, Block block, int metadata) {
		
		if(metadata > 15) { metadata = 0; }
		if (!world.isAirBlock(x, y, z)) {
			return false;
		} else if (world.getBlock(x, y + 1, z) != Blocks.netherrack) {
			return false;
		} else {
			world.setBlock(x, y, z, block, metadata, 2);

			for (int i = 0; i < 1500; ++i) {
				
				int newX = x + random.nextInt(8) - random.nextInt(8);
				int newY = y - random.nextInt(12);
				int newZ = z + random.nextInt(8) - random.nextInt(8);

				if (world.getBlock(newX, newY, newZ).getMaterial() == Material.air) {
					
					int j = 0;
					
					for (int k = 0; k < 6; ++k) {
						
						Block checkBlock = null;
						if (k == 0) {
							checkBlock = world.getBlock(newX - 1, newY, newZ);
						}
						if (k == 1) {
							checkBlock = world.getBlock(newX + 1, newY, newZ);
						}
						if (k == 2) {
							checkBlock = world.getBlock(newX, newY - 1, newZ);
						}
						if (k == 3) {
							checkBlock = world.getBlock(newX, newY + 1, newZ);
						}
						if (k == 4) {
							checkBlock = world.getBlock(newX, newY, newZ - 1);
						}
						if (k == 5) {
							checkBlock = world.getBlock(newX, newY, newZ + 1);
						}
						if (checkBlock == block) {
							++j;
						}
					}

					if (j == 1) {
						world.setBlock(newX, newY, newZ, block, metadata, 2);
					}
				}
			}

			return true;
		}
	}

	/**
	 * Exists because it has to.  Returns false.
	 */
	@Override
	public boolean generate(World p_76484_1_, Random p_76484_2_,
			int p_76484_3_, int p_76484_4_, int p_76484_5_) {
		// TODO Auto-generated method stub
		return false;
	}
}
