package com.example.Tech4music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Tech4music.model.Musica;
import com.example.Tech4music.repository.MusicaRepository;

@Service
public class MusicaServiceImpl implements MusicaService {
    
    @Autowired
    private MusicaRepository repositorio;

    @Override
    public Musica criarMusica(Musica produto) {
        return repositorio.save(produto);
    }

    @Override
    public List<Musica> obterTodos() {
        return repositorio.findAll();
    }


    @Override
    public Musica obterPorId(String id) {
        return repositorio.findById(id).get();
    }

    @Override
    public void removerMusica(String id) {
        repositorio.deleteById(id);
    }

    @Override
    public Musica atualizarMusica(String id, Musica produto) {
        produto.setId(id);
        return repositorio.save(produto);
    }


}
