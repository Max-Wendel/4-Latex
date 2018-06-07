package com.g4dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PaginaInicialController {

	@RequestMapping("/4Latex")
	public String paginaInicial() {
		return "pagina-inicial";
	}
}
