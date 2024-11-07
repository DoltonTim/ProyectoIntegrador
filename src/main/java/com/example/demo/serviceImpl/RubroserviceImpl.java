package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Rubrodao;
import com.example.demo.entity.Rubro;
import com.example.demo.service.Rubroservice;
@Service
public class RubroserviceImpl implements Rubroservice{
@Autowired
private Rubrodao dao;
	@Override
	public Rubro create(Rubro a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Rubro update(Rubro a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Rubro> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Rubro> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
