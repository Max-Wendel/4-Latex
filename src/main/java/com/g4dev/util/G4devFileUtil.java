package com.g4dev.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

public class G4devFileUtil {
	
	public static void salvarImagem(String path, MultipartFile imagem) {
		File file = new File(path);
		
		try {
			FileUtils.writeByteArrayToFile(file, imagem.getBytes());
			System.out.println("Salvo em: " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void salvarTexto(String caminho, MultipartFile texto) {
		File file = new File(caminho);
		try {
			FileUtils.writeByteArrayToFile(file,texto.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
