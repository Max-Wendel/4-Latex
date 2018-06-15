package com.g4dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.g4dev.model.Script;
import com.g4dev.model.TemplateSelecionado;
import com.g4dev.service.ScriptService;

@Controller
public class EscopoADMController {
	
	@Autowired
	ScriptService scriptService;
	
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
		List<Script> scripts = scriptService.listarScript();
		mv.addObject("todosOsScripts", scripts);
		mv.addObject("novoScript", new Script());
		return mv;
	}
	
	//Mapeamento para a página de gerenciamento de script que repassa os objetos 
	//necessários para o cadastro de novos templates
	@RequestMapping("/templates")
	public ModelAndView crudTemplate() {
		ModelAndView mv = new ModelAndView("cadastro-template");
		mv.addObject("template", new TemplateSelecionado());
		return mv;
	}
}
