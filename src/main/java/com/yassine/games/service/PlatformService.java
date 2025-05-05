package com.yassine.games.service;

import java.util.List;
import com.yassine.games.entities.Platform;

public interface PlatformService {
    Platform savePlatform(Platform platform);                // Create or update a platform
    Platform updatePlatform(Platform platform);              // Update an existing platform
    void deletePlatform(Platform platform);                  // Delete a platform
    void deletePlatformById(Long id);                        // Delete a platform by ID
    Platform getPlatform(Long id);                           // Get a platform by ID
    List<Platform> getAllPlatforms();                        // Get all platforms
    List<Platform> findByName(String name);                  // Find platforms by name
    List<Platform> findByManufacturer(String manufacturer);   // Find platforms by manufacturer
}
