package com.handson.sqllite.service;

import com.handson.sqllite.models.Artistas;
import com.handson.sqllite.repository.ArtistaRepository;
import org.springframework.stereotype.Service;

/**
 * @author silas.silva
 * @since 26/05/18
 */
@Service
public class ArtistaService {

    private final ArtistaRepository artistaRepository;

    public ArtistaService(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }

    public Iterable<Artistas> findAll() {
        return this.artistaRepository.findAll();
    }
}
