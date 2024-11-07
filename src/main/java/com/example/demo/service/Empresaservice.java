package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Empresa;



public interface Empresaservice {
	Empresa create(Empresa a);
	Empresa update(Empresa a);
	void  delete(Long id);
	Optional<Empresa>read(Long id);
	List<Empresa>readAll();
}
