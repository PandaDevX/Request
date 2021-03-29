package com.redspeaks.request.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Join implements Listener {

    public Join(JavaPlugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        final Player player = e.getPlayer();

        if(player.hasPlayedBefore()) {
            player.sendMessage(colorize("&2INFO &fWelcome &c" + player.getDisplayName()));
            player.sendMessage(colorize("&2INFO &fCheck rules using &c/rules &ffor server rules"));
            player.sendMessage(colorize("&2INFO &fEnjoy your stay"));
        }

        e.setJoinMessage("&7Welcome to the server &6" + player.getName());
    }

    public String colorize(String txt) {
        return ChatColor.translateAlternateColorCodes('&', txt);
    }
}
