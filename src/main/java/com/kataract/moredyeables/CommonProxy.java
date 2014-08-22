/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.00, 8/22/14
 */
package com.kataract.moredyeables;

import com.kataract.moredyeables.block.MoreDyeablesBlocks;
import com.kataract.moredyeables.crafting.MoreDyeablesCrafting;
import com.kataract.moredyeables.item.MoreDyeablesItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		MoreDyeablesItems.init();
		MoreDyeablesBlocks.init();
		MoreDyeablesCrafting.init();
	}

	public void init(FMLInitializationEvent e) {

	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
