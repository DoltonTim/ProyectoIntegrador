package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Evaluacion;



public interface Evaluaciondao {
	Evaluacion create(Evaluacion a);
	Evaluacion  update(Evaluacion a);
	void delete(Long id);
	Optional<Evaluacion>read(Long id);
	List<Evaluacion >readAll();
}
