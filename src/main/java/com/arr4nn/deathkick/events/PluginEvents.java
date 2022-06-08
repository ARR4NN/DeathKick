package com.arr4nn.deathkick.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PluginEvents implements Listener {
  @EventHandler
  public static void PlayerDeathEvent(PlayerDeathEvent event){
    Player p = event.getEntity();
    p.kickPlayer("You died in the event.");
  }
}