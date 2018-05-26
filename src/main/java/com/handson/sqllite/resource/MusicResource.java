package com.handson.sqllite.resource;

import com.handson.sqllite.models.Music;
import com.handson.sqllite.service.MusicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("music")
public class MusicResource {

    private final MusicService musicService;

    public MusicResource(MusicService musicService) {
        this.musicService = musicService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Music>> findAll() {
        return new ResponseEntity<>(this.musicService.findAll(), HttpStatus.OK);
    }

}
