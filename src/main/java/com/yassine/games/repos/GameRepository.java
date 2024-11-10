package com.yassine.games.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.yassine.games.entities.Game;
import com.yassine.games.entities.Genre;

@RepositoryRestResource(path = "rest")

public interface GameRepository extends JpaRepository<Game, Long> {
	List<Game> findByNomGame(String nom);
	List<Game> findByNomGameContains(String nom);
		
	@Query("select g from Game g where g.nomGame like %?1 and g.prixGame > ?2")
	List<Game> findByNomPrix (String nom, Double prix);
	
	@Query("select g from Game g where g.genre = ?1")
	List<Game> findByGenre (Genre genre);
	
	List<Game> findByGenreIdGenre(Long id);
	
	List<Game> findByOrderByNomGameAsc();
	
	@Query("select g from Game g order by g.nomGame ASC, g.prixGame ASC")
	List<Game> trierGamesNomsPrix();
}