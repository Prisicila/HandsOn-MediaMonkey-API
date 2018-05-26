package com.handson.sqllite.repository;

import com.handson.sqllite.models.Playlists;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends CrudRepository<Playlists, String> {

}
