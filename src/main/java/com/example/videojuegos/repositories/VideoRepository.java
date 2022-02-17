package com.example.videojuegos.repositories;

import com.example.videojuegos.models.Video;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends CrudRepository<Video,Long>{


@Query(value = "select * from videojuegos v where v.nombre like %:keyword% or v.genero like %:keyword%", nativeQuery = true)
 List<Video> buscarpvideo(@Param("keyword") String keyword);

}