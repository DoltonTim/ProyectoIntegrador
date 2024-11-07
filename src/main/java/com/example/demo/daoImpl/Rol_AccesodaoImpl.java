package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Rol_Accesodao;
import com.example.demo.entity.Rol_Acceso;
import com.example.demo.repository.Rol_Accesorepository;
@Component
public class Rol_AccesodaoImpl implements Rol_Accesodao {
@Autowired
private Rol_Accesorepository repository;
	@Override
	public Rol_Acceso create(Rol_Acceso a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Rol_Acceso update(Rol_Acceso a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Rol_Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Rol_Acceso> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
