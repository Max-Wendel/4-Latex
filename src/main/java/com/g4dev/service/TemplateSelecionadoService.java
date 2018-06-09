package com.g4dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.g4dev.model.TemplateSelecionado;
import com.g4dev.repository.TemplateSelecionadoRepository;
import com.g4dev.util.G4devFileUtil;

@Service
public class TemplateSelecionadoService {
	
	@Autowired
	private TemplateSelecionadoRepository templateSelecionadoRepository;
	
	
	public void salvarTempalteSelecionado(TemplateSelecionado template, MultipartFile texto) {
		String caminho = "texto/"+template.getTitulo() +".txt";
		G4devFileUtil.salvarTexto(caminho, texto);
		template.setTamanho((texto.getSize()/1000));
		templateSelecionadoRepository.save(template);
	}
	
	public TemplateSelecionado exibirTemplateSelecionado(Long id) {
		return templateSelecionadoRepository.getOne(id);
	}
	
	public List<TemplateSelecionado> listarTemplates() {
		return templateSelecionadoRepository.findAll();
	}
	 public void excluirPorId(Long id) {
		 templateSelecionadoRepository.delete(id);
	}
	 
	 
}