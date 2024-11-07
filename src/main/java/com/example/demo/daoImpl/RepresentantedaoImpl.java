package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Representantedao;
import com.example.demo.entity.Representante;
import com.example.demo.repository.Representanterepository;
@Component
public class RepresentantedaoImpl implements Representantedao{
@Autowired
private Representanterepository repository;
	@Override
	public Representante create(Representante a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Representante update(Representante a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Representante> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Representante> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
