package me.krymz0n.faauth.listener;

import me.krymz0n.faauth.FAAuth;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Move implements Listener {
    private final FAAuth plugin;

    public Move(FAAuth plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent evt) {
        Player p = evt.getPlayer();
        Location loc = new Location(plugin.getServer().getWorld("world_the_end"), 0, 252, 0); //Teleports player to the end

        p.teleport(loc);
    }
}
