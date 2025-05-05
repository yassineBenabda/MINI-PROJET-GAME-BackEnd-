package com.yassine.games.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Developer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDeveloper;
	private String name;
	private String country;

	@OneToMany(mappedBy = "developer")
	@JsonIgnore
	private List<Game> games;
}
