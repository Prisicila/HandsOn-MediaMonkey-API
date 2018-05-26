package com.handson.sqllite.resource;

import package com.handson.sqllite.models.Music;

@RestController
@RequestMapping("music")
public class MusicResource {

    private final MusicService musicService;

    public MusicResource(MusicService musicService) {
        this.musicService = musicService;
    }


}
