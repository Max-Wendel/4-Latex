package com.g4dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("4Latex")
public class CategoriaController {
	@RequestMapping("/categorias")
	public String paginaCategorias() {
		return "pagina-categorias";
	}
	
	public void criarCat() {
		//
	}
	public void deletarCat() {
		//
	}
	public void buscarCategoria() {
		//
	}
}
