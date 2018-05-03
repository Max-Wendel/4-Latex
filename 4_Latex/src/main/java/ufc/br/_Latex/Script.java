package ufc.br._Latex;

import java.util.ArrayList;

public class Script {
	private String nome;
	private String codigo;
	private ArrayList<String> tags = new ArrayList<String>();
	
	public Script(String nome, String codigo, ArrayList<String> tags) {
		this.nome = nome;
		this.codigo = codigo;
		this.tags = classificarTags(codigo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public ArrayList<String> getTags() {
		return tags;
	}
	
	public ArrayList<String> classificarTags(String codigo){
		ArrayList<String> tags = new ArrayList<String>();
		// Função que percorre a string codigo e pega todas as possiveis tags;
		
		
		return tags;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
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
		Script other = (Script) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		return true;
	}
	
	
	
	
}
