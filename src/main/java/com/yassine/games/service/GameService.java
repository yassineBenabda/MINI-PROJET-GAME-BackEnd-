package com.yassine.games.service;

import java.util.List;
import com.yassine.games.entities.Game;
import com.yassine.games.entities.Genre;

public interface GameService {
	  Game saveGame(Game g); 
	  Game updateGame(Game g); 
	  void deleteGame(Game g); 
	  void deleteGameById(Long id); 
	  Game getGame(Long id); 
	  List<Game> getAllGames();
	  List<Game> findByNomGame(String nom);
	  List<Game> findByNomGameContains(String nom);
	  List<Game> findByNomPrix (String nom, Double prix);
	  List<Game> findByGenre (Genre genre);
	  List<Game> findByGenreIdGenre(Long id);
	  List<Game> findByOrderByNomGameAsc();
	  List<Game> trierGamesNomsPrix();
}