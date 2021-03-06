package com.shadowblox.sw123.ShadowShopping.Shop;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ShopInventory{
	private Inventory inv;
	private ArrayList<ShopItem> items = new ArrayList<ShopItem>();
	public ShopInventory(){
		inv = Bukkit.createInventory(null, 54, "derperdiederp");
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
	public ShopItem getItem(int slot){
		if(items.size() >= slot){
			return items.get(slot);
		}
		return null;
	}
	public ShopItem getItem(ItemStack item){
		item.setAmount(1);//just in case
		for(ShopItem i : items){
			if(i.getItem().equals(item)){
				return i;
			}
		}
		return null;
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
	public boolean contains(ItemStack item, int amount){
		item.setAmount(1);//just to make sure
		for(ShopItem sItem : items){
			if(sItem.getItem().equals(item)){
				if(sItem.getInStock() >= amount){
					return true;
				}
				return false;
			}
		}
		return false;
	}
	public Inventory getInventory(){
		return inv;
	}


}
