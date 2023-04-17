//package io.github._64terabytes.commands;
//
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
//
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
