package com.shadowblox.sw123.ShadowShopping.Shop;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;

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
		createDisplayItem();
	}	
	private void createDisplayItem() {
		displayItem = soldItem;
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GOLD + "price:" + ChatColor.GREEN + " $"+ Integer.toString(price));
		lore.add(ChatColor.GOLD + "in stock: " + ChatColor.GREEN + Integer.toString(inStock));
		displayItem.getItemMeta().setDisplayName(name);
		displayItem.getItemMeta().setLore(lore);
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
