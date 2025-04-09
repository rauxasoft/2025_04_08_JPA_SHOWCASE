package com.sinensia.jpashowcase.ejemplo_07;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="COCHES")
public class Coche extends Vehiculo {

	private int numeroPuertas;
	
	public Coche() {
		
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

}
