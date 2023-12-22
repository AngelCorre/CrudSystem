package com.angel.alumnos.services;

import java.util.List;
import java.util.Optional;

import com.angel.alumnos.models.AlumnoModel;

public interface IAlumnoService {
	
	public void save(AlumnoModel alumno);
	
	public void deleteById(Long id);
	
	public AlumnoModel findById(Long id);
	
	public List<AlumnoModel> findAll();
	
	public void update(Long id, String nombre, AlumnoModel alumno);
	

}
