package io.github._64terabytes;

import io.github._64terabytes.commands.TestCommands;
import io.github._64terabytes.components.Region;
import io.github._64terabytes.hooks.Metrics;
import io.github._64terabytes.listeners.BlockOldWeather;
import io.github._64terabytes.listeners.WeatherRegionTrigger;
import io.github._64terabytes.utils.DelayTask;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Bukkit.*;

public final class enhancedweatherplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // bStats
        Metrics metrics = new Metrics(this, 18143);

        // Plugin startup logic
        saveDefaultConfig();

        TestCommands commands = new TestCommands();
        getServer().getPluginManager().registerEvents(new BlockOldWeather(), this);
        getServer().getPluginManager().registerEvents(new WeatherRegionTrigger(), this);

        //Register utils
        new DelayTask(this);

        getCommand("setweathertype").setExecutor(commands);
        getCommand("placeparticle").setExecutor(commands);
        getCommand("particlecircle").setExecutor(commands);








        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[Enhanced Weather] Plugin has started");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[Enhanced Weather] Plugin has stopped");
    }
}
