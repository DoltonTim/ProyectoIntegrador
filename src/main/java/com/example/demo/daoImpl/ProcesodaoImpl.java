package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Procesodao;
import com.example.demo.entity.Proceso;
import com.example.demo.repository.Procesorepository;
@Component
public class ProcesodaoImpl implements Procesodao{
@Autowired
private Procesorepository repository;
	@Override
	public Proceso create(Proceso a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Proceso update(Proceso a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Proceso> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Proceso> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
