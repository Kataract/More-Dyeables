/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.01, 8/26/14
 */
package com.kataract.moredyeables.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.kataract.moredyeables.Main;

public class DyedGlowstoneDust extends Item {

	private String type;
	public IIcon[] icons;
	
	public DyedGlowstoneDust(String unlocalizedName) {
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		
		if(unlocalizedName.equals("glowstone_dust")) {
			type = "glowstone_dust";
			icons = new IIcon[16];
		}
		if(unlocalizedName.equals("neon_glowstone_dust")) {
			type = "neon_glowstone_dust";
			icons = new IIcon[6];
		}
	}
	
	@Override
	public void registerIcons(IIconRegister reg) {
		for(int i = 0; i < icons.length; i++) {
			this.icons[i] = reg.registerIcon(Main.MODID + ":" + type + "_" + i);
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
