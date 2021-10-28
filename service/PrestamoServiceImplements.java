package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Prestamo;
import com.example.demo.repository.PrestamoRepository;

public class PrestamoServiceImplements implements PrestamoService {

	@Autowired
	private PrestamoRepository prestamoRepository;
	
	@Override
	@Transactional
	public Iterable<Prestamo> findAll() {
		
		return prestamoRepository.findAll();
	}

	@Override
	@Transactional
	public Optional<Prestamo> findById(Integer id) {
		
		return prestamoRepository.findById(id);
	}

	@Override
	@Transactional
	public Prestamo save(Prestamo prestamo) {
		
		return prestamoRepository.save(prestamo);
	}

	@Override
	@Transactional
	public void DeleteById(Integer id) {
		prestamoRepository.deleteById(id);
		
	}

}
