package com.handson.sqllite.repository;

import com.handson.sqllite.models.Music;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends CrudRepository<Music, String> {
}