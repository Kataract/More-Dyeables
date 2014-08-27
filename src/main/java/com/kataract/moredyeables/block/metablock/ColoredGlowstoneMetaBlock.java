/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.01, 8/26/14
 */
package com.kataract.moredyeables.block.metablock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ColoredGlowstoneMetaBlock extends ItemBlockWithMetadata {
	
	public ColoredGlowstoneMetaBlock(Block block) {
		super(block, block);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		switch(stack.getItemDamage()) {
		case 0:
			return this.getUnlocalizedName() + "_0";
		case 1:
			return this.getUnlocalizedName() + "_1";
		case 2:
			return this.getUnlocalizedName() + "_2";
		case 3:
			return this.getUnlocalizedName() + "_3";
		case 4:
			return this.getUnlocalizedName() + "_4";
		case 5:
			return this.getUnlocalizedName() + "_5";
		case 6:
			return this.getUnlocalizedName() + "_6";
		case 7:
			return this.getUnlocalizedName() + "_7";
		case 8:
			return this.getUnlocalizedName() + "_8";
		case 9:
			return this.getUnlocalizedName() + "_9";
		case 10:
			return this.getUnlocalizedName() + "_10";
		case 11:
			return this.getUnlocalizedName() + "_11";
		case 12:
			return this.getUnlocalizedName() + "_12";
		case 13:
			return this.getUnlocalizedName() + "_13";
		case 14:
			return this.getUnlocalizedName() + "_14";
		case 15:
			return this.getUnlocalizedName() + "_15";
		default:
			return this.getUnlocalizedName();
		}
	}
}
