package com.yassine.games.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomGam", types = { Game.class })
public interface GameProjection {
	public String getNomGame();
}