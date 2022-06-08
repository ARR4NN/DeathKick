package com.arr4nn.deathkick;

import com.arr4nn.deathkick.events.PluginEvents;
import org.bukkit.plugin.java.JavaPlugin;

public final class DeathKick extends JavaPlugin {

  @Override
  public void onEnable() {
    getLogger().info("Plugin started.");
    getServer().getPluginManager().registerEvents(new PluginEvents(), this);
    // Plugin startup logic

  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
  }
}
