package com.g4dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.g4dev.model.Script;

@Controller
public class EscopoADMController {
	
	@RequestMapping("/entrar")
	public String paginaADMInicial() {
		return "pagina-inicial-adm";
	}
	
	@RequestMapping("/scripts")
	public ModelAndView crudScript() {
		ModelAndView mv = new ModelAndView("gerenciar-script");
		mv.addObject("script", new Script());
		return mv;
	}
}
