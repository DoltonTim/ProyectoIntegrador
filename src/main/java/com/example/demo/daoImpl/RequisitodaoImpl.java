package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Requisitodao;
import com.example.demo.entity.Requisito;
import com.example.demo.repository.Requisitorepository;
@Component
public class RequisitodaoImpl implements Requisitodao {
@Autowired
private Requisitorepository repository;
	@Override
	public Requisito create(Requisito a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Requisito update(Requisito a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Requisito> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Requisito> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
