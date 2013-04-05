package com.shadowblox.sw123.ShadowShopping.Shop;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.shadowblox.sw123.ShadowShopping.Managers.PlayerManager;

public class Shop {
	private ShopNPC npc;
	private ShopInventory inventory;
	private Location location;
	
	public Location getLocation(){
		return location;
	}
	public void PlayerBuyItem(Player p, int slot, int amount){
		//PlayerManager.playerCanAfford(p, inventory.)
	}

}
