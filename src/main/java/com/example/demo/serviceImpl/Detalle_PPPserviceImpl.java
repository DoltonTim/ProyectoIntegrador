package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Detalle_PPPdao;
import com.example.demo.entity.Detalle_PPP;
import com.example.demo.service.Detalle_PPPservice;
@Service
public class Detalle_PPPserviceImpl implements Detalle_PPPservice{
@Autowired
private  Detalle_PPPdao dao;
	@Override
	public Detalle_PPP create(Detalle_PPP a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Detalle_PPP update(Detalle_PPP a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Detalle_PPP> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Detalle_PPP> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
