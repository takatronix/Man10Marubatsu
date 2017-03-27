package red.man10.marubatsu;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import red.man10.VaultManager;

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
}
