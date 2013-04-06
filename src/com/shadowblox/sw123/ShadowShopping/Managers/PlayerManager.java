package com.shadowblox.sw123.ShadowShopping.Managers;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PlayerManager {

	public static boolean playerCanAfford(Player p, int price) {
		// do weird vault shit
		return true;
	}

	public static boolean playerHasSpace(Player p, ItemStack item, int amount) {
		Inventory pInv = p.getInventory();
		int space = 0;
		for (ItemStack i : pInv.getContents()) {
			if (i != null) {
				if (i.getMaxStackSize() > 1) {
					if (i.getTypeId() == item.getTypeId()) {
						if (i.getData().equals(item.getData())) {
							if(i.getItemMeta().equals(item.getItemMeta())){//the item should be the same
								int free = i.getMaxStackSize() - i.getAmount();
								space = space + free;
							}
						}
					}
				}
			} else {
				space = space + item.getMaxStackSize();
			}
		}
		if(space >= amount){
			return true;
		}
		else{
			return false;
		}
	}
}
