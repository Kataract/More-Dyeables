/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.01, 8/26/14
 */
package com.kataract.moredyeables.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.kataract.moredyeables.block.MoreDyeablesBlocks;
import com.kataract.moredyeables.item.MoreDyeablesItems;

import cpw.mods.fml.common.registry.GameRegistry;

public final class MoreDyeablesCrafting {

	public static final void init() {
		initGlowstoneRecipes();
		initCustomRecipes();
	}

	private static void initGlowstoneRecipes() {

		// Dyed with vanilla dyes
		for (int i = 0; i < 16; i++) {
			GameRegistry.addRecipe(new ItemStack(
					MoreDyeablesBlocks.coloredGlowstone, 1, i),
					new Object[] {"##",	"##", '#',
						new ItemStack(MoreDyeablesItems.coloredGlowstoneDust, 1, i) });

			GameRegistry.addShapelessRecipe(new ItemStack(
					MoreDyeablesItems.coloredGlowstoneDust, 1, i),
					new Object[] { Items.glowstone_dust,
							new ItemStack(Items.dye, 1, i) });

			GameRegistry.addShapelessRecipe(new ItemStack(
					MoreDyeablesBlocks.coloredGlowstone, 1, i), new Object[] {
					Blocks.glowstone, new ItemStack(Items.dye, 1, i) });
			
			GameRegistry.addShapelessRecipe(new ItemStack(
					MoreDyeablesItems.coloredGlowstoneDust, 1, i), new Object[] {
					Items.glowstone_dust, new ItemStack(Items.dye, 1, i) });
		}

		// Dyed with custom dyes
		for (int i = 1; i < 7; i++) {
			GameRegistry.addRecipe(new ItemStack(
					MoreDyeablesBlocks.neonGlowstone, 1, i - 1), new Object[] {
					"##", "##", '#',
					new ItemStack(MoreDyeablesItems.neonGlowstoneDust, 1, i - 1) });

			GameRegistry.addShapelessRecipe(new ItemStack(
					MoreDyeablesItems.neonGlowstoneDust, 1, i - 1),
					new Object[] { Items.glowstone_dust,
							new ItemStack(MoreDyeablesItems.customDye, 1, i) });
			
			GameRegistry.addShapelessRecipe(new ItemStack(
					MoreDyeablesBlocks.neonGlowstone, 1, i - 1), new Object[] {
					Blocks.glowstone, new ItemStack(MoreDyeablesItems.customDye, 1, i) });
			
			GameRegistry.addShapelessRecipe(new ItemStack(
					MoreDyeablesItems.neonGlowstoneDust, 1, i - 1), new Object[] {
					Items.glowstone_dust, new ItemStack(MoreDyeablesItems.customDye, 1, i) });
		}

		// Remove dye - water + bone meal (bleaching)
		for (int i = 0; i < 16; i++) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.glowstone),
					new Object[] {
							Items.water_bucket,
							new ItemStack(Items.dye, 1, 15),
							new ItemStack(MoreDyeablesBlocks.coloredGlowstone, 1, i) });

			GameRegistry.addShapelessRecipe(
					new ItemStack(Items.glowstone_dust), new Object[] {
							Items.water_bucket,
							new ItemStack(Items.dye, 1, 15),
							new ItemStack(
									MoreDyeablesItems.coloredGlowstoneDust, 1, i) });
		}

		for (int i = 0; i < 6; i++) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.glowstone),
					new Object[] {
							Items.water_bucket,
							new ItemStack(Items.dye, 1, 15),
							new ItemStack(MoreDyeablesBlocks.neonGlowstone, 1, i) });

			GameRegistry.addShapelessRecipe(
					new ItemStack(Items.glowstone_dust), new Object[] {
							Items.water_bucket,
							new ItemStack(Items.dye, 1, 15),
							new ItemStack(MoreDyeablesItems.neonGlowstoneDust, 1, i) });
		}
	}

	private static void initCustomRecipes() {

		// Brightening cream
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.customDye, 1, 0), new Object[] {
				Items.slime_ball, new ItemStack(Items.dye, 1, 15) });

		// Dye DVs don't correspond to Items.dye DVs, so this is done
		// individually instead of in a loop
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.customDye, 1, 1), new Object[] {
				new ItemStack(MoreDyeablesItems.customDye, 1, 0),
				new ItemStack(Items.dye, 1, 9) });

		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.customDye, 1, 2), new Object[] {
				new ItemStack(MoreDyeablesItems.customDye, 1, 0),
				new ItemStack(Items.dye, 1, 14) });

		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.customDye, 1, 3), new Object[] {
				new ItemStack(MoreDyeablesItems.customDye, 1, 0),
				new ItemStack(Items.dye, 1, 11) });

		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.customDye, 1, 4), new Object[] {
				new ItemStack(MoreDyeablesItems.customDye, 1, 0),
				new ItemStack(Items.dye, 1, 10) });

		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.customDye, 1, 5), new Object[] {
				new ItemStack(MoreDyeablesItems.customDye, 1, 0),
				new ItemStack(Items.dye, 1, 12) });

		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.customDye, 1, 6), new Object[] {
				new ItemStack(MoreDyeablesItems.customDye, 1, 0),
				new ItemStack(Items.dye, 1, 13) });
	}
}
