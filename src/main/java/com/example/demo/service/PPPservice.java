package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.PPP;


public interface PPPservice {
	PPP create(PPP a);
	PPP update(PPP a);
	void  delete(Long id);
	Optional<PPP>read(Long id);
	List<PPP>readAll();
}