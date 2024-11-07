package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Personadao;
import com.example.demo.entity.Persona;
import com.example.demo.service.Personaservice;
@Service
public class PersonaserviceImpl  implements Personaservice{
@Autowired
private Personadao dao;
	@Override
	public Persona create(Persona a) {
		// TODO Auto-generated method stub
		return  dao.create(a);
	}

	@Override
	public Persona update(Persona a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Persona> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
