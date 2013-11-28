package com.github.cob.currency;

import java.util.HashMap;

import com.github.cob.api.COBAPI;

public class Elixir {
	
	private HashMap<String, Integer> elixir = new HashMap<String, Integer>();
	
	public HashMap<String, Integer> getElixir() {
		return this.elixir;
	}
	
	public int getElixir(String player) {
		return (this.elixir.containsKey(player) ? this.elixir.get(player) : -1);
	}
	
	public void setElixir(String player, int gold) {
		this.elixir.put(player, gold);
		COBAPI.updateStats(player);
	}

}
