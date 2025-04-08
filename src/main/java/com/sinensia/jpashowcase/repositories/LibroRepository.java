package com.sinensia.jpashowcase.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.jpashowcase.ejemplo_01.Libro;

public interface LibroRepository extends JpaRepository<Libro, String> {

	List<Libro> findByNumeroPaginasGreaterThan(int numeroPaginas);
	
	List<Libro> findByExplicitoTrue();
	
	List<Libro> findByTituloLikeIgnoreCaseOrExplicitoTrueOrNumeroPaginasBetweenOrderByNumeroPaginasDesc(String titulo, int min, int max);
	
	
}
