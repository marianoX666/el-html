
package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.Cliente;



public interface ClienteService {
    
    public Iterable<Cliente>findAll();
    public Optional<Cliente>findById(Integer id);
    public Cliente save(Cliente cliente);
    public void DeleteById(Integer id);
    
 

}
    

