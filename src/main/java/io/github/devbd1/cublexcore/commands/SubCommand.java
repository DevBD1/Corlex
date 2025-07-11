package io.github.devbd1.cublexcore.commands;

import org.bukkit.command.CommandSender;
import java.util.List;

public interface SubCommand {
    String name();
    String permission();
    boolean execute(CommandSender sender, String[] args);
    List<String> tabComplete(CommandSender sender, String[] args);

    // 🆕 optional metadata
    default String description() {
        return "No description provided.";
    }

    default String usage() {
        return "/" + name();
    }
}

