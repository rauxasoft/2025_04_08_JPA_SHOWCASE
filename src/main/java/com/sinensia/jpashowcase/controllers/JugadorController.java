package com.sinensia.jpashowcase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.jpashowcase.ejemplo_03.Jugador;
import com.sinensia.jpashowcase.ejemplo_03.dtos.JugadorDTO1;
import com.sinensia.jpashowcase.repositories.JugadorRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/jpql")
public class JugadorController {

	@Autowired
	private JugadorRepository jugadorRepository;
	
	@GetMapping("/prueba7")
	@Transactional
	public int prueba7() {
		return jugadorRepository.colocarAsteriscos();
	}
	
	@GetMapping("/prueba6")
	public List<JugadorDTO1> prueba6(){
	
		return jugadorRepository.getDTO1()
				.stream()
				.map(x -> {
					JugadorDTO1 jugadorDTO1 = new JugadorDTO1();
					jugadorDTO1.setNombreCompleto((String) x[0]);
					jugadorDTO1.setDorsal((Integer) x[1]);
					return jugadorDTO1;
				}).toList();

	}
	
	@GetMapping("/prueba5")
	public List<Object[]> pruebas5(){
		
		List<Object[]> resultSet = jugadorRepository.getCosasSueltas();
		
		resultSet.stream().forEach(fila -> {
			String nombre = (String) fila[0];
			Integer dorsal = (Integer) fila[1];
			System.out.println(dorsal + ": " + nombre);
		});
		
		return resultSet;
	}
	
	@GetMapping("/prueba4")
	public List<Jugador> pruebas4(@RequestParam("n-caracteres") Integer numeroCaracteres){
		return jugadorRepository.getByNombreLength(numeroCaracteres);
	}
	
	@GetMapping("/prueba3")
	public List<Jugador> pruebas3(@RequestParam String texto){
		return jugadorRepository.getByTexto2(texto);
	}
	
	@GetMapping("/prueba2")
	public List<Jugador> pruebas2(@RequestParam String texto){
		return jugadorRepository.getByTexto("%" + texto + "%");
	}
	
	@GetMapping("/prueba1")
	public List<Jugador> pruebas1(@RequestParam Integer dorsal){
		return jugadorRepository.getByDorsal(dorsal);
	}
	
	@GetMapping("/prueba0")
	public List<Jugador> pruebas0(){
		return jugadorRepository.findAll();
	}
	
}
