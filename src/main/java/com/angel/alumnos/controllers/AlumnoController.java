package com.angel.alumnos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.angel.alumnos.models.AlumnoModel;
import com.angel.alumnos.services.AlumnoService;

@Controller
public class AlumnoController {

	@Autowired
	AlumnoService alumnoS;

	@GetMapping("/guardar")
	public String saveView(AlumnoModel alumno, Model model) {
		
		model.addAttribute("alumno", alumno);
		
		return "guardar";

	}
	
	@PostMapping("/guardar")
	public String save(AlumnoModel alumno, Model model) {
		
		model.addAttribute("alumno", alumno);
		
		alumnoS.save(alumno);
		
		return "redirect:/guardar";
		
	}

	/*
	@GetMapping("/find/{id}")
	public String findById(@PathVariable(name = "id") Long id) {

		return "Hola " + alumnoS.findById(id).getNombre();

	}*/

	@GetMapping("/index/{id}")
	public String deleteById(@PathVariable(name = "id") Long id, Model model) {

		alumnoS.deleteById(id);

		return "redirect:/index";

	}

	@GetMapping("/index")
	public String findAll(Model model) {

		model.addAttribute("alumnos", alumnoS.findAll());

		return "index";

	}
	
	@GetMapping("/editar/{id}")
	public String editarView(@PathVariable(name = "id") Long id , Model model) {

		AlumnoModel alumno1 = alumnoS.findById(id);
		
		model.addAttribute("alumno", alumno1);
		
		return "editar";
		
	}
	
	@PostMapping("/editar/{id}")
	public String editar(@PathVariable(name = "id") Long id ,AlumnoModel alumno) {

		alumnoS.save(alumno);

		return "redirect:/index";
		
	}

}
