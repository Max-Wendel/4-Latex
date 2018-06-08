package com.g4dev.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g4dev.model.Categoria;
import com.g4dev.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository categoriaRepository;

	public void salvarCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriaRepository.save(categoria);
	}

	public List<Categoria> listarCategoria() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

	public Categoria buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return categoriaRepository.findOne(id);
	}

	public void excluirPorId(Long id) {
		// TODO Auto-generated method stub
		categoriaRepository.delete(id);
	}

	
	
}
