/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.01, 8/26/14
 */
package com.kataract.moredyeables.block.metablock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class NeonGlowstoneMetaBlock extends ItemBlockWithMetadata {

	public NeonGlowstoneMetaBlock(Block block) {
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
		default:
			return this.getUnlocalizedName();
		}
	}
}
