package sova.discordAlerts.Managers;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import sova.discordAlerts.DiscordAlerts;

import java.io.File;

public class ConfigManager {
    private final DiscordAlerts plugin;
    private final File configFile;
    private FileConfiguration config;

    public ConfigManager(DiscordAlerts plugin) {
        this.plugin = plugin;
        this.configFile = new File(plugin.getDataFolder(), "config.yml");
        createDefaultConfig();
    }

    private void createDefaultConfig() {
        if (!configFile.exists()) {
            plugin.saveResource("config.yml", false);
        }
        this.config = YamlConfiguration.loadConfiguration(configFile);
    }

    public FileConfiguration getConfig() {
        if (this.config == null) {
            reloadConfig();
        }
        return this.config;
    }

    public void reloadConfig() {
        config = YamlConfiguration.loadConfiguration(configFile);

    }
}
