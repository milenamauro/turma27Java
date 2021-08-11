package com.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.lojagames.model.Categoria;
import com.generation.lojagames.model.Produtos;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos, Long> {

	public List<Produtos>findAllByNomeContainingIgnoreCase(String nome);
	
	
}
