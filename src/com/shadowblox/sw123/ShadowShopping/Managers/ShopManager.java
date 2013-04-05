package com.shadowblox.sw123.ShadowShopping.Managers;

import java.util.ArrayList;

import org.bukkit.Location;

import com.shadowblox.sw123.ShadowShopping.Shop.Shop;

public class ShopManager {
	private ArrayList<Shop> shops = new ArrayList<Shop>();
	
	
	public Shop getShop(Location location){
		Location loc;
		for(Shop s: shops){
			loc = s.getLocation();
			if(loc.equals(location)){
				return s;
			}
		}
		return null;
	}
	
	

}
