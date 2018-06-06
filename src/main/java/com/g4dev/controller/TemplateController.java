package com.g4dev.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TemplateController {
	
	@RequestMapping("/templates")
	public String paginaTemplate() {
		return "pagina-templates";
	}
	
//	editar
//	visualizar template
//	baixar template
//	compartilhar template
//	criar template
//	excluir template
	
}
