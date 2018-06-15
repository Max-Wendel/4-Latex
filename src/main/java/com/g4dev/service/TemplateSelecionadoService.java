package com.g4dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.g4dev.model.Template;

import com.g4dev.repository.TemplateRepository;



@Service
public class TemplateSelecionadoService {
	
	@Autowired
	private TemplateRepository templateRepository;
	

	public Template exibirTemplateSelecionado(Long id) {
		return templateRepository.getOne(id);
	}
	
	public List<Template> listarTemplates() {
		return templateRepository.findAll();
	}
	
	 
}