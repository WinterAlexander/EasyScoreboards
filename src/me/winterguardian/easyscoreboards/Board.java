package me.winterguardian.easyscoreboards;

import java.util.Collection;

import org.bukkit.entity.Player;

public abstract class Board
{
	public abstract void startDisplay(Player p);
	public abstract void stopDisplay(Player p);
	
	public void startDisplay(Collection<Player> players)
	{
		for(Player p : players)
			this.startDisplay(p);
	}
}
