package com.g4dev.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class PaginaInicialController {

	public String paginaInicial() {
		return "pagina-inicial";
	}
}
