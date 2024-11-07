package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Plandao;
import com.example.demo.entity.Plan;
import com.example.demo.service.Planservice;
@Service
public class PlanserviceImpl implements Planservice {
@Autowired
private Plandao dao;
	@Override
	public Plan create(Plan a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Plan update(Plan a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Plan> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Plan> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll()
				;
	}

}
