package ufc.br._Latex;

import java.util.ArrayList;

public class Template {
	private String nome;
	private String descrição;
	
	ArrayList<Arq_Imagem> imagens = new ArrayList<Arq_Imagem>();
	ArrayList<Arq_texto> documentos = new ArrayList<Arq_texto>();
	
	
	
	public Template(String nome, String descrição, ArrayList<Arq_Imagem> imagens, ArrayList<Arq_texto> documentos) {
		this.nome = nome;
		this.descrição = descrição;
		this.imagens = imagens;
		this.documentos = documentos;
	}
	
	public Template(String nome, String descrição, Arq_Imagem imagem, Arq_texto documento) {
		this.nome = nome;
		this.descrição = descrição;
		this.imagens.add(imagem);
		this.documentos.add(documento);
	}
	
	public void adicionarArquivo(Arq_Imagem imagem){
		this.imagens.add(imagem);
	}
	
	public void adicionarArquivo(Arq_texto documento){
		this.documentos.add(documento);
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrição() {
		return descrição;
	}
	
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descrição == null) ? 0 : descrição.hashCode());
		result = prime * result + ((documentos == null) ? 0 : documentos.hashCode());
		result = prime * result + ((imagens == null) ? 0 : imagens.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Template other = (Template) obj;
		if (descrição == null) {
			if (other.descrição != null)
				return false;
		} else if (!descrição.equals(other.descrição))
			return false;
		if (documentos == null) {
			if (other.documentos != null)
				return false;
		} else if (!documentos.equals(other.documentos))
			return false;
		if (imagens == null) {
			if (other.imagens != null)
				return false;
		} else if (!imagens.equals(other.imagens))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
