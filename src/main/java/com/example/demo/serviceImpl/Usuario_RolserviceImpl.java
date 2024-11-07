package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Usuario_Roldao;
import com.example.demo.entity.Usuario_Rol;
import com.example.demo.service.Usuario_Rolservice;
@Service
public class Usuario_RolserviceImpl  implements Usuario_Rolservice{
@Autowired
private Usuario_Roldao dao;
	@Override
	public Usuario_Rol create(Usuario_Rol a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Usuario_Rol update(Usuario_Rol a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Usuario_Rol> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Usuario_Rol> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
