package me.nohet.illusionerinraids;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Raider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidSpawnWaveEvent;

import java.util.List;


public class RaidSpawnWave implements Listener {


    @EventHandler
    public void RaidSpawnWaveEvent(RaidSpawnWaveEvent event) {
        List<Raider> raiders = event.getRaiders();

        Raider raider = raiders.get(0);
        Location location = raider.getLocation();
        location.setZ(location.getZ() - 10);

        raider.getWorld().spawnEntity(location, EntityType.ILLUSIONER);

    }
}
