package mcorange.essentialsmco.commands;

import mcorange.essentialsmco.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Hello implements CommandExecutor {

    private Main plugin;
    public Hello(Main plugin){
        this.plugin = plugin;
        plugin.getCommand("hello").setExecutor(this);
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("ERR: Only players can run this command!");
            return true;
        }
        Player player = (Player) sender;

        if (player.hasPermission("hello.use")){
            player.sendMessage("hi!");
            return true;
        } else {
            player.sendMessage("You do not have permission to run this command!");
        }
        return false;
    }
}
