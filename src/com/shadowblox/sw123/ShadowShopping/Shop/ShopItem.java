package com.shadowblox.sw123.ShadowShopping.Shop;



import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ShopItem {
	// shop
	private int inStock;
	private int price;
	private String name;
	
	// item
	private ItemStack soldItem;
	private ItemStack displayItem;
	
	public ShopItem(ItemStack item, int price){
		item.setAmount(1);//just in case
		soldItem = item;
		name = item.getItemMeta().getDisplayName();
		createDisplayItem();
	}	
	private void createDisplayItem() {
		displayItem = soldItem;
		ItemMeta im = displayItem.getItemMeta();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GOLD + "price: " + ChatColor.GREEN + Integer.toString(price) + " blox");
		lore.add(ChatColor.GOLD + "in stock: " + ChatColor.GREEN + Integer.toString(inStock));
		im.setLore(lore);
		displayItem.setItemMeta(im);
		Bukkit.broadcastMessage(displayItem.getItemMeta().getLore().get(0));
	}
	public ItemStack getItem(){
		return soldItem;
	}
	public ItemStack getDisplayItem(){
		return displayItem;
	}
	public int getPrice(){
		return price;
	}
	public int getInStock(){
		return inStock;
	}
	public String getName(){
		return name;
	}
}
