package com.g4dev.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.g4dev.model.Script;
import com.g4dev.repository.ScriptRepository;
import com.g4dev.util.G4devFileUtil;

@Service
public class ScriptService {
	
	@Autowired
	ScriptRepository scriptRepository;
	

	public void salvarScript(Script script, MultipartFile imagem) {
		// TODO Auto-generated method stub
		String path = "src/main/resource/static/img/scripts/"+ script.getNome() +".png";
		G4devFileUtil.salvarImagem(path, imagem);
		script.setpath(path);
		scriptRepository.save(script);
	}
	
	public List<Script> listarPessoa(){
		return scriptRepository.findAll();
	}

	public Script buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return scriptRepository.getOne(id);
	}

	public void excluirPorId(Long id) {
		// TODO Auto-generated method stub
		scriptRepository.delete(id);
	}
	
}
