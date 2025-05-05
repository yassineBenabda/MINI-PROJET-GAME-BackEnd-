package com.yassine.games.service;

import java.util.List;
import com.yassine.games.entities.Developer;

public interface DeveloperService {
    Developer saveDeveloper(Developer developer);            // Create or update a developer
    Developer updateDeveloper(Developer developer);          // Update an existing developer
    void deleteDeveloper(Developer developer);               // Delete a developer
    void deleteDeveloperById(Long id);                       // Delete a developer by ID
    Developer getDeveloper(Long id);                         // Get a developer by ID
    List<Developer> getAllDevelopers();                      // Get all developers
    List<Developer> findByName(String name);                 // Find developers by name
    List<Developer> findByCountry(String country);           // Find developers by country
}
