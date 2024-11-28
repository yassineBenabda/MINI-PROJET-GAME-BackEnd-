package com.yassine.games.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

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
	
	public Game() {
		super();
	}
	public Game(String nomGame, Double prixGame, Date datedeSortie, String email) {
		super();
		this.nomGame = nomGame;
		this.prixGame = prixGame;
		this.datedeSortie = datedeSortie;
		this.email = email;
	}
	public Long getIdGame() {
		return idGame;
	}
	public void setIdGame(Long idGame) {
		this.idGame = idGame;
	}
	public String getNomGame() {
		return nomGame;
	}
	public void setNomGame(String nomGame) {
		this.nomGame = nomGame;
	}
	public Double getPrixGame() {
		return prixGame;
	}
	public void setPrixGame(Double prixGame) {
		this.prixGame = prixGame;
	}
	public Date getDatedeSortie() {
		return datedeSortie;
	}
	public void setDatedeSortie(Date datedeSortie) {
		this.datedeSortie = datedeSortie;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Game [idGame=" + idGame + ", nomGame=" + nomGame + ", prixGame=" + prixGame + ", datedeSortie="
				+ datedeSortie + "]";
	}
	
}
