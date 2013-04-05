package com.shadowblox.sw123.ShadowShopping.Shop;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class ShopNPC {
	private String name;
	private Location loc;
	private Player entity;
	
	public ShopNPC(Location loc){
		this.loc = loc;
	}
	
	public void spawn(){
		if(entity != null){
			entity.setHealth(0);
		}
		Player npc = (Player) loc.getWorld().spawnEntity(loc, EntityType.PLAYER);
		npc.setCustomName(name);
		npc.setCustomNameVisible(true);
	}
	public Player getEntity(){
		return entity;
	}
	

}
