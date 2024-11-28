package com.yassine.games.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.yassine.games.entities.Genre;
import com.yassine.games.repos.GenreRepository;

@RestController
@RequestMapping("/api/genre")
@CrossOrigin("*")
public class GenreRESTController {
	
	@Autowired
	GenreRepository genreRepository;
	
	@GetMapping
	public List<Genre> getAllGenres()
	{
		return genreRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Genre getGenreById(@PathVariable("id") Long id) {
	return genreRepository.findById(id).get();
	}
}
