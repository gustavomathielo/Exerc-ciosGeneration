package org.games.minhaLojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.games.minhaLojaGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	public List<Categoria> findAllByGeneroContainsIgnoreCase(String genero);
}