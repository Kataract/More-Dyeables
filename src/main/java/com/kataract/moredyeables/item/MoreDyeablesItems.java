/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.00, 8/22/14
 */
package com.kataract.moredyeables.item;

import com.kataract.moredyeables.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public final class MoreDyeablesItems {

	// Glowstone dusts
	public static Item blueGlowstoneDust;
	public static Item cyanGlowstoneDust;
	public static Item lightBlueGlowstoneDust;
	public static Item limeGlowstoneDust;
	public static Item greenGlowstoneDust;
	public static Item magentaGlowstoneDust;
	public static Item purpleGlowstoneDust;
	public static Item redGlowstoneDust;
	public static Item blackGlowstoneDust;
	public static Item brownGlowstoneDust;
	public static Item grayGlowstoneDust;
	public static Item pinkGlowstoneDust;
	public static Item orangeGlowstoneDust;
	public static Item lightGrayGlowstoneDust;
	public static Item whiteGlowstoneDust;

	public static final void init() {
		initGlowstoneDusts();
	}

	private static void initGlowstoneDusts() {
		blueGlowstoneDust = new Item().setUnlocalizedName("blueGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":blueGlowstoneDust");
		GameRegistry.registerItem(blueGlowstoneDust, "blueGlowstoneDust");

		cyanGlowstoneDust = new Item().setUnlocalizedName("cyanGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":cyanGlowstoneDust");
		GameRegistry.registerItem(cyanGlowstoneDust, "cyanGlowstoneDust");

		lightBlueGlowstoneDust = new Item()
				.setUnlocalizedName("lightBlueGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":lightBlueGlowstoneDust");
		GameRegistry.registerItem(lightBlueGlowstoneDust,
				"lightBlueGlowstoneDust");

		limeGlowstoneDust = new Item().setUnlocalizedName("limeGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":limeGlowstoneDust");
		GameRegistry.registerItem(limeGlowstoneDust, "limeGlowstoneDust");

		greenGlowstoneDust = new Item()
				.setUnlocalizedName("greenGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":greenGlowstoneDust");
		GameRegistry.registerItem(greenGlowstoneDust, "greenGlowstoneDust");

		magentaGlowstoneDust = new Item()
				.setUnlocalizedName("magentaGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":magentaGlowstoneDust");
		GameRegistry.registerItem(magentaGlowstoneDust, "magentaGlowstoneDust");

		purpleGlowstoneDust = new Item()
				.setUnlocalizedName("purpleGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":purpleGlowstoneDust");
		GameRegistry.registerItem(purpleGlowstoneDust, "purpleGlowstoneDust");

		redGlowstoneDust = new Item().setUnlocalizedName("redGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":redGlowstoneDust");
		GameRegistry.registerItem(redGlowstoneDust, "redGlowstoneDust");

		blackGlowstoneDust = new Item()
				.setUnlocalizedName("blackGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":blackGlowstoneDust");
		GameRegistry.registerItem(blackGlowstoneDust, "blackGlowstoneDust");

		brownGlowstoneDust = new Item()
				.setUnlocalizedName("brownGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":brownGlowstoneDust");
		GameRegistry.registerItem(brownGlowstoneDust, "brownGlowstoneDust");

		grayGlowstoneDust = new Item().setUnlocalizedName("grayGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":grayGlowstoneDust");
		GameRegistry.registerItem(grayGlowstoneDust, "grayGlowstoneDust");

		pinkGlowstoneDust = new Item().setUnlocalizedName("pinkGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":pinkGlowstoneDust");
		GameRegistry.registerItem(pinkGlowstoneDust, "pinkGlowstoneDust");

		orangeGlowstoneDust = new Item()
				.setUnlocalizedName("orangeGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":orangeGlowstoneDust");
		GameRegistry.registerItem(orangeGlowstoneDust, "orangeGlowstoneDust");

		lightGrayGlowstoneDust = new Item()
				.setUnlocalizedName("lightGrayGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":lightGrayGlowstoneDust");
		GameRegistry.registerItem(lightGrayGlowstoneDust,
				"lightGrayGlowstoneDust");

		whiteGlowstoneDust = new Item()
				.setUnlocalizedName("whiteGlowstoneDust")
				.setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":whiteGlowstoneDust");
		GameRegistry.registerItem(whiteGlowstoneDust, "whiteGlowstoneDust");
	}

	public static Item getItemFromUnlocalizedName(String name) {
		// Returns the item associated with a particular block.
		int index = name.indexOf('.') + 1;
		String parsedName = name.substring(index);
		return GameRegistry.findItem(Main.MODID, parsedName);
	}
}
