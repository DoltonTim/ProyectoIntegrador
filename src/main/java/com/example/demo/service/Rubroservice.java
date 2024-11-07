package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Rubro;


public interface Rubroservice {
	Rubro create(Rubro a);
	Rubro update(Rubro a);
	void  delete(Long id);
	Optional<Rubro>read(Long id);
	List<Rubro>readAll();

}
