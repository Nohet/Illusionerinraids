package me.nohet.illusionerinraids;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Raider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidSpawnWaveEvent;

import java.util.List;
import java.util.logging.Logger;


public class RaidSpawnWave implements Listener {


    @EventHandler
    public void RaidSpawnWaveEvent(RaidSpawnWaveEvent event) {
        Logger log = Bukkit.getLogger();


        List<Raider> raiders = event.getRaiders();

        int illusionerAmount = PluginSettings.getIllusionerAmount();

        for (int i = 1; i <= illusionerAmount; i++) {
            Raider raider = raiders.get(0);

            Location location = raider.getLocation();

            int randZ = (int)(Math.random() * (15 - 10 + 1)) + 10;
            int randX = (int)(Math.random() * (2 - 1 + 1)) + 1;

            location.setZ(location.getZ() - randZ);
            location.setX(location.getX() - randX);

            log.info(randZ + "x" + randX);

            raider.getWorld().spawnEntity(location, EntityType.ILLUSIONER);

        }


    }
}
