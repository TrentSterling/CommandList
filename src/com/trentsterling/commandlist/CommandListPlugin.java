package com.trentsterling.commandlist;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandListPlugin extends JavaPlugin implements Listener
{

	public void onEnable()
	{
		super.onEnable();
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent e)
	{
		Player p = e.getPlayer();
		String message = e.getMessage();

		if (message.startsWith("/login"))
		{
			// messageOps("CMD: <" + p.getDisplayName() + "> " + ChatColor.DARK_RED + "LOGGED IN");
			sendHelp(p);
		}
	}

	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3)
	{
		sendHelp(sender);
		// sender.sendMessage("*" + ChatColor.AQUA + "Vote for Ecruos Gaming's Minecraft servers!");
		// sender.sendMessage("*" + ChatColor.AQUA + "Get VoterTokens! Spend them at the market!");
		// sender.sendMessage(ChatColor.GOLD + "More news at " + ChatColor.WHITE + ChatColor.UNDERLINE + "http://ecruos.us/");

		return true;
	}

	private void sendHelp(CommandSender sender)
	{
		// TODO Auto-generated method stub
		sender.sendMessage(ChatColor.AQUA + "========== Command List ==========");

		/*
		 * commandsList.add("sb"); commandsList.add("skyblock"); commandsList.add("help"); commandsList.add("helpop"); commandsList.add("login"); commandsList.add("register");
		 * commandsList.add("ping"); commandsList.add("choon"); commandsList.add("poon"); commandsList.add("tpa"); commandsList.add("tpaccept"); commandsList.add("accept");
		 * commandsList.add("decline"); commandsList.add("reject"); commandsList.add("plotme"); commandsList.add("spawn"); commandsList.add("home");
		 */

		sender.sendMessage("");
		sender.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "--Misc Commands");
		sender.sendMessage("*" + ChatColor.GOLD + "/rules");
		sender.sendMessage("Shows you our rules list");
		sender.sendMessage("*" + ChatColor.GOLD + "/list");
		sender.sendMessage("Shows you players in this server");
		sender.sendMessage("*" + ChatColor.GOLD + "/glist");
		sender.sendMessage("Shows you players in all EG servers!");
		sender.sendMessage("*" + ChatColor.GOLD + "/vote");
		sender.sendMessage("Lists voting websites you can use to get REWARDS!");
		sender.sendMessage("*" + ChatColor.GOLD + "/convert <amount>");
		sender.sendMessage("Convert your cobblestone into shoptokens!!!");

		sender.sendMessage("");
		sender.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "--Teleportation Commands");
		sender.sendMessage("*" + ChatColor.GOLD + "/spawn");
		sender.sendMessage("Teleports you to spawn");
		sender.sendMessage("*" + ChatColor.GOLD + "/market");
		sender.sendMessage("Teleports you to market");
		sender.sendMessage("*" + ChatColor.GOLD + "/tpa <player>");
		sender.sendMessage("Teleport request to player");
		sender.sendMessage("*" + ChatColor.GOLD + "/tpahere <player>");
		sender.sendMessage("Teleport a player to you");
		sender.sendMessage("*" + ChatColor.GOLD + "/accept <player>");
		sender.sendMessage("Accept a teleport request. No player input accepts the most recent request. They stack!");
		sender.sendMessage("*" + ChatColor.GOLD + "/reject <player>");
		sender.sendMessage("Reject a teleport request. No player input rejects the most recent request. They stack!");
		sender.sendMessage("*" + ChatColor.GOLD + "/tptoggle");
		sender.sendMessage("Toggles auto accept/deny, and prompt for teleport requests");

		sender.sendMessage("");
		sender.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "--Island Commands");
		sender.sendMessage("*" + ChatColor.GOLD + "/island or /is");
		sender.sendMessage("Lists all island commands");
		sender.sendMessage("*" + ChatColor.GOLD + "/is create");
		sender.sendMessage("Create island");
		sender.sendMessage("*" + ChatColor.GOLD + "/is info");
		sender.sendMessage("Get island info and party info");
		sender.sendMessage("*" + ChatColor.GOLD + "/is add <player>");
		sender.sendMessage("Add party member");
		sender.sendMessage("*" + ChatColor.GOLD + "/is visit <player>");
		sender.sendMessage("Visit someones island");
		sender.sendMessage("*" + ChatColor.GOLD + "/is expell <player>");
		sender.sendMessage("Kick out a visitor!");

		sender.sendMessage("");
		sender.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "--Chat Commands");
		sender.sendMessage("*" + ChatColor.GOLD + "/g, /l, /a");
		sender.sendMessage("Chat control - (G)lobal, (L)ocal, or (A)dmin");
		sender.sendMessage("*" + ChatColor.GOLD + "/m <player> message");
		sender.sendMessage("Message Player");
		sender.sendMessage("*" + ChatColor.GOLD + "/r message");
		sender.sendMessage("Reply Messaget");
		sender.sendMessage("*" + ChatColor.GOLD + "/ignore <player>");
		sender.sendMessage("Ignore chat from a player");

		sender.sendMessage("");
		sender.sendMessage(ChatColor.DARK_RED + "YOU MUST USE '/G' TO CHAT GLOBALLY! Otherwise we can't hear you!");
		sender.sendMessage(ChatColor.GOLD + "More help at " + ChatColor.WHITE + ChatColor.UNDERLINE + "http://ecruos.us/");

	}
}
