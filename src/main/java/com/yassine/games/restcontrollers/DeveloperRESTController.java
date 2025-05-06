package com.yassine.games.restcontrollers;

import com.yassine.games.entities.Developer;
import com.yassine.games.service.DeveloperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/developers")
@CrossOrigin
public class DeveloperRESTController {

    @Autowired
    private DeveloperServiceImpl developerService;

    // Get all developers
    @GetMapping("/all")
    public List<Developer> getAllDevelopers() {
        return developerService.getAllDevelopers();
    }

    // Get a developer by ID
    @GetMapping("/getbyid/{id}")
    public Developer getDeveloperById(@PathVariable("id") Long id) {
        return developerService.getDeveloper(id);
    }

    // Create a new developer
    @PostMapping("/adddeveloper")
    public Developer createDeveloper(@RequestBody Developer developer) {
        return developerService.saveDeveloper(developer);
    }

    // Update an existing developer
    @PutMapping("/updatedeveloper")
    public Developer updateDeveloper(@RequestBody Developer developer) {
        return developerService.updateDeveloper(developer);
    }

    // Delete a developer by ID
    @DeleteMapping("/deletedeveloper/{id}")
    public void deleteDeveloper(@PathVariable("id") Long id) {
        developerService.deleteDeveloperById(id);
    }
}
