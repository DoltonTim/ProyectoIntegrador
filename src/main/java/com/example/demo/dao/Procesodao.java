package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Proceso;



public interface Procesodao {
	Proceso create(Proceso a);
	Proceso  update(Proceso a);
	void delete(Long id);
	Optional<Proceso>read(Long id);
	List<Proceso >readAll();
}
