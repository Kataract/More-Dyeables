/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.00, 8/22/14
 */
package com.kataract.moredyeables.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.kataract.moredyeables.block.MoreDyeablesBlocks;
import com.kataract.moredyeables.item.MoreDyeablesItems;

import cpw.mods.fml.common.registry.GameRegistry;

public final class MoreDyeablesCrafting {

	public static final void init() {
		initGlowstoneRecipes();
	}

	private static void initGlowstoneRecipes() {
		// In DV order, skip 11 because glowstone is yellow
		// Block recipes
		GameRegistry
				.addRecipe(new ItemStack(MoreDyeablesBlocks.blackGlowstone),
						new Object[] { "##", "##", '#',
								MoreDyeablesItems.blackGlowstoneDust });
		
		GameRegistry.addRecipe(new ItemStack(MoreDyeablesBlocks.redGlowstone),
				new Object[] { "##", "##", '#',
						MoreDyeablesItems.redGlowstoneDust });
		
		GameRegistry
				.addRecipe(new ItemStack(MoreDyeablesBlocks.greenGlowstone),
						new Object[] { "##", "##", '#',
								MoreDyeablesItems.greenGlowstoneDust });
		
		GameRegistry
				.addRecipe(new ItemStack(MoreDyeablesBlocks.brownGlowstone),
						new Object[] { "##", "##", '#',
								MoreDyeablesItems.brownGlowstoneDust });
		
		GameRegistry.addRecipe(new ItemStack(MoreDyeablesBlocks.blueGlowstone),
				new Object[] { "##", "##", '#',
						MoreDyeablesItems.blueGlowstoneDust });
		
		GameRegistry.addRecipe(
				new ItemStack(MoreDyeablesBlocks.purpleGlowstone),
				new Object[] { "##", "##", '#',
						MoreDyeablesItems.purpleGlowstoneDust });
		
		GameRegistry.addRecipe(new ItemStack(MoreDyeablesBlocks.cyanGlowstone),
				new Object[] { "##", "##", '#',
						MoreDyeablesItems.cyanGlowstoneDust });
		
		GameRegistry.addRecipe(new ItemStack(
				MoreDyeablesBlocks.lightGrayGlowstone), new Object[] { "##",
				"##", '#', MoreDyeablesItems.lightGrayGlowstoneDust });
		
		GameRegistry.addRecipe(new ItemStack(MoreDyeablesBlocks.grayGlowstone),
				new Object[] { "##", "##", '#',
						MoreDyeablesItems.grayGlowstoneDust });
		
		GameRegistry.addRecipe(new ItemStack(MoreDyeablesBlocks.pinkGlowstone),
				new Object[] { "##", "##", '#',
						MoreDyeablesItems.pinkGlowstoneDust });
		
		GameRegistry.addRecipe(new ItemStack(MoreDyeablesBlocks.limeGlowstone),
				new Object[] { "##", "##", '#',
						MoreDyeablesItems.limeGlowstoneDust });
		
		GameRegistry.addRecipe(new ItemStack(
				MoreDyeablesBlocks.lightBlueGlowstone), new Object[] { "##",
				"##", '#', MoreDyeablesItems.lightBlueGlowstoneDust });
		
		GameRegistry.addRecipe(new ItemStack(
				MoreDyeablesBlocks.magentaGlowstone), new Object[] { "##",
				"##", '#', MoreDyeablesItems.magentaGlowstoneDust });
		
		GameRegistry.addRecipe(
				new ItemStack(MoreDyeablesBlocks.orangeGlowstone),
				new Object[] { "##", "##", '#',
						MoreDyeablesItems.orangeGlowstoneDust });
		
		GameRegistry
				.addRecipe(new ItemStack(MoreDyeablesBlocks.whiteGlowstone),
						new Object[] { "##", "##", '#',
								MoreDyeablesItems.whiteGlowstoneDust });

		// Dust recipes
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.blackGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 0) });
		
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.redGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 1) });
		
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.greenGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 2) });
		
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.brownGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 3) });
		
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.blueGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 4) });
		
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.purpleGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 5) });
		
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.cyanGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 6) });
		
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.lightGrayGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 7) });
		
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.grayGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 8) });
		
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.pinkGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 9) });
		
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.limeGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 10) });
		
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.lightBlueGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 12) });
		
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.magentaGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 13) });
		
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.orangeGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 14) });
		
		GameRegistry.addShapelessRecipe(new ItemStack(
				MoreDyeablesItems.whiteGlowstoneDust), new Object[] {
				Items.glowstone_dust, new ItemStack(Items.dye, 1, 15) });
	}
}
