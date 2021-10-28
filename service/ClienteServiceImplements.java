package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;

public class ClienteServiceImplements implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	@Transactional
	public Iterable<Cliente> findAll() {
		
		return clienteRepository.findAll();
	}

	@Override
	@Transactional
	public Optional<Cliente> findById(Integer id) {
		
		return clienteRepository.findById(id);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		
		return clienteRepository.save(cliente);
	}

	@Override
	@Transactional
	public void DeleteById(Integer id) {
		clienteRepository.deleteById(id);
		
	}
	
	

}
