package com.yassine.games.service;

import com.yassine.games.entities.Bibliotheque;
import com.yassine.games.entities.Game;

import java.util.List;

public interface BibliothequeService {
    Bibliotheque createBibliotheque(Bibliotheque bibliotheque);
    Bibliotheque getBibliothequeById(Long id);
    List<Bibliotheque> getAllBibliotheques();
    Bibliotheque addGameToBibliotheque(Long bibliothequeId, Game game);
    Bibliotheque removeGameFromBibliotheque(Long bibliothequeId, Long gameId);
}
