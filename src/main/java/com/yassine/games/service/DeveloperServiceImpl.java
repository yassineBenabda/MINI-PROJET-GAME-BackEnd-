package com.yassine.games.service;

import com.yassine.games.entities.Developer;
import com.yassine.games.repos.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeveloperServiceImpl {

    @Autowired
    private DeveloperRepository developerRepository;

    public List<Developer> getAllDevelopers() {
        return developerRepository.findAll();
    }

    public Developer getDeveloper(Long id) {
    	return developerRepository.findById(id).get(); 
    }

    public Developer saveDeveloper(Developer developer) {
        return developerRepository.save(developer);
    }

    public Developer updateDeveloper(Developer developer) {
        return developerRepository.save(developer);
    }

    public void deleteDeveloperById(Long id) {
        developerRepository.deleteById(id);
    }
}
