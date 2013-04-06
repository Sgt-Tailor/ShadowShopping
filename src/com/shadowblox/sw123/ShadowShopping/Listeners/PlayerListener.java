package com.shadowblox.sw123.ShadowShopping.Listeners;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import com.shadowblox.sw123.ShadowShopping.ShadowShopping;
import com.shadowblox.sw123.ShadowShopping.Shop.Shop;

public class PlayerListener implements Listener {

	@EventHandler
	public void onPlayerInteract(PlayerInteractEntityEvent event) {
		if (event.getRightClicked().getType().equals(EntityType.VILLAGER)) {
			Villager vil = (Villager) event.getRightClicked();
			Shop shop = ShadowShopping.getInstance().getShopManager().getShop(vil);
			Player p = event.getPlayer();
			p.openInventory(shop.getInventory());
			event.setCancelled(true);
		}
	}
	@EventHandler onPlayerBuyItem(InventoryClickEvent event){
		
	}

}
