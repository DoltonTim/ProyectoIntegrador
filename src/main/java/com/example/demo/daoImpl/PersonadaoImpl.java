package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Personadao;
import com.example.demo.entity.Persona;
import com.example.demo.repository.Personarepository;
@Component
public class PersonadaoImpl implements Personadao{
@Autowired
private Personarepository repository;
	@Override
	public Persona create(Persona a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Persona update(Persona a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Persona> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
