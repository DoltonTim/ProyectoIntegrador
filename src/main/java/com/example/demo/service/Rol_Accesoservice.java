package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Rol_Acceso;



public interface Rol_Accesoservice {
	Rol_Acceso create(Rol_Acceso a);
	Rol_Acceso update(Rol_Acceso a);
	void  delete(Long id);
	Optional<Rol_Acceso>read(Long id);
	List<Rol_Acceso>readAll();
}
