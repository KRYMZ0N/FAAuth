package me.krymz0n.faauth.listener;

import com.destroystokyo.paper.event.player.PlayerTeleportEndGatewayEvent;
import me.krymz0n.faauth.FAAuth;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class Portal implements Listener {
    private final FAAuth plugin;

    public Portal(FAAuth plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPortal(PlayerTeleportEndGatewayEvent evt) {
        evt.setCancelled(true);
    }
}
