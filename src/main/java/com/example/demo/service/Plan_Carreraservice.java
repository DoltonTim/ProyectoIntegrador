package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Plan_Carrera;



public interface Plan_Carreraservice {
	Plan_Carrera create(Plan_Carrera a);
	Plan_Carrera update(Plan_Carrera a);
	void  delete(Long id);
	Optional<Plan_Carrera>read(Long id);
	List<Plan_Carrera>readAll();
}
