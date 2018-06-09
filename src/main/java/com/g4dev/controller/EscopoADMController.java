package com.g4dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.g4dev.model.Categoria;
import com.g4dev.model.Script;
import com.g4dev.model.TemplateSelecionado;

@Controller
public class EscopoADMController {
	
	//Mapeamento para a página inicial de ADM
	@RequestMapping("/entrar")
	public String paginaADMInicial() {
		return "pagina-inicial-adm";
	}
	
	//Mapeamento para a página de gerenciamento de script que repassa os objetos 
	//necessários para o cadastro de novas categorias e novos scripts
	@RequestMapping("/scripts")
	public ModelAndView crudScript() {
		ModelAndView mv = new ModelAndView("gerenciar-script");
		mv.addObject("script", new Script());
		mv.addObject("categoria", new Categoria());
		return mv;
	}
	
	//Mapeamento para a página de gerenciamento de script que repassa os objetos 
	//necessários para o cadastro de novos templates
	@RequestMapping("/templates")
	public ModelAndView crudTemplate() {
		ModelAndView mv = new ModelAndView("gerenciar-template");
		mv.addObject("template", new TemplateSelecionado());
		return mv;
	}
}
