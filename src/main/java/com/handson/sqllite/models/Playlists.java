package com.handson.sqllite.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="playlists")
public class Playlists {

    @Id
    @GeneratedValue
    private String id;

    @JoinTable(name = "PlaylistMusicas",
            joinColumns = @JoinColumn(name = "playlistId"),
            inverseJoinColumns = @JoinColumn(name = "musicaId")
    )
    private List<Music> musics = new ArrayList<>();

    public String getId() {
        return id;
    }

    public Playlists setId(String id) {
        this.id = id;
        return this;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public Playlists setMusics(List<Music> musics) {
        this.musics = musics;
        return this;
    }
}
