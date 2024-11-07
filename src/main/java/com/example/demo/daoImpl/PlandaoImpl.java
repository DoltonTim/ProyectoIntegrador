package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Plandao;
import com.example.demo.entity.Plan;
import com.example.demo.repository.Planrepository;
@Component
public class PlandaoImpl implements Plandao{
@Autowired
private Planrepository repository;
	@Override
	public Plan create(Plan a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Plan update(Plan a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Plan> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Plan> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
