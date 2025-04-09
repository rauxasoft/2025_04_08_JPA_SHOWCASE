package com.sinensia.jpashowcase.ejemplo_05;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="ALUMNOS")
public class Alumno {

	@Id
	private Long id;
	
	private String nombreCompleto;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="ASIGNATURAS_ALUMNOS", 
	           joinColumns = @JoinColumn(name="ID_ALUMNO"), 
	           inverseJoinColumns = @JoinColumn(name="ID_ASIGNATURA"))
	private List<Asignatura> asignaturas;
	
	public Alumno() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
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
		Alumno other = (Alumno) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombreCompleto=" + nombreCompleto + ", getId()=" + getId()
				+ ", getNombreCompleto()=" + getNombreCompleto() + ", getAsignaturas()=" + getAsignaturas()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
