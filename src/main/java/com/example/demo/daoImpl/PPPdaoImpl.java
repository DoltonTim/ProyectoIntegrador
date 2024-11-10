package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.PPPdao;
import com.example.demo.entity.PPP;
import com.example.demo.repository.PPPrepository;
@Component
public class PPPdaoImpl implements PPPdao {
@Autowired
private PPPrepository repository;
	@Override
	public PPP create(PPP a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public PPP update(PPP a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<PPP> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<PPP> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
