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

    @PostMapping("/addgenre")
    public Genre createGenre(@RequestBody Genre genre) {
        return genreService.saveGenre(genre);
    }

    @PutMapping("/updategenre")
    public Genre updateGenre(@RequestBody Genre genre) {
        return genreService.updateGenre(genre);
    }

    @DeleteMapping("/deletegenre")
    public void deleteGenre(@RequestBody Genre genre) {
        genreService.deleteGenre(genre);
    }

    @DeleteMapping("/deletegenre/{id}")
    public void deleteGenreById(@PathVariable("id") Long id) {
        genreService.deleteGenreById(id);
    }
}
