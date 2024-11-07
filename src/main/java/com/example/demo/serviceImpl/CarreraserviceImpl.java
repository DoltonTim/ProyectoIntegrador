package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Carreradao;
import com.example.demo.entity.Carrera;
import com.example.demo.service.Carreraservice;
@Service
public class CarreraserviceImpl implements Carreraservice{
@Autowired
	   private Carreradao dao;
	  @Override
	public Carrera create(Carrera a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Carrera update(Carrera a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
