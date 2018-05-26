package com.handson.sqllite.service;

import com.handson.sqllite.models.Artist;
import com.handson.sqllite.repository.ArtistRepository;
import org.springframework.stereotype.Service;

/**
 * @author silas.silva
 * @since 26/05/18
 */
@Service
public class ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public Iterable<Artist> findAll() {
        return this.artistRepository.findAll();
    }
}
