package io.github.maheevil.example

import org.bukkit.plugin.java.JavaPlugin

class ExamplePlugin extends JavaPlugin{

  override def onEnable(): Unit = {
    this.getServer.getPluginManager.registerEvents(ExampleEventHandler, this);
  }

  override def onDisable(): Unit = super.onDisable()
}
