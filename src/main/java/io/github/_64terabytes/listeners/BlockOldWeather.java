package io.github._64terabytes.listeners;


import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

import static org.bukkit.Bukkit.getServer;

public class BlockOldWeather implements Listener {
    @EventHandler
    public void onRain(WeatherChangeEvent e) {
        if(e.toWeatherState()) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void command(PlayerCommandPreprocessEvent e) {
        if(e.getMessage().startsWith("/weather")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(ChatColor.RED + "Default Minecraft weather is disabled with Enhanced Weather running");
        }
    }
}
