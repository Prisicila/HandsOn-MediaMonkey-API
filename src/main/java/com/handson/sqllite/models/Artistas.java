package com.handson.sqllite.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author silas.silva
 * @since 26/05/18
 */
@Entity
public class Artistas {

    @Id
    private String id;
    private String nome;


    public String getId() {
        return id;
    }

    public Artistas setId(String id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Artistas setNome(String nome) {
        this.nome = nome;
        return this;
    }
}
