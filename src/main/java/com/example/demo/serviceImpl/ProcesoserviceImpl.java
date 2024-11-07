package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Procesodao;
import com.example.demo.entity.Proceso;

import com.example.demo.service.Procesoservice;
@Service
public class ProcesoserviceImpl implements Procesoservice{
@Autowired
private Procesodao dao;

@Override
public Proceso create(Proceso a) {
	// TODO Auto-generated method stub
	return dao.create(a);
}

@Override
public Proceso update(Proceso a) {
	// TODO Auto-generated method stub
	return dao.update(a);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	dao.delete(id);
}

@Override
public Optional<Proceso> read(Long id) {
	// TODO Auto-generated method stub
	return dao.read(id);
}

@Override
public List<Proceso> readAll() {
	// TODO Auto-generated method stub
	return dao.readAll();
			
}


	
}
