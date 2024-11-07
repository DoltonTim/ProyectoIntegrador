package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Matriculadao;
import com.example.demo.entity.Matricula;
import com.example.demo.repository.Matricularepository;
@Component
public class MatriculadaoImpl implements Matriculadao{
@Autowired
private Matricularepository repository;
	@Override
	public Matricula create(Matricula a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Matricula update(Matricula a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return  repository.findAll();
	}

}
