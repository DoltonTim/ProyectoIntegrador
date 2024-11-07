package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Representante;



public interface Representantedao {
	Representante create(Representante a);
	Representante  update(Representante a);
	void delete(Long id);
	Optional<Representante>read(Long id);
	List<Representante >readAll();
}
