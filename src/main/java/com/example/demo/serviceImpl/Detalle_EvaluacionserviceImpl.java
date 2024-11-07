package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Detalle_Evaluaciondao;
import com.example.demo.entity.Detalle_Evaluacion;
import com.example.demo.service.Detalle_Evaluacionservice;
@Service


public class Detalle_EvaluacionserviceImpl  implements Detalle_Evaluacionservice{
@Autowired
private Detalle_Evaluaciondao dao;
	@Override
	public Detalle_Evaluacion create(Detalle_Evaluacion a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Detalle_Evaluacion update(Detalle_Evaluacion a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Detalle_Evaluacion> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Detalle_Evaluacion> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
