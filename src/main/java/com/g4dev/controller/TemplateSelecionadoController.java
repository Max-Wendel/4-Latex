package com.g4dev.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.g4dev.model.Template;
import com.g4dev.service.TemplateSelecionadoService;


@Controller
@RequestMapping("4Latex")
public class TemplateSelecionadoController {
	
	@Autowired
	private TemplateSelecionadoService tempalteSelecionadoService;
	
	
	@RequestMapping("/exibir-template/{id}")
	public ModelAndView exibirTemplateSelecionado(@PathVariable Long id) {
		Template templateSelecionado = tempalteSelecionadoService.exibirTemplateSelecionado(id);
		ModelAndView mv = new ModelAndView("pagina-template-selecionado");
		mv.addObject("template", templateSelecionado);
		return mv;
	}
	
	
	@GetMapping("/listar-template")
	public ModelAndView listarTemplate() {
	  List<Template> template = tempalteSelecionadoService.listarTemplates();
	  ModelAndView mv = new ModelAndView("pagina-templates");
	  mv.addObject("todosTemplates", template);
	  
	  return mv;
	}
	
	

}
