package com.handson.sqllite.resource;

import com.handson.sqllite.models.Artistas;
import com.handson.sqllite.service.ArtistaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author silas.silva
 * @since 26/05/18
 */
@RestController
@RequestMapping("artista")
public class ArtistaResource {

    private final ArtistaService artistaService;

    public ArtistaResource(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Artistas>> findAll() {
        return new ResponseEntity<>(this.artistaService.findAll(), HttpStatus.OK);
    }
}
