package com.g4dev.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Template {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String descrição;
	
	@OneToMany(mappedBy = "id_arqimagem")
	@JoinColumn(name = "id_arqimagem")
	private List<ArqImagem> arqImagens;
	//private List<ArqTexto> arqTexto;
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public List<ArqImagem> getArqImagens() {
		return arqImagens;
	}
	public void setArqImagens(List<ArqImagem> arqImagens) {
		this.arqImagens = arqImagens;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arqImagens == null) ? 0 : arqImagens.hashCode());
		result = prime * result + ((descrição == null) ? 0 : descrição.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (arqImagens == null) {
			if (other.arqImagens != null)
				return false;
		} else if (!arqImagens.equals(other.arqImagens))
			return false;
		if (descrição == null) {
			if (other.descrição != null)
				return false;
		} else if (!descrição.equals(other.descrição))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}
