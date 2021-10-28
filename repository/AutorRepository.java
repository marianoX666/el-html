package com.example.demo.repository;


import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
	
	@Query("Select a From Autor a WHERE a.nombre= :nombre")
	public List<Autor> buscarTodosAutores(@Param("nombre") String nombre);
	
	@Query("Select a From Autor a WHERE a.id= :id")
	public Optional<Autor> findById( Integer id) ; 
	
	
	//@Query("SELECT c FROM usuario c WHERE c.apellido LIKE= :valor")
	//public List<Autor> listarPorApellidoQueEmpiecen(String valor);

}
	

