package org.evlis.autoStop;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AutoStop extends JavaPlugin {

    @Override
    public void onEnable() {

        // Schedule task for 3-seconds post-startup
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable(){
            @Override
            public void run(){
                // Gracefully stop the server with a 10 second delay.
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "stop");
            }
        }, 60L);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
