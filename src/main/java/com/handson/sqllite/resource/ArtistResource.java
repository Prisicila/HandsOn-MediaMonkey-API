package com.handson.sqllite.resource;

import com.handson.sqllite.models.Artist;
import com.handson.sqllite.service.ArtistService;
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
@RequestMapping("artist")
public class ArtistResource {

    private final ArtistService artistService;

    public ArtistResource(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Artist>> findAll() {
        return new ResponseEntity<>(this.artistService.findAll(), HttpStatus.OK);
    }
}
