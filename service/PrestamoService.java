
package com.example.demo.service;


import java.util.Optional;

import com.example.demo.entity.Prestamo;



public interface PrestamoService {
    
    public Iterable<Prestamo>findAll();
    public Optional<Prestamo>findById(Integer id);
    public Prestamo save(Prestamo prestamo);
    public void DeleteById(Integer id);
    
 

}
