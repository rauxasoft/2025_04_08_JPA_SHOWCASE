package com.sinensia.jpashowcase.ejemplo_07;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="MOTOS")
public class Moto extends Vehiculo {

	private boolean pataCabra;
	
	public Moto() {
		
	}

	public boolean isPataCabra() {
		return pataCabra;
	}

	public void setPataCabra(boolean pataCabra) {
		this.pataCabra = pataCabra;
	}
	
}
