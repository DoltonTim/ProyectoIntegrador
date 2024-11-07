package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Requisito;



public interface Requisitodao {
	Requisito create(Requisito a);
	Requisito  update(Requisito a);
	void delete(Long id);
	Optional<Requisito>read(Long id);
	List<Requisito >readAll();
}

