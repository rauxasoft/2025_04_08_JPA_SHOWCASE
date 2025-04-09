package com.sinensia.jpashowcase.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.jpashowcase.ejemplo_01.Libro;
import com.sinensia.jpashowcase.ejemplo_02.Juguete;
import com.sinensia.jpashowcase.ejemplo_02.TipoJuguete;
import com.sinensia.jpashowcase.ejemplo_03.Equipo;
import com.sinensia.jpashowcase.ejemplo_03.Jugador;
import com.sinensia.jpashowcase.ejemplo_04.Proveedor;
import com.sinensia.jpashowcase.ejemplo_05.Alumno;
import com.sinensia.jpashowcase.ejemplo_05.Asignatura;
import com.sinensia.jpashowcase.repositories.AlumnoRepository;
import com.sinensia.jpashowcase.repositories.AsignaturaRepository;
import com.sinensia.jpashowcase.repositories.EquipoRepository;
import com.sinensia.jpashowcase.repositories.JugadorRepository;
import com.sinensia.jpashowcase.repositories.JugueteRepository;
import com.sinensia.jpashowcase.repositories.LibroRepository;
import com.sinensia.jpashowcase.repositories.ProveedorRepository;

import jakarta.transaction.Transactional;

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
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	@GetMapping("/crear_juguetes")
	@Transactional
	public String crearJuguetes() {
		
		for(int i = 0; i < 10; i++) {
			Juguete juguete = new Juguete();
			juguete.setNombre("Juguete_" + i);
			juguete.setTipoJuguete(TipoJuguete.ACCION);
		
			juguete.setFechaAlta(new Date());
			juguete.setPrecio(100.0);
			jugueteRepository.save(juguete);
			if(i == 4) {
				throw new RuntimeException("El numero 4 no me gusta");
			}
		}
		
		return "ok";
	}
	
	@GetMapping("/alumnos")
	public List<Alumno> getAlumnos(){
		
		List<Alumno> alumnos = alumnoRepository.findAll();
		
		alumnos.forEach(System.out::println);
		
		return alumnos;
	}
	
	@GetMapping("/asignaturas")
	public List<Asignatura> getAsignaturas(){
		return asignaturaRepository.findAll();
	}
	
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
