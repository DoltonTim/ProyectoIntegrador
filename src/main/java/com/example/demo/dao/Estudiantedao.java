package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Estudiante;



public interface Estudiantedao {
	Estudiante create(Estudiante a);
	Estudiante  update(Estudiante a);
	void delete(Long id);
	Optional<Estudiante>read(Long id);
	List<Estudiante >readAll();
}
