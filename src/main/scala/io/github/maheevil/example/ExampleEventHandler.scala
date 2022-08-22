package io.github.maheevil.example

import org.bukkit.event.player.PlayerCommandPreprocessEvent
import org.bukkit.event.{EventHandler, Listener}

object ExampleEventHandler extends Listener{
  @EventHandler
  def preComm(commandPreprocessEvent: PlayerCommandPreprocessEvent): Unit = {
    if(commandPreprocessEvent.getMessage.contains("example")){
      commandPreprocessEvent.getPlayer.sendMessage("hey");
    }
  }
}
