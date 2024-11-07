package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Evaluaciondao;
import com.example.demo.entity.Evaluacion;
import com.example.demo.service.Evaluacionservice;
@Service
public class EvaluacionserviceImpl implements Evaluacionservice{
@Autowired
private Evaluaciondao dao;
	@Override
	public Evaluacion create(Evaluacion a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Evaluacion update(Evaluacion a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Evaluacion> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Evaluacion> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
}
