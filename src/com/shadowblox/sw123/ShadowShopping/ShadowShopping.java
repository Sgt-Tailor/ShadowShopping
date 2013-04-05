package com.shadowblox.sw123.ShadowShopping;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


import com.shadowblox.sw123.ShadowShopping.Listeners.PlayerListener;
import com.shadowblox.sw123.ShadowShopping.Managers.*;
public class ShadowShopping extends JavaPlugin{
	private CommandManager cmdManager;
	private NPCManager NPCManager;
	private PlayerManager PlayerManager;
	private ShopManager ShopManager;
	private static ShadowShopping instance;
	
	public void onEnable(){
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new PlayerListener(), this);
		initManagers();
		cmdManager.initCommands();
		
		
	}

	private void initManagers() {
		cmdManager = new CommandManager();
		NPCManager = new NPCManager();
		PlayerManager = new PlayerManager();
		ShopManager = new ShopManager();
	}
	public static ShadowShopping getInstance(){
		return instance;
	}
	

}
