package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Detalle_Documento;



public interface Detalle_Documentoservice {
	Detalle_Documento create(Detalle_Documento a);
	Detalle_Documento update(Detalle_Documento a);
	void  delete(Long id);
	Optional<Detalle_Documento>read(Long id);
	List<Detalle_Documento>readAll();
}
