package com.g4dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("4Latex")
public class QuemSomosController {
	
	@RequestMapping("/quem-somos")
	public String paginaAjuda() {
		return "pagina-quem-somos";
	}
}
