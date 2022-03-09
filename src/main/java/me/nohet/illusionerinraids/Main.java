package me.nohet.illusionerinraids;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;


public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new RaidSpawnWave(), this);

        Logger log = Bukkit.getLogger();
        log.info("""
                  
                  ___ _ _           _                      ___       ____       _     _    \s
                 |_ _| | |_   _ ___(_) ___  _ __   ___ _ _|_ _|_ __ |  _ \\ __ _(_) __| |___\s
                  | || | | | | / __| |/ _ \\| '_ \\ / _ \\ '__| || '_ \\| |_) / _` | |/ _` / __|
                  | || | | |_| \\__ \\ | (_) | | | |  __/ |  | || | | |  _ < (_| | | (_| \\__ \\
                 |___|_|_|\\__,_|___/_|\\___/|_| |_|\\___|_| |___|_| |_|_| \\_\\__,_|_|\\__,_|___/
                                                                                           \s
                """.indent(1));
        log.info("Plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Logger log = Bukkit.getLogger();
        log.info("""
                  
                  ___ _ _           _                      ___       ____       _     _    \s
                 |_ _| | |_   _ ___(_) ___  _ __   ___ _ _|_ _|_ __ |  _ \\ __ _(_) __| |___\s
                  | || | | | | / __| |/ _ \\| '_ \\ / _ \\ '__| || '_ \\| |_) / _` | |/ _` / __|
                  | || | | |_| \\__ \\ | (_) | | | |  __/ |  | || | | |  _ < (_| | | (_| \\__ \\
                 |___|_|_|\\__,_|___/_|\\___/|_| |_|\\___|_| |___|_| |_|_| \\_\\__,_|_|\\__,_|___/
                                                                                           \s
                """.indent(1));
        log.info("Plugin has been disabled!");
    }
}
