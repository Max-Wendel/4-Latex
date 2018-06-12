package com.g4dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.g4dev.model.Categoria;
import com.g4dev.service.CategoriaService;

@Controller
@RequestMapping("4Latex")
public class CategoriaController {
	
	@Autowired
	CategoriaService categoriaService;
	
	@RequestMapping("/categorias")
	public String paginaCategorias() {
		return "pagina-categorias";
	}
	
	@PostMapping("/salvarCategoria")
	public ModelAndView salvar(Categoria categoria) {
		categoriaService.salvarCategoria(categoria);
		ModelAndView mv =new ModelAndView("redirect:/scripts");
		return mv;
	}
	
	@GetMapping("/listarCategoria")
	public ModelAndView listarCategoria() {
		List<Categoria> categoria = categoriaService.listarCategoria();
		ModelAndView mv = new ModelAndView("scripts");
		mv.addObject("todasAsCategorias", categoria);
		
		return mv;
	}
	
	@RequestMapping("/atualizarCategoria/{id}")
	public ModelAndView atualizarCategoria(@PathVariable Long id) {
		Categoria categoria = categoriaService.buscarPorId(id);
		ModelAndView mv = new ModelAndView("redirect:/scripts");
		mv.addObject("categoria", categoria);
		return mv;
	}
	
	@RequestMapping("/excluir/{id}")
	public ModelAndView ModelAndView(@PathVariable Long id) {
		categoriaService.excluirPorId(id);
		ModelAndView mv = new ModelAndView("redirect:/scripts");
		return mv;
	}
}
