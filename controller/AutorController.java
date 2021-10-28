package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Autor;
import com.example.demo.service.AutorService;

@Controller
@RequestMapping("/Autor")
public class AutorController {

	@Autowired
	private AutorService autorService;
	
	@PostMapping("/Autor")
	public String crearAutor(ModelMap modelo) {
		
	Autor autor=new Autor();
	modelo.addAttribute("autor", autor);
		
		return "Autor.html";
		
	}
	@GetMapping("/")
	 public String home (Model model) {
		 
		 model.addAttribute("autors", autorService.findAll());
		 return "Autor.html";
		 
	 }
	 
	@PostMapping("/Autor")
	 
	public String saveAutor(@ModelAttribute("Autor") Autor autor) {
		
		autorService.save(autor);
		return "Autor.html";
	}
}
