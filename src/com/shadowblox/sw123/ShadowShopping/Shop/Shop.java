package com.shadowblox.sw123.ShadowShopping.Shop;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Shop {
	private ShopNPC npc;
	private ShopInventory inventory;
	private Location location;
	
	public Shop(Location loc){
		location = loc;
		npc = new ShopNPC(loc);
		npc.spawn();
	}
	public Location getLocation(){
		return location;
	}
	public Player getEntity(){
		return npc.getEntity();
	}
	public boolean hasInStock(ItemStack item, int amount){
		return inventory.contains(item, amount);
		
	}
	public int getPrice(ItemStack item, int amount){
		
		return -1;
	}
	public void onPlayerBuyItem(Player p, int slot, int amount){
		//
	}

}
