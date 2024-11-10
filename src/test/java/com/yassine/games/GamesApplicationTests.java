 package com.yassine.games;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.yassine.games.entities.Game;
import com.yassine.games.entities.Genre;
import com.yassine.games.repos.GameRepository;

@SpringBootTest
class GamesApplicationTests {
	
	@Autowired 
	private GameRepository gameRepository; 
	
	@Test
	public void testCreateGame() { 
		Game gam = new Game("PC Msi",3000.000,new Date()); 
		gameRepository.save(gam); 
	}
	
	@Test 
	public void testFindGame() {
		Game g = gameRepository.findById(1L).get();     
		System.out.println(g);
	}
	
	@Test 
	public void testUpdateGame() {
		Game g = gameRepository.findById(1L).get();
		g.setPrixGame(2000.0); 
		gameRepository.save(g); 
	}
	
	@Test 
	public void testDeleteGame() { 
		gameRepository.deleteById(1L);
	} 
	 
	@Test 
	public void testListerTousGames() { 
	List<Game>  gams = gameRepository.findAll();   
	for (Game g : gams) { 
	    System.out.println(g); 
	    }   
	}
	
	@Test 
	public void testFindGameByNom() {
		List<Game> gams = gameRepository.findByNomGame("PC Asus");
		for (Game g : gams)
		{
		System.out.println(g);
		}
	}
	
	@Test 
	public void testFindGameByNomContains() {
		List<Game> gams = gameRepository.findByNomGameContains("M");
		for (Game g : gams)
		{
		System.out.println(g);
		}
	}
	
	@Test 
	public void testfindByNomPrix() 
	{
	List<Game> gams = gameRepository.findByNomPrix("PC Asus", 1000.0);
		for (Game g : gams) 
		{
			System.out.println(g);
		}
	}
	
	@Test
	public void testfindByGenre() {
	Genre gen = new Genre();
	gen.setIdGenre(2L);			
	List<Game>  gams = gameRepository.findByGenre(gen);
		for (Game g : gams)
		{
			System.out.println(g);
		}
	 }
	
	@Test
	public void findByGenreIdGenre() {			
	List<Game>  gams = gameRepository.findByGenreIdGenre(1L);
		for (Game g : gams)
		{
			System.out.println(g);
		}
   }
	
	@Test
	public void testfindByOrderByNomGameAsc()
	{
	List<Game>  gams =  gameRepository.findByOrderByNomGameAsc();	 
		for (Game g : gams)
		{
			System.out.println(g);
		}
	 }
	
	@Test
	public void testTrierGamesNomsPrix() {
	List<Game>  gams = gameRepository.trierGamesNomsPrix();	 
		for (Game g : gams)
		{
			System.out.println(g);
		}
	}
}