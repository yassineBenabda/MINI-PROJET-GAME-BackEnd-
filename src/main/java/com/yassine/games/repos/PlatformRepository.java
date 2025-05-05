package com.yassine.games.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yassine.games.entities.Platform;

public interface PlatformRepository extends JpaRepository<Platform, Long> {
	List<Platform> findByName(String name);
    List<Platform> findByManufacturer(String manufacturer);
}