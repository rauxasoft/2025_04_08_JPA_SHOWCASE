package com.sinensia.jpashowcase.ejemplo_06;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Comentario {

	private String autor;
	
	@Column(name="COMENTARIO")
	private String texto;
	
	public Comentario() {
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
