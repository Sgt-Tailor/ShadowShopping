package com.shadowblox.sw123.ShadowShopping.Managers;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Villager;

import com.shadowblox.sw123.ShadowShopping.Shop.Shop;

public class ShopManager {
	private ArrayList<Shop> shops = new ArrayList<Shop>();

	public void addShop(Shop s) {
		shops.add(s);
	}

	public Shop getShop(Location location) {
		Location loc;
		for (Shop s : shops) {
			loc = s.getLocation();
			if (loc.distance(location) == 0.0) {
				return s;
			}
		}
		return null;
	}

	public Shop getShop(Villager npc) {
		for (Shop s : shops) {
			if (s.getEntity() != null) {

				if (s.getEntity().equals(npc)) {
					return s;
				}
			}
			else{
				Bukkit.broadcastMessage("fuuu");
			}
		}
		return null;
	}

}
