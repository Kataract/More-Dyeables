/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.01, 8/26/14
 */
package com.kataract.moredyeables.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import com.kataract.moredyeables.Main;
import com.kataract.moredyeables.item.MoreDyeablesItems;

public class GlowstoneBlock extends Block {
	
	public IIcon[] icons;

	protected GlowstoneBlock(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(0.3F);
		this.setResistance(0.5F);
		this.setLightLevel(1.0F);
		this.setStepSound(soundTypeGlass);
		
		if(unlocalizedName.equals("glowstone")) {
			icons = new IIcon[16];
		}
		if(unlocalizedName.equals("neon_glowstone")) {
			icons = new IIcon[6];
		}
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for(int i = 0; i < icons.length; i++) {
			this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
		}
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		if(meta > (icons.length - 1)) meta = 0;
		return this.icons[meta];
	}
	
	@Override
	public int damageDropped(int meta) {
		return meta;
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for(int i = 0; i < icons.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		// Return the item associated with the block
		int dotIndex = this.getUnlocalizedName().indexOf('.') + 1;
		String name = this.getUnlocalizedName().substring(dotIndex);
		name = "item." + name + "_dust";
		return MoreDyeablesItems.getItemFromUnlocalizedName(name);
	}

	// Glowstone functionality
	// 'fortune' is a guess.  Deobfuscation is impossible.
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return MathHelper.clamp_int(this.quantityDropped(random) + random.nextInt(fortune + 1), 1, 4);
	}

	@Override
	public int quantityDropped(Random random) {
		return 2 + random.nextInt(3);
	}
}
