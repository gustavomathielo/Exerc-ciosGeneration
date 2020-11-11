package org.games.minhaLojaGames.controller;

import java.util.List;

import org.games.minhaLojaGames.model.Categoria;
import org.games.minhaLojaGames.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {
	@Autowired
	private CategoriaRepository repositoryCat;

	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll() {
		return ResponseEntity.ok(repositoryCat.findAll());
	}
	
	@GetMapping ("/id")
	public ResponseEntity<Categoria> GetById(@PathVariable Integer id){
		return repositoryCat.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

}