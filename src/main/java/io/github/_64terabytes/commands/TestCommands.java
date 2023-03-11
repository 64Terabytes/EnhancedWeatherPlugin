package io.github._64terabytes.commands;

import org.bukkit.ChatColor;
import org.bukkit.WeatherType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }
        Player player = (Player) sender;

        // Set the weather with WeatherType
        if (cmd.getName().equalsIgnoreCase("setweathertype")) {
            if (args.length >= 1) {
                try {
                    WeatherType weather = WeatherType.valueOf(args[0]);
                    player.setPlayerWeather(weather);
                } catch (IllegalArgumentException ex) {
                    player.sendMessage(ChatColor.RED + "Incorrect Use");
                }
            }
            else {
                player.sendMessage(ChatColor.RED + "Incorrect Use");
            }
        }
        return false;
    }
}
