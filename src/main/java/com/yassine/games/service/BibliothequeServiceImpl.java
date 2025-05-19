package com.yassine.games.service;

import com.yassine.games.entities.Bibliotheque;
import com.yassine.games.entities.Game;
import com.yassine.games.repos.BibliothequeRepository;
import com.yassine.games.repos.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BibliothequeServiceImpl implements BibliothequeService {

    private final BibliothequeRepository bibliothequeRepository;
    private final GameRepository gameRepository;

    @Override
    public Bibliotheque createBibliotheque(Bibliotheque bibliotheque) {
        return bibliothequeRepository.save(bibliotheque);
    }

    @Override
    public Bibliotheque getBibliothequeById(Long id) {
        return bibliothequeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Bibliotheque> getAllBibliotheques() {
        return bibliothequeRepository.findAll();
    }

    @Override
    public Bibliotheque addGameToBibliotheque(Long bibliothequeId, Game game) {
        Bibliotheque biblio = getBibliothequeById(bibliothequeId);
        if (biblio != null) {
            Game savedGame = gameRepository.save(game);
            biblio.getGames().add(savedGame);
            return bibliothequeRepository.save(biblio);
        }
        return null;
    }

    @Override
    public Bibliotheque removeGameFromBibliotheque(Long bibliothequeId, Long gameId) {
        Bibliotheque biblio = getBibliothequeById(bibliothequeId);
        if (biblio != null) {
            biblio.getGames().removeIf(game -> game.getIdGame().equals(gameId));
            return bibliothequeRepository.save(biblio);
        }
        return null;
    }
}
