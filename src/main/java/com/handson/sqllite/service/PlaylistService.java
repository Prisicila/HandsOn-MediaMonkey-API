package com.handson.sqllite.service;

import com.handson.sqllite.models.Playlists;
import com.handson.sqllite.repository.PlaylistRepository;

public class PlaylistService {
    private final PlaylistRepository  playlistRepository;

    public PlaylistService(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }

    public Iterable<Playlists> findAll() {
        return this.playlistRepository.findAll();
    }
}
