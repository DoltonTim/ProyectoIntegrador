package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Detalle_Evaluacion;



public interface  Detalle_Evaluacionservice {
	 Detalle_Evaluacion create( Detalle_Evaluacion a);
	 Detalle_Evaluacion update( Detalle_Evaluacion a);
	void  delete(Long id);
	Optional< Detalle_Evaluacion>read(Long id);
	List< Detalle_Evaluacion>readAll();
}