package com.redspeaks.request;

import com.redspeaks.request.events.Join;
import com.redspeaks.request.events.Quit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Request extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("has been enabled");

        new Join(this);
        new Quit(this);
    }

    @Override
    public void onDisable() {
        getLogger().info("has been disabled");
    }
}
