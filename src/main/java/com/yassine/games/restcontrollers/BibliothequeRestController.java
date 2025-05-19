package com.yassine.games.restcontrollers;

import com.yassine.games.entities.Bibliotheque;
import com.yassine.games.entities.Game;
import com.yassine.games.service.BibliothequeService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/biblio")
@CrossOrigin
public class BibliothequeRestController {

	@Autowired
    BibliothequeService bibliothequeService;

    @PostMapping("/new")
    public Bibliotheque createBibliotheque(@RequestBody Bibliotheque bibliotheque) {
        return bibliothequeService.createBibliotheque(bibliotheque);
    }

    @GetMapping("/{id}")
    public Bibliotheque getBibliothequeById(@PathVariable Long id) {
        return bibliothequeService.getBibliothequeById(id);
    }

    @GetMapping("/all")
    public List<Bibliotheque> getAllBibliotheques() {
        return bibliothequeService.getAllBibliotheques();
    }

    @PostMapping("/{id}/games")
    public Bibliotheque addGameToBibliotheque(@PathVariable Long id, @RequestBody Game game) {
        return bibliothequeService.addGameToBibliotheque(id, game);
    }

    @DeleteMapping("/{id}/games/{gameId}")
    public Bibliotheque removeGameFromBibliotheque(@PathVariable Long id, @PathVariable Long gameId) {
        return bibliothequeService.removeGameFromBibliotheque(id, gameId);
    }
}
