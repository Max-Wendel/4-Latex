package com.g4dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaginaInicialController {

	@RequestMapping("/")
	public String paginaInicial() {
		return "pagina-inicial";
	}
}
