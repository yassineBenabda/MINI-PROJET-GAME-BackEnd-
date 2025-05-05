package com.yassine.games.service;

import java.util.List;
import com.yassine.games.entities.Genre;

public interface GenreService {
    Genre saveGenre(Genre genre);
    Genre updateGenre(Genre genre);
    void deleteGenre(Genre genre);
    void deleteGenreById(Long id);
    Genre getGenre(Long id);
    List<Genre> getAllGenres();
}
