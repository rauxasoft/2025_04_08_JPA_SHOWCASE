package com.sinensia.jpashowcase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.jpashowcase.ejemplo_01.Libro;
import com.sinensia.jpashowcase.ejemplo_02.Juguete;
import com.sinensia.jpashowcase.ejemplo_03.Equipo;
import com.sinensia.jpashowcase.ejemplo_03.Jugador;
import com.sinensia.jpashowcase.ejemplo_04.Proveedor;
import com.sinensia.jpashowcase.repositories.EquipoRepository;
import com.sinensia.jpashowcase.repositories.JugadorRepository;
import com.sinensia.jpashowcase.repositories.JugueteRepository;
import com.sinensia.jpashowcase.repositories.LibroRepository;
import com.sinensia.jpashowcase.repositories.ProveedorRepository;

@RestController
@RequestMapping("/pruebas")
public class PruebasController {

	@Autowired
	private LibroRepository libroRepository;
	
	@Autowired
	private JugueteRepository jugueteRepository;
	
	@Autowired
	private JugadorRepository jugadorRepository;
	
	@Autowired
	private EquipoRepository equipoRepository;
	
	@Autowired
	private ProveedorRepository proveedorRepository;
	
	@GetMapping("/proveedores")
	public List<Proveedor> getProveedores(){
		return proveedorRepository.findAll();
	}
	
	@GetMapping("/equipos")
	public List<Equipo> getEquipos(){
		return equipoRepository.findAll();
	}
	
	@GetMapping("/jugadores")
	public List<Jugador> getJugadores(){
		return jugadorRepository.findAll();
	}
	
	@GetMapping("/juguetes")
	public List<Juguete> getJuguetes(){
		return jugueteRepository.findAll();
	}
	
	@GetMapping("/libros")
	public List<Libro> getLibros(){
		return libroRepository.findByExplicitoTrue();
	}
	
}
