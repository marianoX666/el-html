
package com.example.demo.service;


import java.util.Optional;

import com.example.demo.entity.Libros;


public interface LibrosService {
    
    public Iterable<Libros>findAll();
    public Optional<Libros>findById(Integer id);
    public Libros save(Libros libros);
    public void DeleteById(Integer id);
    
 

}
    

 