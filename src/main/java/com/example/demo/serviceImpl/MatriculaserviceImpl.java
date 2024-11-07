package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Matriculadao;
import com.example.demo.entity.Matricula;
import com.example.demo.service.Matriculaservice;
@Service
public class MatriculaserviceImpl implements Matriculaservice {
@Autowired
private  Matriculadao dao;
	@Override
	public Matricula create(Matricula a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Matricula update(Matricula a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return  dao.read(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
