package com.shadowblox.sw123.ShadowShopping.Managers;

import com.shadowblox.sw123.ShadowShopping.ShadowShopping;
import com.shadowblox.sw123.ShadowShopping.commands.ShadowShopCommand;



public class CommandManager {
	private ShadowShopCommand ssc;
	
	public CommandManager(){
		ssc = new ShadowShopCommand();
	}
	public void initCommands(){
		ShadowShopping.getInstance().getCommand("shadowshop").setExecutor(ssc);
	}
	
	

}
