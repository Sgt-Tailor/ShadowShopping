package com.shadowblox.sw123.ShadowShopping.Managers;

import com.shadowblox.sw123.ShadowShopping.ShadowShopping;
import com.shadowblox.sw123.ShadowShopping.commands.ShadowShoppingCommand;



public class CommandManager {
	private ShadowShoppingCommand ssc;
	
	public CommandManager(){
		ssc = new ShadowShoppingCommand();
	}
	public void initCommands(){
		ShadowShopping.getInstance().getCommand("shadowshopping").setExecutor(ssc);
	}
	
	

}
