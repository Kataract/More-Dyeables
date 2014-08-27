/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.01, 8/26/14
 */
package com.kataract.moredyeables.item;

import com.kataract.moredyeables.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public final class MoreDyeablesItems {

	public static Item coloredGlowstoneDust;
	public static Item neonGlowstoneDust;
	public static Item customDye;


	public static final void init() {
		initGlowstoneDusts();
		initCustomItems();
	}

	private static void initGlowstoneDusts() {
		GameRegistry.registerItem(coloredGlowstoneDust = new DyedGlowstoneDust(
				"glowstone_dust"), "glowstone_dust");
		GameRegistry.registerItem(neonGlowstoneDust = new DyedGlowstoneDust(
				"neon_glowstone_dust"), "neon_glowstone_dust");
	}

	private static void initCustomItems() {
		GameRegistry.registerItem(customDye = new CustomDye("neon_dye"),
				"neon_dye");
	}

	public static Item getItemFromUnlocalizedName(String name) {
		// Returns the item associated with a particular block.
		int index = name.indexOf('.') + 1;
		String parsedName = name.substring(index);
		return GameRegistry.findItem(Main.MODID, parsedName);
	}
}
