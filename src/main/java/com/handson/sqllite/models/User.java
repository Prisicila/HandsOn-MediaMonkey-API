package com.handson.sqllite.models;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class User {

    @Id
    @GeneratedValue
    private String id;

    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PlaylistId")
    private Playlists playlists;

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Playlists getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Playlists playlists) {
        this.playlists = playlists;
    }
}
