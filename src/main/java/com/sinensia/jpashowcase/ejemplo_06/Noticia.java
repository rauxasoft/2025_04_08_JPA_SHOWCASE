package com.sinensia.jpashowcase.ejemplo_06;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="NOTICIAS")
public class Noticia {

	@Id
	@GeneratedValue(generator = "NOTICIAS_SEQ")
	private Long id;
	
	private String titulo;
	
	@Column(name="SUBTITULO")
	private String subTitulo;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name="COMENTARIOS", joinColumns = @JoinColumn(name="ID_NOTICIA"))
	@OrderColumn(name="ORDEN")
	private List<Comentario> comentarios;
	
	public Noticia() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubTitulo() {
		return subTitulo;
	}

	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Noticia other = (Noticia) obj;
		return Objects.equals(id, other.id);
	}

}
