package com.handson.sqllite.resource;

import com.handson.sqllite.models.Artist;
import com.handson.sqllite.models.Playlists;
import com.handson.sqllite.service.PlaylistService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("playlist")
public class PlaylistResource {

    private final PlaylistService playlistService;

    public PlaylistResource(PlaylistService playlistService){
        this.playlistService =  playlistService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Playlists>> findAll() {
        return new ResponseEntity<>(this.playlistService.findAll(), HttpStatus.OK);
    }

}
