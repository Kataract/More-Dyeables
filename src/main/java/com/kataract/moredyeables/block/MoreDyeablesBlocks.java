/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.01, 8/26/14
 */
package com.kataract.moredyeables.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.kataract.moredyeables.block.metablock.ColoredGlowstoneMetaBlock;
import com.kataract.moredyeables.block.metablock.NeonGlowstoneMetaBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public final class MoreDyeablesBlocks {

	/**
	 * coloredGlowstone holds all Glowstone dyeable from preexisting dyes in
	 * vanilla Minecraft.  neonGlowstone holds added neon variants.
	 * neonGlowstone might be renamed to take advantage of the 10 DVs left in
	 * the event more colors that are custom are added.
	 */
	public static Block coloredGlowstone;
	public static Block neonGlowstone;

	public static final void init() {
		initGlowstoneBlocks();
	}

	private static void initGlowstoneBlocks() {
		GameRegistry.registerBlock(coloredGlowstone = new GlowstoneBlock(
				"glowstone", Material.glass),
				ColoredGlowstoneMetaBlock.class, "glowstone");
		GameRegistry.registerBlock(neonGlowstone = new GlowstoneBlock(
				"neon_glowstone", Material.glass),
				NeonGlowstoneMetaBlock.class, "neon_glowstone");
		
	}
}
