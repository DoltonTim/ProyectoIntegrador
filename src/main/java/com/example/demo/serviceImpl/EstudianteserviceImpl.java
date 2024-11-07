package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Estudiantedao;
import com.example.demo.entity.Estudiante;
import com.example.demo.service.Estudianteservice;
@Service
public class EstudianteserviceImpl implements Estudianteservice {
@Autowired
private Estudiantedao dao;

	@Override
	public Estudiante create(Estudiante a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Estudiante update(Estudiante a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Estudiante> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Estudiante> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
