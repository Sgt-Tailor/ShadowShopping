package com.shadowblox.sw123.ShadowShopping.Shop;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ShopInventory{
	private Inventory inv;
	private ArrayList<ShopItem> items = new ArrayList<ShopItem>();
	public ShopInventory(){
		inv = Bukkit.createInventory(null, 10);
	}
	public boolean addItem(ItemStack item, int price){
		item.setAmount(1);//just to make sure
		if(!inv.contains(item)){
			ShopItem shopItem = new ShopItem(item, price);
			items.add(shopItem);
			update();
		}
		return false;
	}
	public void update(){
		inv.clear();
		for(ShopItem item: items){
			inv.addItem(item.getDisplayItem());
		}
	}
	public ItemStack getDisplayItem(int slot){
		return inv.getItem(slot);
	}
	public ItemStack getRealItem(int slot){
		ItemStack a = inv.getItem(slot);
		for(ShopItem i : items){
			if(i.getDisplayItem().equals(a)){
				return i.getItem();
			}
		}
		return null;
	}


}
