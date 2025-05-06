package com.yassine.games.restcontrollers;

import com.yassine.games.entities.Platform;
import com.yassine.games.service.PlatformServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/platforms")
@CrossOrigin
public class PlatformRESTController {

    @Autowired
    private PlatformServiceImpl platformService;

    // Get all platforms
    @GetMapping("/all")
    public List<Platform> getAllPlatforms() {
        return platformService.getAllPlatforms();
    }

    // Get a platform by ID
    @GetMapping("/getbyid/{id}")
    public Platform getPlatformById(@PathVariable("id") Long id) {
        return platformService.getPlatform(id);
    }

    // Create a new platform
    @PostMapping("/addplatform")
    public Platform createPlatform(@RequestBody Platform platform) {
        return platformService.savePlatform(platform);
    }

    // Update an existing platform
    @PutMapping("/updateplatform")
    public Platform updatePlatform(@RequestBody Platform platform) {
        return platformService.updatePlatform(platform);
    }

    // Delete a platform by ID
    @DeleteMapping("/deleteplatform/{id}")
    public void deletePlatform(@PathVariable("id") Long id) {
        platformService.deletePlatformById(id);
    }
}
