package me.nohet.illusionerinraids;

import org.bukkit.configuration.file.FileConfiguration;

public class PluginSettings {
    public static int getIllusionerAmount() {
        FileConfiguration config = Main.getInstance().getConfig();

        return config.getInt("illusionerAmount");
    }
}
