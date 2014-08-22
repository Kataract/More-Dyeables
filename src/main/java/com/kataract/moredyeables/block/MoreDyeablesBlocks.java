/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.00, 8/22/14
 */
package com.kataract.moredyeables.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public final class MoreDyeablesBlocks {
	
	// In DV order, skip 11 because glowstone is yellow
	public static Block blackGlowstone;
	public static Block redGlowstone;
	public static Block greenGlowstone;
	public static Block brownGlowstone;
	public static Block blueGlowstone;
	public static Block purpleGlowstone;
	public static Block cyanGlowstone;
	public static Block lightGrayGlowstone;
	public static Block grayGlowstone;
	public static Block pinkGlowstone;
	public static Block limeGlowstone;
	public static Block lightBlueGlowstone;
	public static Block magentaGlowstone;
	public static Block orangeGlowstone;
	public static Block whiteGlowstone;

	public static final void init() {
		initGlowstoneBlocks();
	}

	private static void initGlowstoneBlocks() {
		GameRegistry.registerBlock(blackGlowstone = new GlowstoneBlock(
				"blackGlowstone", Material.glass), "blackGlowstone");
		GameRegistry.registerBlock(redGlowstone = new GlowstoneBlock(
				"redGlowstone", Material.glass), "redGlowstone");
		GameRegistry.registerBlock(greenGlowstone = new GlowstoneBlock(
				"greenGlowstone", Material.glass), "greenGlowstone");
		GameRegistry.registerBlock(brownGlowstone = new GlowstoneBlock(
				"brownGlowstone", Material.glass), "brownGlowstone");
		GameRegistry.registerBlock(blueGlowstone = new GlowstoneBlock(
				"blueGlowstone", Material.glass), "blueGlowstone");
		GameRegistry.registerBlock(purpleGlowstone = new GlowstoneBlock(
				"purpleGlowstone", Material.glass), "purpleGlowstone");
		GameRegistry.registerBlock(cyanGlowstone = new GlowstoneBlock(
				"cyanGlowstone", Material.glass), "cyanGlowstone");
		GameRegistry.registerBlock(lightGrayGlowstone = new GlowstoneBlock(
				"lightGrayGlowstone", Material.glass), "lightGrayGlowstone");
		GameRegistry.registerBlock(grayGlowstone = new GlowstoneBlock(
				"grayGlowstone", Material.glass), "grayGlowstone");
		GameRegistry.registerBlock(pinkGlowstone = new GlowstoneBlock(
				"pinkGlowstone", Material.glass), "pinkGlowstone");
		GameRegistry.registerBlock(limeGlowstone = new GlowstoneBlock(
				"limeGlowstone", Material.glass), "limeGlowstone");
		GameRegistry.registerBlock(lightBlueGlowstone = new GlowstoneBlock(
				"lightBlueGlowstone", Material.glass), "lightBlueGlowstone");
		GameRegistry.registerBlock(magentaGlowstone = new GlowstoneBlock(
				"magentaGlowstone", Material.glass), "magentaGlowstone");
		GameRegistry.registerBlock(orangeGlowstone = new GlowstoneBlock(
				"orangeGlowstone", Material.glass), "orangeGlowstone");
		GameRegistry.registerBlock(whiteGlowstone = new GlowstoneBlock(
				"whiteGlowstone", Material.glass), "whiteGlowstone");
	}
}
