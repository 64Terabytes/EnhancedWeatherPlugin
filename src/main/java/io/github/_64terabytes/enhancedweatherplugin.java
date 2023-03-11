package io.github._64terabytes;

import io.github._64terabytes.commands.TestCommands;
import io.github._64terabytes.listeners.BlockOldWeather;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class enhancedweatherplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        TestCommands commands = new TestCommands();
        getServer().getPluginManager().registerEvents(new BlockOldWeather(), this);
        getCommand("setweathertype").setExecutor(commands);

        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[Enhanced Weather] Plugin has started");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[Enhanced Weather] Plugin has stopped");
    }
}