package deityboat.scuffedplugin.deityboat.scuffed.Deityboat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class scuffed extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvent(this, this);
    }

    @EventHandler
    public void onBedLeave(PlayerBedEnterEvent e) {
        Player player = e.getPlayer();

        Bukkit.broadcastMessage(player.getName() + ChatColor.GREEN + " is sleeping...");

    }


    @Override
    public void onDisable() {

    }
}
