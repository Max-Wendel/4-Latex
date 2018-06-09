package com.g4dev.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.g4dev.model.TemplateSelecionado;
import com.g4dev.service.TemplateSelecionadoService;

@Controller
public class TemplateSelecionadoController {
	
	@Autowired
	private TemplateSelecionadoService tempalteSelecionadoService;
	
	@PostMapping("/salvarTemplate")
	public ModelAndView salvarTemplate(TemplateSelecionado template, @RequestParam(value = "texto") MultipartFile texto) {
		tempalteSelecionadoService.salvarTempalteSelecionado(template, texto);
		ModelAndView mv = new ModelAndView("redirect:/templates");
		return mv;
		
	}
	
	
	@RequestMapping("/exibir/{id}")
	public ModelAndView exibirTemplateSelecionado(@PathVariable Long id) {
		TemplateSelecionado templateSelecionado = tempalteSelecionadoService.exibirTemplateSelecionado(id);
		ModelAndView mv = new ModelAndView("template-selecionado");
		mv.addObject("template", templateSelecionado);
		return mv;
	}
	
	
	@GetMapping("/listarTemplates")
	public ModelAndView listarTemplate() {
	  List<TemplateSelecionado> template = tempalteSelecionadoService.listarTemplates();
	  ModelAndView mv = new ModelAndView("redirect:/templates");
	  mv.addObject("todosTemplates", template);
	  
	  return mv;
	}
	
	@RequestMapping("/excluir/{id}")
	public ModelAndView excluirtemplate(@PathVariable Long id) {
		tempalteSelecionadoService.excluirPorId(id);
		ModelAndView mv = new ModelAndView("redirect:/templates");
		return mv;
	}
	
	@RequestMapping("/atualizar/{id}")
	public ModelAndView atualizarPessoa(@PathVariable Long id) {
		TemplateSelecionado template = tempalteSelecionadoService.exibirTemplateSelecionado(id);
		ModelAndView mv = new ModelAndView("redirect:/templates");
		mv.addObject("template", template);
		return mv;
	}
}
