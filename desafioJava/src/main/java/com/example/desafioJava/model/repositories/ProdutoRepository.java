package com.example.desafioJava.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.desafioJava.model.entities.Produto;

public interface ProdutoRepository 
	extends PagingAndSortingRepository<Produto, Integer>{
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

}
