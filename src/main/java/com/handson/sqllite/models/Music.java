package com.handson.sqllite.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "Musicas")
public class Music {
	@Id
	private String id;
	
	private String nome;
	
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ArtistaId")
    private Artist artist;

    public Music() {
    	super();
    }
    
    public Music(String id, String nome, Artist artist) {
    	this.id = id;
    	this.text = text;
    	this.artist = artist;
    }
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Artist getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
}