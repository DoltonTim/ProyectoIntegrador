package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Detalle_Documentodao;
import com.example.demo.entity.Detalle_Documento;
import com.example.demo.repository.Detalle_Documentorepository;
@Component
public class Detalle_DocumentodaoImpl implements Detalle_Documentodao{
@Autowired
private Detalle_Documentorepository repository;
	@Override
	public Detalle_Documento create(Detalle_Documento a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Detalle_Documento update(Detalle_Documento a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Detalle_Documento> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Detalle_Documento> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
