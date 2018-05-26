package com.handson.sqllite.repository;

import com.handson.sqllite.models.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author silas.silva
 * @since 26/05/18
 */
@Repository
public interface ArtistRepository extends CrudRepository<Artist, String> {
}
