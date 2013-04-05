package com.shadowblox.sw123.ShadowShopping.Shop;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;

public class ShopNPC {
	private String name = ChatColor.GREEN + "Sgt_Tailor";
	private Location loc;
	private Villager entity;
	
	public ShopNPC(Location loc){
		this.loc = loc;
	}
	
	public void spawn(){
		if(entity != null){
			entity.setHealth(0);
		}
		Villager npc = (Villager) loc.getWorld().spawnEntity(loc, EntityType.VILLAGER);
		npc.setCustomName(name);
		npc.setCustomNameVisible(true);
		entity = npc;
	}
	public Villager getEntity(){
		return entity;
	}
	

}
