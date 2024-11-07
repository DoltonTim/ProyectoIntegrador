package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Plan_Carreradao;
import com.example.demo.entity.Plan_Carrera;
import com.example.demo.service.Plan_Carreraservice;
@Service
public class Plan_CarreraserviceImpl implements Plan_Carreraservice{
@Autowired
private Plan_Carreradao dao;
	@Override
	public Plan_Carrera create(Plan_Carrera a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Plan_Carrera update(Plan_Carrera a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Plan_Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Plan_Carrera> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
