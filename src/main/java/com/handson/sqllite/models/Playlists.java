package com.handson.sqllite.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="playlists")
public class Playlists {

    @Id
    @GeneratedValue
    private String id;

    public String getId() {
        return id;
    }
}
