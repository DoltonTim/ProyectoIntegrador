package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Detalle_Documentodao;
import com.example.demo.entity.Detalle_Documento;
import com.example.demo.service.Detalle_Documentoservice;
@Service
public class Detalle_DocumentoserviceImpl  implements Detalle_Documentoservice{
@Autowired
private  Detalle_Documentodao dao;
	@Override
	public Detalle_Documento create(Detalle_Documento a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Detalle_Documento update(Detalle_Documento a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Detalle_Documento> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Detalle_Documento> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
