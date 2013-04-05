package com.shadowblox.sw123.ShadowShopping.Managers;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.Entity;

import com.shadowblox.sw123.ShadowShopping.Shop.Shop;

public class ShopManager {
	private ArrayList<Shop> shops = new ArrayList<Shop>();
	
	
	public Shop getShop(Location location){
		Location loc;
		for(Shop s: shops){
			loc = s.getLocation();
			if(loc.distance(location) == 0.0){
				return s;
			}
		}
		return null;
	}
	public Shop getShop(Entity npc){
		Entity ent;
		for(Shop s : shops){
			if(s.getEntity().equals(npc)){
				return s;
			}
		}
		return null;
	}
	
	

}
