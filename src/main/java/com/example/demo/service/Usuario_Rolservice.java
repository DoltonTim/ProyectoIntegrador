package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Usuario_Rol;

public interface Usuario_Rolservice {
	Usuario_Rol create(Usuario_Rol a);
	Usuario_Rol update(Usuario_Rol a);
	void  delete(Long id);
	Optional<Usuario_Rol>read(Long id);
	List<Usuario_Rol>readAll();
}
