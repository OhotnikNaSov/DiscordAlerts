package sova.discordAlerts;

import org.bukkit.plugin.java.JavaPlugin;
import sova.discordAlerts.Managers.ConfigManager;

public final class DiscordAlerts extends JavaPlugin {
    private ConfigManager configManager;

    @Override
    public void onEnable() {

        // Loading configuration
        this.configManager = new ConfigManager(this);
        this.configManager.reloadConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    // Method for updating config files for all classes
    public void ConfigReload(){

    }
}
