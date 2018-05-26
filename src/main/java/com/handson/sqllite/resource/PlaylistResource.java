package com.handson.sqllite.resource;

import com.handson.sqllite.service.PlaylistService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("playlist")
public class PlaylistResource {

    private final PlaylistService playlistService;

    public PlaylistResource(PlaylistService playlistService){
        this.playlistService =  playlistService;
    }



}
