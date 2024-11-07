package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Roldao;
import com.example.demo.entity.Rol;
import com.example.demo.repository.Rolrepository;
@Component
public class RoldaoImpl implements Roldao{
@Autowired
private Rolrepository repository;
	@Override
	public Rol create(Rol a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Rol update(Rol a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
