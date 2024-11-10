package com.example.demo.serviceImpl; 

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Lineadao;
import com.example.demo.entity.Linea;
import com.example.demo.service.Lineaservice;

@Service
public class LineaserviceImpl implements Lineaservice{
@Autowired
private  Lineadao dao;
	@Override
	public Linea create(Linea a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Linea update(Linea a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Linea> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Linea> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
