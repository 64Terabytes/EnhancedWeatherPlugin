package io.github._64terabytes.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Particle;
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

        // Set the weather for an individual player with WeatherType
        if (cmd.getName().equalsIgnoreCase("setweathertype")) {
            if (args.length >= 1) {
                try {
                    WeatherType weather = WeatherType.valueOf(args[0].toUpperCase());
                    player.setPlayerWeather(weather);
                } catch (IllegalArgumentException ex) {
                    player.sendMessage(ChatColor.RED + "Incorrect Use");
                }
            }
            else {
                player.sendMessage(ChatColor.RED + "Entered values was not valid");
            }
        }

        // Place a particle
        else if (cmd.getName().equalsIgnoreCase("placeparticle")) {
            if (args.length >= 5) {
                try {
                    int x = Integer.parseInt(args[1]);
                    int y = Integer.parseInt(args[2]);
                    int z = Integer.parseInt(args[3]);
                    int pcount = Integer.parseInt(args[4]);

                    player.spawnParticle(Particle.valueOf(args[0].toUpperCase()), x, y, z, pcount);

                }
                catch (IllegalArgumentException e) {
                    player.sendMessage(ChatColor.RED + "Entered values was not valid");
                }
            }
            else {
                player.sendMessage(ChatColor.RED + "Incorrect Use");
            }
        }

        // Place a circle of particles
        else if (cmd.getName().equalsIgnoreCase("particlecircle")) {
            if (args.length >= 5) {
                try {
                    int x = Integer.parseInt(args[1]);
                    int y = Integer.parseInt(args[2]);
                    int z = Integer.parseInt(args[3]);
                    int size = Integer.parseInt(args[4]);
                    player.spawnParticle(Particle.valueOf(args[0].toUpperCase()), x, y, z, 1);


                    for (int d = 0; d <= 90; d += 1) {
                        Location particleLoc = new Location(player.getWorld(), x, y, z);
                        particleLoc.setX(x + Math.cos(d) * size);
                        particleLoc.setZ(z + Math.sin(d) * size);
                        player.spawnParticle(Particle.valueOf(args[0].toUpperCase()), particleLoc, 1,  5);
                    }

                }
                catch (IllegalArgumentException e) {
                    player.sendMessage(ChatColor.RED + "Entered values was not valid");
                }
            }
            else {
                player.sendMessage(ChatColor.RED + "Incorrect Use");
            }
        }

        return true;
    }
}
