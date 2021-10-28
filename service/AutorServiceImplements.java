package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Autor;
import com.example.demo.repository.AutorRepository;

@Service
public class AutorServiceImplements implements AutorService{

	
	@Autowired
	private AutorRepository autorRepository;
	
	@Override
	@Transactional
	public Iterable<Autor> findAll() {
		
		return autorRepository.findAll();
	}

	@Override
	@Transactional
	public Optional<Autor> findById(Integer id) {
		
		return autorRepository.findById(id);
	}

	@Override
	@Transactional
	public Autor save(Autor autor) {
		
		return autorRepository.save(autor);
	}

	@Override
	@Transactional
	public void DeleteById(Integer id) {
		autorRepository.deleteById(id);
		
	}

	
}
