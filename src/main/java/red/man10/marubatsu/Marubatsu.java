package red.man10.marubatsu;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Random;

/**
 * Created by takatronix on 2017/03/28.
 */
public class Marubatsu {
    private MarubatsuPlugin plugin;

    public Marubatsu(MarubatsuPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockClick(PlayerInteractEvent e) {
        
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.LEFT_CLICK_BLOCK) {
            if (e.getClickedBlock().getType() == Material.BONE_BLOCK || e.getClickedBlock().getType() == Material.BONE_BLOCK) {
                Object o = e.getClickedBlock().getState();
                
                if ((o instanceof Sign) == false) {
                    return;
                }

                Sign s = (Sign) e.getClickedBlock().getState();
                Player p = e.getPlayer();
                
                if (s.getLine(1).equalsIgnoreCase("PekeMaru")) {
                    Random ran = new Random();
                    int dice = ran.nextInt( 2 ) + 1;
                    p.sendMessage("Hello Sign!!");
                    p.sendMessage( "aaa" + dice );
                    if( dice == 2){
                        p.sendMessage("あたり");
                        Bukkit.getServer().broadcastMessage("あたり");
                    }else{
                        p.sendMessage("はずれ");
                        Bukkit.getServer().broadcastMessage("はずれ");
                    }
                    return;
                } 

                
            }
        }
    }
}
