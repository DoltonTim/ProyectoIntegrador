package com.example.demo.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Accesosdao;
import com.example.demo.entity.Accesos;

import com.example.demo.service.Accesosservice;
@Service
public class AccesosserviceImpl implements Accesosservice{
@Autowired
private Accesosdao dao;
	@Override
	public Accesos create(Accesos a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Accesos update(Accesos a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Accesos> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Accesos> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
		
	
		

}
