package com.sk89q.commandbook;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PGMHelper {
	
	// PGM stuff in this file, to make things easier to maintain if PGM changes
	public static final String VANISH_METADATA_KEY = "isVanished";
	

	public static boolean isViewable(Player target, CommandSender sender) {
		return !isVanished(target) || sender.hasPermission("pgm.staff");
	}
	
	public static boolean isVanished(Player player) {
		return player.hasMetadata(VANISH_METADATA_KEY);
	}

}
