package com.yassine.games.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGame;
	private String nomGame;
	private Double prixGame;
	private Date datedeSortie;
	private String email;

	@ManyToOne
	private Genre genre;

	@ManyToOne
	private Developer developer;

	@ManyToMany
	private List<Platform> platforms;

}
