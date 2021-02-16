package com.libroru.instantdeath;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Instantdeath extends JavaPlugin {

    @Override
    public void onEnable() {

        for (Player player : Bukkit.getOnlinePlayers()) {
            player.setMaxHealth(1);
            player.setHealth(1);
        }
    }

    @Override
    public void onDisable() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.setMaxHealth(20);
            player.setHealth(20);
        }
    }
}
