package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Usuario_Roldao;
import com.example.demo.entity.Usuario_Rol;
import com.example.demo.repository.Usuario_Rolrepository;

@Component

public class Usuario_RoldaoImpl implements Usuario_Roldao {
	@Autowired
	private Usuario_Rolrepository repository;

	@Override
	public Usuario_Rol create(Usuario_Rol a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Usuario_Rol update(Usuario_Rol a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {

		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Usuario_Rol> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Usuario_Rol> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
