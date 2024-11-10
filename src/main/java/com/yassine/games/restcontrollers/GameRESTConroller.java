package com.yassine.games.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yassine.games.entities.Game;
import com.yassine.games.service.GameService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class GameRESTConroller {
	
	@Autowired
	GameService gameService;
	
	@RequestMapping(method=RequestMethod.GET)
	List<Game> getAllGames()
	{
		return gameService.getAllGames();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Game getGameById(@PathVariable("id") Long id) {
		return gameService.getGame(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Game createGame(@RequestBody Game game) {
		return gameService.saveGame(game);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Game updateGame(@RequestBody Game game) {
		return gameService.updateGame(game);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteGame(@PathVariable("id") Long id)
	{
		gameService.deleteGameById(id);
	}
	
	@RequestMapping(value="/gamsgen/{idGenre}",method = RequestMethod.GET)
	public List<Game> getGamesByGenreId(@PathVariable("idGenre") Long idGenre) {
	return gameService.findByGenreIdGenre(idGenre);
	}
}
