package mcorange.essentialsmco.listener;

import mcorange.essentialsmco.Main;
import mcorange.essentialsmco.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {

    private static Main plugin;
    public Join(Main plugin){
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        if (!player.hasPlayedBefore()){
            Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("firstjoin_message").replace("<player>", player.getName())));
        } else{
            Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("join_message").replace("<player>", player.getName())));
        }

    }

}
