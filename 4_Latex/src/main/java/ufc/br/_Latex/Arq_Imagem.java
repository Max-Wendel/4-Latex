package ufc.br._Latex;

public class Arq_Imagem {
	private String arqImagemNome;
	private String arqImagemDiretorio;
	
	public Arq_Imagem(String arqImagemNome, String arqImagemDiretorio) {
		this.arqImagemNome = arqImagemNome;
		this.arqImagemDiretorio = arqImagemDiretorio;
	}

	public String getArqImagemNome() {
		return arqImagemNome;
	}

	public void setArqImagemNome(String arqImagemNome) {
		this.arqImagemNome = arqImagemNome;
	}

	public String getArqImagemDiretorio() {
		return arqImagemDiretorio;
	}

	public void setArqImagemDiretorio(String arqImagemDiretorio) {
		this.arqImagemDiretorio = arqImagemDiretorio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arqImagemDiretorio == null) ? 0 : arqImagemDiretorio.hashCode());
		result = prime * result + ((arqImagemNome == null) ? 0 : arqImagemNome.hashCode());
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
		Arq_Imagem other = (Arq_Imagem) obj;
		if (arqImagemDiretorio == null) {
			if (other.arqImagemDiretorio != null)
				return false;
		} else if (!arqImagemDiretorio.equals(other.arqImagemDiretorio))
			return false;
		if (arqImagemNome == null) {
			if (other.arqImagemNome != null)
				return false;
		} else if (!arqImagemNome.equals(other.arqImagemNome))
			return false;
		return true;
	}
	



}
