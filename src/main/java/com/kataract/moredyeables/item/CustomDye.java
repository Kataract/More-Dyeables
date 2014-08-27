/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.01, 8/26/14
 */
package com.kataract.moredyeables.item;

import java.util.List;

import com.kataract.moredyeables.Main;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class CustomDye extends Item {
	
	public IIcon[] icons = new IIcon[7];
	
	public CustomDye(String unlocalizedName) {
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		for(int i = 0; i < icons.length; i++) {
			this.icons[i] = reg.registerIcon(Main.MODID + ":" + "neon_dye_" + i);
		}
	}
	
	@Override
	public IIcon getIconFromDamage(int meta) {
		return this.icons[meta];
	}
	
	@Override public void getSubItems(Item item, CreativeTabs tab, List list) {
		for(int i = 0; i < icons.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
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
		default:
			return this.getUnlocalizedName();
		}
	}
}
