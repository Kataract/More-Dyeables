/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.02, 8/31/14
 */
package com.kataract.moredyeables;

import com.kataract.moredyeables.block.MoreDyeablesBlocks;
import com.kataract.moredyeables.crafting.MoreDyeablesCrafting;
import com.kataract.moredyeables.item.MoreDyeablesItems;
import com.kataract.moredyeables.world.MoreDyeablesWorldGenerator;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		MoreDyeablesItems.init();
		MoreDyeablesBlocks.init();
		MoreDyeablesCrafting.init();
		
		GameRegistry.registerWorldGenerator(new MoreDyeablesWorldGenerator(), 1);
	}

	public void init(FMLInitializationEvent e) {

	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
