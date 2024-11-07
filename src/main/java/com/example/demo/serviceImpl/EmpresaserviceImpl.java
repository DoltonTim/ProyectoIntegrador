package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Empresadao;
import com.example.demo.entity.Empresa;
import com.example.demo.service.Empresaservice;
@Service
public class EmpresaserviceImpl  implements Empresaservice{
@Autowired
private Empresadao dao;
	@Override
	public Empresa create(Empresa a) {
		// TODO Auto-generated method stub
		return  dao.create(a);
	}

	@Override
	public Empresa update(Empresa a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Empresa> read(Long id) {
		// TODO Auto-generated method stub
		return  dao.read(id);
	}

	@Override
	public List<Empresa> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	

}
