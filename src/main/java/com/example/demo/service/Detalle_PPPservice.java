package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Detalle_PPP;



public interface Detalle_PPPservice {
	Detalle_PPP create(Detalle_PPP a);
	Detalle_PPP update(Detalle_PPP a);
	void  delete(Long id);
	Optional<Detalle_PPP>read(Long id);
	List<Detalle_PPP>readAll();
}
