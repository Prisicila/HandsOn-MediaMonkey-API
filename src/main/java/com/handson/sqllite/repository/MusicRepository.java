package com.handson.sqllite.repository;

import package com.handson.sqllite.models.Music;

@Repository
public interface MusicRepository extends CrudRepository<Music, String> {
}