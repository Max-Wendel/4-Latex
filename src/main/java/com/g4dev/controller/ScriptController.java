package com.g4dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.g4dev.model.Script;
import com.g4dev.service.ScriptService;

@Controller
public class ScriptController {
	
	@Autowired
	ScriptService scriptService;
	
	@PostMapping("/salvarScript")
	public ModelAndView salvar(Script script, @RequestParam(value="imagem") MultipartFile imagem) {
		scriptService.salvarScript(script, imagem);
		ModelAndView mv =new ModelAndView("redirect:/scripts");
		return mv;
	}
	
	@RequestMapping("/atualizarScript/{id}")
	public ModelAndView atualizarScript(@PathVariable Long id) {
		Script script = scriptService.buscarPorId(id);
		ModelAndView mv = new ModelAndView("redirect:/scripts");
		mv.addObject("pessoa", script);
		return mv;
	}
	
	@RequestMapping("script/excluir/{id}")
	public ModelAndView ModelAndView(@PathVariable Long id) {
		scriptService.excluirPorId(id);
		ModelAndView mv = new ModelAndView("redirect:/scripts");
		return mv;
	}

}
