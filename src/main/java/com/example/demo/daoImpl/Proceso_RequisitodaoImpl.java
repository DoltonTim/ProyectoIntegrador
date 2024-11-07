package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Proceso_Requisitodao;
import com.example.demo.entity.Proceso_Requisito;
import com.example.demo.repository.Proceso_Requisitorepository;
@Component
public class Proceso_RequisitodaoImpl implements Proceso_Requisitodao {
@Autowired
private Proceso_Requisitorepository repository;
	@Override
	public Proceso_Requisito create(Proceso_Requisito a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Proceso_Requisito update(Proceso_Requisito a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Proceso_Requisito> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Proceso_Requisito> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
 