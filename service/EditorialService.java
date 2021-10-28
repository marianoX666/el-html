
package com.example.demo.service;


import java.util.Optional;

import com.example.demo.entity.Editorial;


public interface EditorialService {
    
    public Iterable<Editorial>findAll();
    public Optional<Editorial>findById(Integer id);
    public Editorial save(Editorial editorial);
    public void DeleteById(Integer id);
    
 

}
    

