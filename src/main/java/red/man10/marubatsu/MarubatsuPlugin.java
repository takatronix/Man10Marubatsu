package red.man10.marubatsu;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
import red.man10.VaultManager;

import java.util.Random;

public final class MarubatsuPlugin extends JavaPlugin implements Listener {
    VaultManager vault = null;
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents (this,this);
        getCommand("mbatsu").setExecutor(new MarubatsuCommand(this));
        vault = new VaultManager(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
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
