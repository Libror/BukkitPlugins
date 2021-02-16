package com.libroru.achievementkill;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;


import java.util.Random;

public class Achievementlistener implements Listener {

    FileConfiguration config = Achievementkill.plugin.getConfig();

    @EventHandler
    public void onAchievementGet(PlayerAdvancementDoneEvent event) {

        int chanceFromConfig = config.getInt("chance");

        int random = new Random().nextInt(100);

        if (random <= chanceFromConfig) {
            event.getPlayer().setHealth(0);
        }
    }
}
