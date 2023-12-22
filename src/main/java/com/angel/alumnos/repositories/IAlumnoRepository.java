package com.angel.alumnos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.angel.alumnos.models.AlumnoModel;

public interface IAlumnoRepository extends CrudRepository<AlumnoModel, Long>{

}
