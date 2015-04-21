package nl.galaxias.chatplaceholders;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by wdele on 21-04-15.
 */
public class ChatPlaceholders extends JavaPlugin {
    private static Plugin plugin;

    public void onEnable() {
        plugin = this;

        registerEvents(this, new AsyncPlayerChatListener());
    }

    public void onDisable() {
        plugin = null;
    }

    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
        for (Listener listener : listeners) {
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }
}