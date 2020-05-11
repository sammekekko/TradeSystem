package me.sammekekko.tradesystem;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("TradeSystem Initializeds");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("TradeSystem has been disabled");
    }
}
