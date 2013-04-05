package com.shadowblox.sw123.ShadowShopping.Shop;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Shop {
	private ShopNPC npc;
	private ShopInventory inventory;
	private Location location;
	
	public Shop(Location loc){
		location = loc;
		npc = new ShopNPC(loc);
		npc.spawn();
		inventory = new ShopInventory();
		ItemStack test = new ItemStack(1);
		test.setType(Material.GLOWSTONE);
		inventory.addItem(test, 2);
	}
	public Location getLocation(){
		return location;
	}
	public Villager getEntity(){
		return npc.getEntity();
	}
	public Inventory getInventory(){
		return inventory.getInventory();
	}
	public boolean hasInStock(ItemStack item, int amount){
		return inventory.contains(item, amount);
		
	}
	public int getPrice(ItemStack item, int amount){
		int price = inventory.getItem(item).getPrice();
		price = price * amount;
		return price;
	}
	public void onPlayerBuyItem(Player p, int slot, int amount){
		//
	}

}
