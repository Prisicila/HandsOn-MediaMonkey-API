package com.handson.sqllite.service;

import com.handson.sqllite.models.Music;
import com.handson.sqllite.repository.MusicRepository;
import org.springframework.stereotype.Service;

@Service
public class MusicService {
	
    private final MusicRepository musicRepository;

    public MusicService(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    public Iterable<Music> findAll() {
        return this.musicRepository.findAll();
    }
}
