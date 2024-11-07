package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Proceso_Requisitodao;
import com.example.demo.entity.Proceso_Requisito;
import com.example.demo.service.Proceso_Requisitoservice;

@Service
public class Proceso_RequisitoserviceImpl implements Proceso_Requisitoservice {
@Autowired
 private Proceso_Requisitodao dao;
	@Override
	public Proceso_Requisito create(Proceso_Requisito a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Proceso_Requisito update(Proceso_Requisito a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Proceso_Requisito> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Proceso_Requisito> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
