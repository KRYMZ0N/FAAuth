package me.krymz0n.faauth;

import me.krymz0n.faauth.listener.Join;
import me.krymz0n.faauth.listener.Move;
import me.krymz0n.faauth.listener.Portal;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class FAAuth extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        PluginManager plugman = getServer().getPluginManager();

        plugman.registerEvents(this, this);
        plugman.registerEvents(new Join(this), this);
        plugman.registerEvents(new Move(this), this);
        plugman.registerEvents(new Portal(this), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
