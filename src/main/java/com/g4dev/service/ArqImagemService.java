package com.g4dev.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.g4dev.model.ArqImagem;

public class ArqImagemService {

	@Autowired
	ArqImagem arqImagem;
	
	public void salvar(ArqImagem arqImagem) {
		if(arqImagem.hashCode() != 1) {
			//Mandar uma mensagem de erro
		}else {
			//Salvar
		}
		
	}
	
	public void deletar(ArqImagem arqImagem) {
		//deletar arqImagem com o repository
		
	}
	
	public void alterar(ArqImagem arqImagem) {
		//Dar um update com o repository
	}
	
	public void visualizar(ArqImagem arqImagem) {
		//Pegar o local da imagem e mostrar ela ao usuario
	}
}
