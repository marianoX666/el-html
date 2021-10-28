
 
package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.Autor;

public interface AutorService {
    
    public Iterable<Autor>findAll();
    public Optional<Autor>findById(Integer id);
    public Autor save(Autor autor);
    public void DeleteById(Integer id);
    
 

}
