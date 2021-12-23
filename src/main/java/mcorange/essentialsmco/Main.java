package mcorange.essentialsmco;

import mcorange.essentialsmco.commands.Hello;
import mcorange.essentialsmco.listener.Join;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        //commands
        new Hello(this);

        //listeners

        new Join(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
