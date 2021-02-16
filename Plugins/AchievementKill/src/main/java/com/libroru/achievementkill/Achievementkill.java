package com.libroru.achievementkill;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Achievementkill extends JavaPlugin {


    public static Achievementkill plugin;

    @Override
    public void onEnable() {

        plugin = this;

        FileConfiguration config = this.getConfig();
        config.addDefault("chance", 25);
        config.options().copyDefaults(true);
        saveConfig();

        getServer().broadcastMessage(String.valueOf(config.getInt("chance")));

        getServer().getPluginManager().registerEvents(new Achievementlistener(), this);
    }

    @Override
    public void onDisable() {

    }
}
