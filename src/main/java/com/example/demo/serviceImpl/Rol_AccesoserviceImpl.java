package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Rol_Accesodao;
import com.example.demo.entity.Rol_Acceso;
import com.example.demo.service.Rol_Accesoservice;
@Service

public class Rol_AccesoserviceImpl implements Rol_Accesoservice{
@Autowired
private Rol_Accesodao dao;
	@Override
	public Rol_Acceso create(Rol_Acceso a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Rol_Acceso update(Rol_Acceso a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Rol_Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Rol_Acceso> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
