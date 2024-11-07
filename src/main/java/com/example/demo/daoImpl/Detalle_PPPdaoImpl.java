package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Detalle_PPPdao;
import com.example.demo.entity.Detalle_PPP;
import com.example.demo.repository.Detalle_PPPrepository;
@Component
public class Detalle_PPPdaoImpl implements Detalle_PPPdao {
@Autowired
private Detalle_PPPrepository repository;
	@Override
	public Detalle_PPP create(Detalle_PPP a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Detalle_PPP update(Detalle_PPP a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Detalle_PPP> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Detalle_PPP> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
