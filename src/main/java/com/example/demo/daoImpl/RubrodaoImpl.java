package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Rubrodao;
import com.example.demo.entity.Rubro;
import com.example.demo.repository.Rubrorepository;
@Component
public class RubrodaoImpl implements Rubrodao {
@Autowired
private Rubrorepository repository;
	@Override
	public Rubro create(Rubro a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Rubro update(Rubro a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Rubro> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Rubro> readAll() {
		// TODO Auto-generated method stub
		return  repository.findAll();
	}

}
