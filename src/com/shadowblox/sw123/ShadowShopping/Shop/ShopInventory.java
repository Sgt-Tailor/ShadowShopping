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
	public boolean addItem(ItemStack item){
		for(ShopItem si : inv.getContents()){
			//if(si.)
		}
		return false;
	}
	public void updata(){
		inv.clear();
		int i = 0;
		for(ShopItem item: items){
			inv.addItem(item.getDisplayItem());
			i++;
		}
	}


}
