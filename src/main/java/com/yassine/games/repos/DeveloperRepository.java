package com.yassine.games.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yassine.games.entities.Developer;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
	List<Developer> findByName(String name);
    List<Developer> findByCountry(String country);
}