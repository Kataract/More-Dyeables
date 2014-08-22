/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.00, 8/22/14
 */
package com.kataract.moredyeables.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.kataract.moredyeables.Main;
import com.kataract.moredyeables.item.MoreDyeablesItems;

public class GlowstoneBlock extends Block {

	protected GlowstoneBlock(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(0.3F);
		this.setResistance(0.5F);
		this.setLightLevel(1.0F);
		// No harvest level because it's glowstone and everything can break it
		this.setStepSound(soundTypeGlass);
	}

	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		// Return the item associated with the block
		String name = this.getUnlocalizedName().replace("tile", "item");
		name += "Dust";
		return MoreDyeablesItems.getItemFromUnlocalizedName(name);
	}

	// Glowstone functionality
	// fortune is a guess.  Deobfuscation is impossible.
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return MathHelper.clamp_int(this.quantityDropped(random) + random.nextInt(fortune + 1), 1, 4);
	}

	@Override
	public int quantityDropped(Random random) {
		return 2 + random.nextInt(3);
	}
}
