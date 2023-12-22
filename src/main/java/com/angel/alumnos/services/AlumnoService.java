package com.angel.alumnos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angel.alumnos.models.AlumnoModel;
import com.angel.alumnos.repositories.IAlumnoRepository;

@Service
public class AlumnoService implements IAlumnoService{
	
	@Autowired
	IAlumnoRepository alumnoR;

	@Override
	public void save(AlumnoModel alumno) {
		
		alumnoR.save(alumno);
		
	}

	@Override
	public void deleteById(Long id) {
		
		alumnoR.deleteById(id);
		
	}

	@Override
	public AlumnoModel findById(Long id) {
		
		return alumnoR.findById(id).orElse(null);
		
	}

	@Override
	public List<AlumnoModel> findAll() {
		
		return (List<AlumnoModel>) alumnoR.findAll();
		
	}


	@Override
	public void update(Long id, String nombre, AlumnoModel alumno) {
		// TODO Auto-generated method stub
		
	}

	
	
}
