/**
 * More Dyeables Minecraft mod
 * @author Kataract (Kat Passen)
 * @version 1.00, 8/22/14
 */
package com.kataract.moredyeables;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {
	public static final String MODID = "moredyeables";
	public static final String MODNAME = "More Dyeables";
	public static final String VERSION = "1.0.0";

	@Instance
	public static Main instance = new Main();

	@SidedProxy(clientSide = "com.kataract.moredyeables.ClientProxy", serverSide = "com.kataract.moredyeables.ServerProxy")
	public static CommonProxy proxy;

	/**
	 * Run before anything else. Read your config, create blocks, items, etc,
	 * and register them with the GameRegistry.
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	/**
	 * Do your mod setup. Build whatever data structures you care about.
	 * Register recipes.
	 */
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	/**
	 * Handle interaction with other mods, complete your setup based on this.
	 */
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}
