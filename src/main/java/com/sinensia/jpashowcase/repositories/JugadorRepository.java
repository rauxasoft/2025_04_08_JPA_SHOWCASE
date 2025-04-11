package com.sinensia.jpashowcase.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.sinensia.jpashowcase.ejemplo_03.Jugador;

public interface JugadorRepository extends JpaRepository<Jugador, Long>{

	// Obtener un listado de jugadores que tengan un determinado dorsal
	
	@Query("SELECT j FROM Jugador j WHERE j.dorsal = :dorsal")
	List<Jugador> getByDorsal(Integer dorsal);
	
	// Obtener un listado de jugadores cuyo nombre contenga...
	// %ui%
	
	@Query("SELECT j FROM Jugador j WHERE j.nombre LIKE :texto")
	List<Jugador> getByTexto(String texto);
	
	// Obtener un listado de jugadores cuyo nombre contenga...
	// Esta vez "nos encargamos nosotros" de concatenar los simbolos "%"
	
	@Query("SELECT j FROM Jugador j WHERE j.nombre LIKE CONCAT('%', :texto, '%')")
	List<Jugador> getByTexto2(String texto);
	
	// Listado de jugadores cuyo nombre tenga más de n caracteres
	
	@Query("SELECT j FROM Jugador j WHERE LENGTH(j.nombre) >= :numeroCaracteres")
	List<Jugador> getByNombreLength(Integer numeroCaracteres);
	
	@Query("SELECT j.nombre, j.dorsal, 666, UPPER(j.nombre), CONCAT(UPPER(j.nombre), '*') FROM Jugador j")
	List<Object[]> getCosasSueltas();

	// CREACIÓN DE DTOs
	
	@Query("SELECT UPPER(CONCAT(j.apellido1, ' ', j.apellido2, ', ', j.nombre)) , j.dorsal FROM Jugador j")
	List<Object[]> getDTO1();
	
	// CONSULTA DE ACTUALIZACIÓN CON JPQL
	
	@Modifying
	@Query("UPDATE Jugador j SET j.nombre = CONCAT(j.nombre,REPEAT('*', LENGTH(j.nombre)))")
	int colocarAsteriscos();
	
	// Si queremos actuar sobre un conjunto de entidades que se aportan como parametro, aqui tenemos el ejemplo
	
	@Modifying
	@Query("UPDATE Jugador j SET j.nombre = CONCAT(j.nombre,REPEAT('*', LENGTH(j.nombre))) WHERE j IN :jugadores")
	int colocarAsteriscos(List<Jugador> jugadores);
	
	
}
