package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PPPdao;
import com.example.demo.entity.PPP;

import com.example.demo.service.PPPservice;
@Service
public class PPPserviceImpl implements PPPservice{
@Autowired
private PPPdao dao;
	@Override
	public PPP create(PPP a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public PPP update(PPP a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<PPP> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<PPP> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
