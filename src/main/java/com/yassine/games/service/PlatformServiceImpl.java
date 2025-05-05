package com.yassine.games.service;

import com.yassine.games.entities.Platform;
import com.yassine.games.repos.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlatformServiceImpl {

    @Autowired
    private PlatformRepository platformRepository;

    // Get all platforms
    public List<Platform> getAllPlatforms() {
        return platformRepository.findAll();
    }

    // Get a platform by ID
    public Platform getPlatform(Long id) {
    	return platformRepository.findById(id).get();
    }

    // Create or update a platform
    public Platform savePlatform(Platform platform) {
        return platformRepository.save(platform);
    }

    // Update a platform (if already exists, save will update it)
    public Platform updatePlatform(Platform platform) {
        return platformRepository.save(platform);
    }

    // Delete a platform by ID
    public void deletePlatformById(Long id) {
        platformRepository.deleteById(id);
    }
}
