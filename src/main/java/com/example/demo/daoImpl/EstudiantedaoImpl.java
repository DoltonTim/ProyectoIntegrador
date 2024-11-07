package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Estudiantedao;
import com.example.demo.entity.Estudiante;
import com.example.demo.repository.Estudianterepository;
@Component
public class EstudiantedaoImpl implements Estudiantedao {
@Autowired
private Estudianterepository repository;
	@Override
	public Estudiante create(Estudiante a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Estudiante update(Estudiante a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Estudiante> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Estudiante> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
