package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Usuariodao;
import com.example.demo.entity.Usuario;
import com.example.demo.service.Usuarioservice;
@Service
public class UsuarioserviceImpl implements Usuarioservice {
	   @Autowired
	   private Usuariodao dao;
	@Override
	public Usuario create(Usuario a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Usuario update(Usuario a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Usuario> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
