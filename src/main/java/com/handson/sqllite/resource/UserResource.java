package com.handson.sqllite.resource;

import com.handson.sqllite.models.Playlists;
import com.handson.sqllite.repository.UserRepository;
import com.handson.sqllite.service.PlaylistService;
import com.handson.sqllite.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("playlist")
public class UserResource {

    private final UserService usuarioService;

    public UserResource(UserService userService){
        this.usuarioService = userService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Playlists>> findAll() {
        return new ResponseEntity<>(this.usuarioService.findAll(), HttpStatus.OK);
    }

}
