package eu.ultragaming.UltraGlitchProtection;

import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class MainProtection extends JavaPlugin {
	
    @EventHandler
    public void onInventoryOpenEvent(InventoryOpenEvent e){
    	
        	Inventory sisu = e.getInventory();
        	ItemStack[] asjad = sisu.getContents();
        	for (int i = 0; i < asjad.length; i++) {
				ItemStack kontroll = asjad[i];
				 int maxsuurus = kontroll.getMaxStackSize();
				 int praegunesuurus = kontroll.getAmount();
				 if (praegunesuurus > maxsuurus) {
					 kontroll.setAmount(0);
				 }
				 
			}
        
    }
	
}
