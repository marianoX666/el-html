package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Editorial;
import com.example.demo.repository.EditorialRepository;

@Service
public class EditorialServiceImplements implements EditorialService {

	@Autowired
	private EditorialRepository editorialRepository;
	
	@Override
	@Transactional
	public Iterable<Editorial> findAll() {
		
		return editorialRepository.findAll();
	}

	@Override
	@Transactional
	public Optional<Editorial> findById(Integer id) {
		
		return editorialRepository.findById(id);
	}

	@Override
	@Transactional
	public Editorial save(Editorial editorial) {
		
		return editorialRepository.save(editorial);
	}

	@Override
	@Transactional
	public void DeleteById(Integer id) {
		editorialRepository.deleteById(id);
		
	}
	
	
}
