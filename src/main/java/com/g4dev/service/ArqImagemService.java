package com.g4dev.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.g4dev.model.ArqImagemModel;

public class ArqImagemService {

	@Autowired
	ArqImagemModel arqImagem;
	
	public void salvar(ArqImagemModel arqImagem) {
		if(arqImagem.hashCode() != 1) {
			//Mandar uma mensagem de erro
		}else {
			//Salvar
		}
		
	}
	
	public void deletar(ArqImagemModel arqImagem) {
		//deletar arqImagem com o repository
		
	}
	
	public void alterar(ArqImagemModel arqImagem) {
		//Dar um update com o repository
	}
	
	public void visualizar(ArqImagemModel arqImagem) {
		//Pegar o local da imagem e mostrar ela ao usuario
	}
}
