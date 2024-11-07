package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Accesos;


public interface Accesosservice {
	Accesos create( Accesos a);
	Accesos update( Accesos a);
	void  delete(Long id);
	Optional< Accesos>read(Long id);
	List< Accesos>readAll();
}
