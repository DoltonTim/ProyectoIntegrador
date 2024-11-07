package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Rubro;



public interface Rubrodao {
	Rubro create(Rubro a);
	Rubro  update(Rubro a);
	void delete(Long id);
	Optional<Rubro>read(Long id);
	List<Rubro >readAll();
}

