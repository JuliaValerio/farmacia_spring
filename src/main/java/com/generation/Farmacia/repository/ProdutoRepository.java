package com.generation.Farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.Farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	
	List<Produto> findAllByPrecoGreaterThan(BigDecimal preco); 
	
	List<Produto> findAllByPrecoGreaterThanEqual(BigDecimal preco); 
}

