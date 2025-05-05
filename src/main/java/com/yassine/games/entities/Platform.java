package com.yassine.games.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Platform {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPlatform;
	private String name;
	private String manufacturer;

	@ManyToMany(mappedBy = "platforms")
	@JsonIgnore
	private List<Game> games;
}
