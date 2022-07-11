package com.example.Tech4music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Tech4music.model.Musica;
import com.example.Tech4music.service.MusicaService;

@RestController
@RequestMapping("/api/musicas")
public class MusicaController {
    @Autowired
    private MusicaService servico;


    @GetMapping
    public ResponseEntity<List<Musica>> obterProdutos() {
        return new ResponseEntity<>(servico.obterTodos(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Musica> criaProduto(@RequestBody Musica produto) {
        return new ResponseEntity<>(servico.criarMusica(produto), HttpStatus.CREATED);
    }

    @GetMapping(value="/encontrarporid/{id}")
    public ResponseEntity<Musica> obterPorId(@PathVariable String id) {
        return new ResponseEntity<>(servico.obterPorId(id), HttpStatus.FOUND);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<String> removerMusica(@PathVariable String id) {
        servico.removerMusica(id);
        return new ResponseEntity<>("Musica deletada com sucesso!", HttpStatus.OK);
    }

    @PutMapping(value="/{id}")
    public Musica atualizarPorId(@PathVariable String id, @RequestBody Musica produto) {
        return servico.atualizarMusica(id, produto);
    }

           
    
           


}
