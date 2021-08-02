package com.generation.lojagames.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.lojagames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	

	public List<Categoria> findAllByDescricaoContaingIgnoreCase(String descricao);

	
	
	
	
}