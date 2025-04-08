package com.sinensia.jpashowcase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.jpashowcase.ejemplo_01.Libro;
import com.sinensia.jpashowcase.repositories.LibroRepository;

@RestController
@RequestMapping("/pruebas")
public class PruebasController {

	@Autowired
	private LibroRepository libroRepository;
	
	@GetMapping("/libros")
	public List<Libro> getLibros(){
		return libroRepository.findByExplicitoTrue();
	}
	
}
