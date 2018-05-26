package com.handson.sqllite.repository;

import org.springframework.stereotype.Repository;
import com.handson.sqllite.models.Music;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface MusicRepository extends CrudRepository<Music, String> {
}