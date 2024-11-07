package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Evaluaciondao;
import com.example.demo.entity.Evaluacion;
import com.example.demo.repository.Evaluacionrepository;
@Component
public class EvaluaciondaoImpl implements Evaluaciondao {
@Autowired
private Evaluacionrepository repository;
	@Override
	public Evaluacion create(Evaluacion a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Evaluacion update(Evaluacion a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Evaluacion> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Evaluacion> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
