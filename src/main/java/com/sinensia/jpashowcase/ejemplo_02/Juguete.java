package com.sinensia.jpashowcase.ejemplo_02;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="JUGUETES")
public class Juguete {

	@Id
	@GeneratedValue(generator = "JUGUETES_SEQ")
	private Long id;
	
	private String nombre;
	private double precio;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TIPO")
	private TipoJuguete tipoJuguete;
	
	@Temporal(TemporalType.DATE)
	private Date fechaAlta;
	
	public Juguete() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public TipoJuguete getTipoJuguete() {
		return tipoJuguete;
	}

	public void setTipoJuguete(TipoJuguete tipoJuguete) {
		this.tipoJuguete = tipoJuguete;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
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
		Juguete other = (Juguete) obj;
		return Objects.equals(id, other.id);
	}
	
}
