package com.shadowblox.sw123.ShadowShopping.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.shadowblox.sw123.ShadowShopping.ShadowShopping;
import com.shadowblox.sw123.ShadowShopping.Shop.Shop;
import com.shadowblox.sw123.ShadowShopping.korikutils.SubCommandExecutor;




public class ShadowShopCommand extends SubCommandExecutor{
	
	@command
	public void shop(CommandSender sender, String[] args){//shadowshopper shop create 
		if(args.length >= 1){
			if(args[0].equalsIgnoreCase("create")){
				Shop s = new Shop(((Player) sender).getLocation());
				ShadowShopping.getInstance().getShopManager().addShop(s);
			}
		}
	}


}
