package io.github._64terabytes;

import io.github._64terabytes.commands.TestCommands;
import io.github._64terabytes.listeners.BlockOldWeather;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class enhancedweatherplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // bStats
        Metrics metrics = new Metrics(this, 18143);

        // Plugin startup logic
        saveDefaultConfig();
        FileConfiguration config = this.getConfig();


        TestCommands commands = new TestCommands();
        getServer().getPluginManager().registerEvents(new BlockOldWeather(), this);
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
