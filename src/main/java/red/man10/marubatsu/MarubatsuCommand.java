package red.man10.marubatsu;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by takatronix on 2017/03/28.
 */
public class MarubatsuCommand implements CommandExecutor {
    private MarubatsuPlugin plugin;
    public MarubatsuCommand(MarubatsuPlugin plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }
}
