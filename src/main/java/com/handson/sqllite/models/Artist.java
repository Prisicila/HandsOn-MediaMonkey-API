package com.handson.sqllite.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author silas.silva
 * @since 26/05/18
 */
@Entity
@Table(name = "Artistas")
public class Artist {

    @Id
    private String id;
    private String name;


    public String getId() {
        return id;
    }

    public Artist setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Artist setName(String name) {
        this.name = name;
        return this;
    }
}
