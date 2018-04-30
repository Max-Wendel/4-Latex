package ufc.br._Latex;

public class Arq_texto {
	private String nome;
	private String diretorio;
	
	public Arq_texto(String nome, String diretorio) {
		this.nome = nome;
		this.diretorio = diretorio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDiretorio() {
		return diretorio;
	}
	public void setDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diretorio == null) ? 0 : diretorio.hashCode());
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
		Arq_texto other = (Arq_texto) obj;
		if (diretorio == null) {
			if (other.diretorio != null)
				return false;
		} else if (!diretorio.equals(other.diretorio))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
