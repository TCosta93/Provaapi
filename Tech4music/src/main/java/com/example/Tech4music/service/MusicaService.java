package com.example.Tech4music.service;

import java.util.List;

import com.example.Tech4music.model.Musica;

public interface MusicaService {
    Musica criarMusica(Musica produto);
    List<Musica> obterTodos();
    Musica obterPorId(String id);
    void removerMusica(String id);
    Musica atualizarMusica(String id, Musica produto);
}
