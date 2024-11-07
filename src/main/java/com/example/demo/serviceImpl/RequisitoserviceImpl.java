package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Requisitodao;
import com.example.demo.entity.Requisito;
import com.example.demo.service.Requisitoservice;
@Service
public class RequisitoserviceImpl  implements Requisitoservice{
@Autowired
private Requisitodao dao;
	@Override
	public Requisito create(Requisito a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Requisito update(Requisito a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Requisito> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Requisito> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
