package com.yassine.games.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.yassine.games.entities.Genre;
import com.yassine.games.service.GenreService;

@RestController
@RequestMapping("/api/genre")
@CrossOrigin("*")
public class GenreRESTController {

    @Autowired
    GenreService genreService;

    @GetMapping
    public List<Genre> getAllGenres() {
        return genreService.getAllGenres();
    }

    @GetMapping("/{id}")
    public Genre getGenreById(@PathVariable("id") Long id) {
        return genreService.getGenre(id);
    }

    @PostMapping("/add")
    public Genre createGenre(@RequestBody Genre genre) {
        return genreService.saveGenre(genre);
    }

    @PutMapping("/update")
    public Genre updateGenre(@RequestBody Genre genre) {
        return genreService.updateGenre(genre);
    }

    @DeleteMapping("/delete")
    public void deleteGenre(@RequestBody Genre genre) {
        genreService.deleteGenre(genre);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGenreById(@PathVariable("id") Long id) {
        genreService.deleteGenreById(id);
    }
}
