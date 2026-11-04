package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Plugin enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("test")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage("Test command executed!");
            } else {
                sender.sendMessage("This command can only be executed by a player.");
            }
            return true;
        }
        return false;
    }
}