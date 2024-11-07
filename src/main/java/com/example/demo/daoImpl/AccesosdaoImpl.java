package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Accesosdao;
import com.example.demo.entity.Accesos;
import com.example.demo.repository.Accesosrepository;
@Component
public class AccesosdaoImpl implements Accesosdao{
@Autowired
private Accesosrepository repository;
	@Override
	public Accesos create(Accesos a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Accesos update(Accesos a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Accesos> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Accesos> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
