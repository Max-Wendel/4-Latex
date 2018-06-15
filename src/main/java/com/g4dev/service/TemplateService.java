package com.g4dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.g4dev.model.Template;
import com.g4dev.repository.TemplateRepository;
import com.g4dev.util.G4devFileUtil;

@Service
public class TemplateService {
	
	@Autowired
	private TemplateRepository tempRepo;
	
	//add 3 imagens e um zip
	public void salvarTemplate(Template temp, MultipartFile imagem1, MultipartFile imagem2, MultipartFile imagem3, MultipartFile zip) {
		String pathImagem1 = "src/main/resource/static/img/templates/"+ temp.getNomeTemplate() +"1.png";
		String pathImagem2 = "src/main/resource/static/img/templates/"+ temp.getNomeTemplate() +"2.png";
		String pathImagem3 = "src/main/resource/static/img/templates/"+ temp.getNomeTemplate() +"3.png";
		
		String pathZip = "src/main/resource/static/templates/zips/"+ temp.getNomeTemplate() +".zip";
		
		G4devFileUtil.salvarImagem(pathImagem1, imagem1);
		G4devFileUtil.salvarImagem(pathImagem2, imagem2);
		G4devFileUtil.salvarImagem(pathImagem3, imagem3);
		
		G4devFileUtil.salvarZip(pathZip, zip);
		
		temp.setPath(pathImagem1);
		temp.setPath(pathImagem2);
		temp.setPath(pathImagem3);
		
		temp.setPath(pathZip);
		
		tempRepo.save(temp);
	}
	
	public List<Template> listarTemplates() {
		return tempRepo.findAll();
	}
	
}
