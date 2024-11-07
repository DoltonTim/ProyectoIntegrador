package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Proceso_Requisito;



public interface Proceso_Requisitodao {
	Proceso_Requisito create(Proceso_Requisito a);
	Proceso_Requisito  update(Proceso_Requisito a);
	void delete(Long id);
	Optional<Proceso_Requisito>read(Long id);
	List<Proceso_Requisito >readAll();
}
