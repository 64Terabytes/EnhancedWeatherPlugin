package io.github._64terabytes.listeners;

import io.github._64terabytes.components.Region;
import io.github._64terabytes.utils.DelayTask;
import org.bukkit.Location;
import org.bukkit.WeatherType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import static org.bukkit.Bukkit.getServer;

public class WeatherRegionTrigger implements Listener {



    Location loc1 = new Location(getServer().getWorld("world"), -1, 0, 1);
    Location loc2 = new Location(getServer().getWorld("world"), -16, 150, 16);

    Region region = new Region(loc1, loc2);


    // Add a delay in the two if statements
    Boolean weatherChangeDelay = false;
    @EventHandler
    public void onMove(PlayerMoveEvent event) throws InterruptedException {

        Player player = event.getPlayer();

        if (region.contains(player.getLocation())) {
            // player is inside the 2d region
//            player.sendMessage("I am now in the region");
            if (player.getPlayerWeather() != WeatherType.DOWNFALL) {
                player.setPlayerWeather(WeatherType.DOWNFALL);
                new DelayTask(() -> {}, 5 * 20);
            }


        }
        else {
            if (player.getPlayerWeather() != WeatherType.CLEAR) {
                player.setPlayerWeather(WeatherType.CLEAR);
                new DelayTask(() -> {}, 5 * 20);
            }
        }
    }

}