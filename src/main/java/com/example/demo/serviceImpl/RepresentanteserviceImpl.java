package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Representantedao;
import com.example.demo.entity.Representante;
import com.example.demo.service.Representanteservice;
@Service
public class RepresentanteserviceImpl implements Representanteservice {
@Autowired
private Representantedao dao;
	@Override
	public Representante create(Representante a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Representante update(Representante a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
	dao.delete(id);
	}

	@Override
	public Optional<Representante> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Representante> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
