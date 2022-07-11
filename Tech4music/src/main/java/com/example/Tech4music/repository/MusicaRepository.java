package com.example.Tech4music.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.Tech4music.model.Musica;

public interface MusicaRepository extends MongoRepository<Musica,String> {

    @Query("{'codigo': ?0 }")
    List<Musica> encontrarPorCodigo(int codigo);

    
}
