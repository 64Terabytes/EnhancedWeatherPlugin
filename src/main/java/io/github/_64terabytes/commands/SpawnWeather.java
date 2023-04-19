//package io.github._64terabytes.commands;
//
//import io.github._64terabytes.components.Region;
//import org.bukkit.ChatColor;
//import org.bukkit.Location;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandExecutor;
//import org.bukkit.command.CommandSender;
//import org.bukkit.entity.Player;
//
//
//public class SpawnWeather implements CommandExecutor {
//
//    @Override
//    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
//        if (!(sender instanceof Player)) {
//            sender.sendMessage("Only players can use this command!");
//            return true;
//        }
//        Player player = (Player) sender;
//
//        // Spawn a weather event region
//        if (cmd.getName().equalsIgnoreCase("SpawnWeather")) {
//            if (args.length >= 5) {
//                try {
//                    if (args[0].equalsIgnoreCase("storm")) {
//                        try {
//
//                            int x1 = Integer.parseInt(args[1]);
//                            int z1 = Integer.parseInt(args[2]);
//                            int x2 = Integer.parseInt(args[3]);
//                            int z2 = Integer.parseInt(args[4]);
//
//
//
//
//
//                        }
//
//                    }
//                } catch (IllegalArgumentException ex) {
//                    player.sendMessage(ChatColor.RED + "Incorrect Use");
//                }
//            }
//        }
//
//
////        if (args.length >= 1) {
////            try {
////
////
////
////            }
////            catch (IllegalArgumentException e) {
////                player.sendMessage(ChatColor.RED + "Entered values was not valid");
////            }
////        }
////        else {
////            player.sendMessage(ChatColor.RED + "Invalid command arguments!");
////        }
//    }
//}
