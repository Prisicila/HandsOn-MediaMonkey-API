package com.handson.sqllite.repository;

import com.handson.sqllite.models.Artistas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author silas.silva
 * @since 26/05/18
 */
@Repository
public interface ArtistaRepository extends CrudRepository<Artistas, String> {
}
