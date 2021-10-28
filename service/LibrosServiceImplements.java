package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Libros;
import com.example.demo.repository.LibrosRepository;

@Service
public class LibrosServiceImplements implements LibrosService {

	@Autowired
	private LibrosRepository librosRepository;
	
	@Override
	public Iterable<Libros> findAll() {
		
		return librosRepository.findAll();
	}

	@Override
	public Optional<Libros> findById(Integer id) {
		
		return librosRepository.findById(id);
	}

	@Override
	public Libros save(Libros libros) {
		
		return librosRepository.save(libros);
	}

	@Override
	public void DeleteById(Integer id) {
		librosRepository.deleteById(id);
		
	}
	
	

}
