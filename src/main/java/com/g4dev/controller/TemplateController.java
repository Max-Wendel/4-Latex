package com.g4dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.g4dev.model.Template;
import com.g4dev.service.TemplateService;

@Controller
@RequestMapping("4Latex")
public class TemplateController {

	@Autowired
	private TemplateService tempService;

	@RequestMapping("/templates")
	public String paginaTemplate() {
		return "pagina-templates";
	}

	@PostMapping("/salvarTemplate")
	public ModelAndView cadastrarTemplate(Template template, @RequestParam(value = "zip") MultipartFile zip,
			@RequestParam(value = "imagem1") MultipartFile image1,
			@RequestParam(value = "imagem2") MultipartFile image2,
			@RequestParam(value = "imagem3") MultipartFile image3) {
		tempService.salvarTemplate(template, image1, image2, image3, zip);
		ModelAndView mv = new ModelAndView("redirect:/templates");
		return mv;
	}
	
	@GetMapping("/listarTemplate")
	public ModelAndView listarTemplates() {
		List<Template> templates = tempService.listarTemplates();
		ModelAndView mv = new ModelAndView("cadastro-template");
		mv.addObject("todosOsTemplates", templates);
		return mv;
	}
	// editar
	// visualizar template
	// baixar template
	// compartilhar template
	// criar template
	// excluir template

}
